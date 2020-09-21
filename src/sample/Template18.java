package sample;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Template18 extends Template {

    public Color[] slot;
    public Color[] frame;
    public Color fill;

    public Template18(BufferedImage template) {
        slot = new Color[68];
        for (int x = 0; x < 18; x++) {
            slot[x] = getColor(template, x, 0);
        }
        for (int y = 1; y < 17; y++) {
            slot[17 + y] = getColor(template, 0, y);
            slot[33 + y] = getColor(template, 17, y);
        }
        for (int x = 0; x < 18; x++) {
            slot[49 + x] = getColor(template, x, 17);
        }

        frame = new Color[6];

        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 3; x++) {
                frame[y * 3 + x] = getColor(template, 13 + x, 2 + y);
            }
        }

        fill = getColor(template, 11, 2);
    }

    public void drawSlot(BufferedImage img, int pos_x, int pos_y) {
        for (int x = 0; x < 18; x++) {
            img.setRGB(pos_x + x, pos_y + 0, slot[x].getRGB());
        }
        for (int y = 1; y < 17; y++) {
            img.setRGB(pos_x + 0, pos_y + y, slot[17 + y].getRGB());
            img.setRGB(pos_x + 17, pos_y + y, slot[33 + y].getRGB());
        }
        for (int x = 0; x < 18; x++) {
            img.setRGB(pos_x + x, pos_y + 17, slot[49 + x].getRGB());
        }
    }

    public void drawSlotMatrix(BufferedImage img, int pos_x, int pos_y, int width, int height) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                drawSlot(img, pos_x + x * 18, pos_y + y * 18);
            }
        }
    }

    public void drawInventory(BufferedImage img, int pos_x, int pos_y) {
        drawSlotMatrix(img, pos_x, pos_y, 9, 3);
        drawSlotMatrix(img, pos_x, pos_y + 58, 9, 1);
    }

    /*
     * Always draws downwards or rightwards
     * Position anchor is always the top-left pixel
     */
    public void drawFrameEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length) {
        Graphics2D g2d = img.createGraphics();
        Color[] pixel = new Color[2];
        // pixel 0 is the outer pixel
        // n is the left vertical
        // w is the bottom horizontal
        pixel[0] = frame[2];
        pixel[1] = frame[5];
        switch (direction) {
            case 'n':
                g2d.setColor(pixel[0]);
                g2d.fillRect(pos_x, pos_y, 1, length);
                g2d.setColor(pixel[1]);
                g2d.fillRect(pos_x + 1, pos_y, 1, length);
                g2d.dispose();
                break;
            case 'w':
                g2d.setColor(pixel[0]);
                g2d.fillRect(pos_x, pos_y + 1, length, 1);
                g2d.setColor(pixel[1]);
                g2d.fillRect(pos_x, pos_y, length, 1);
                g2d.dispose();
                break;
            case 's':
                g2d.setColor(pixel[1]);
                g2d.fillRect(pos_x, pos_y, 1, length);
                g2d.setColor(pixel[0]);
                g2d.fillRect(pos_x + 1, pos_y, 1, length);
                g2d.dispose();
                break;
            case 'e':
                g2d.setColor(pixel[1]);
                g2d.fillRect(pos_x, pos_y + 1, length, 1);
                g2d.setColor(pixel[0]);
                g2d.fillRect(pos_x, pos_y, length, 1);
                g2d.dispose();
                break;
        }
    }

    /*
     * corners: 0 1
     *          2 3
     */
    public void drawFrameCorner(BufferedImage img, int pos_x, int pos_y, int corner) {
        Color[] pixel = new Color[4];
        pixel[0] = frame[0];
        pixel[1] = frame[1];
        pixel[2] = frame[3];
        pixel[3] = frame[4];
        switch (corner) {
            case 0:
                img.setRGB(pos_x, pos_y, pixel[0].getRGB());
                img.setRGB(pos_x + 1, pos_y, pixel[1].getRGB());
                img.setRGB(pos_x, pos_y + 1, pixel[2].getRGB());
                img.setRGB(pos_x + 1, pos_y + 1, pixel[3].getRGB());
                break;
            case 1:
                img.setRGB(pos_x, pos_y, pixel[1].getRGB());
                img.setRGB(pos_x + 1, pos_y, pixel[0].getRGB());
                img.setRGB(pos_x, pos_y + 1, pixel[3].getRGB());
                img.setRGB(pos_x + 1, pos_y + 1, pixel[2].getRGB());
                break;
            case 2:
                img.setRGB(pos_x, pos_y, pixel[2].getRGB());
                img.setRGB(pos_x + 1, pos_y, pixel[3].getRGB());
                img.setRGB(pos_x, pos_y + 1, pixel[0].getRGB());
                img.setRGB(pos_x + 1, pos_y + 1, pixel[1].getRGB());
                break;
            case 3:
                img.setRGB(pos_x, pos_y, pixel[3].getRGB());
                img.setRGB(pos_x + 1, pos_y, pixel[2].getRGB());
                img.setRGB(pos_x, pos_y + 1, pixel[1].getRGB());
                img.setRGB(pos_x + 1, pos_y + 1, pixel[0].getRGB());
                break;
        }
    }

    public void drawFrame(BufferedImage img, int pos_x, int pos_y, int width, int height) {
        width -= 4;
        height -= 4;
        drawFrameCorner(img, pos_x, pos_y, 0);
        drawFrameEdge(img, pos_x + 2, pos_y, 'e', width);
        drawFrameCorner(img, pos_x + width + 2, pos_y, 1);
        drawFrameEdge(img, pos_x + width + 2, pos_y + 2, 's', height);
        drawFrameCorner(img, pos_x + width + 2, pos_y + height + 2, 3);

        drawFrameEdge(img, pos_x, pos_y + 2, 'n', height);
        drawFrameCorner(img, pos_x, pos_y + height + 2, 2);
        drawFrameEdge(img, pos_x + 2, pos_y + height + 2, 'w', width);
    }

    @Override
    void drawDynamicSlotEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length) {

    }

    @Override
    void drawDynamicSlotCorner(BufferedImage img, int pos_x, int pos_y, int corner) {

    }

    @Override
    void drawDynamicSlot(BufferedImage img, int pos_x, int pos_y, int width, int height, BufferedImage background) {

    }

    @Override
    void draw(BufferedImage img, BufferedImage obj, AffineTransform at) {

    }
}