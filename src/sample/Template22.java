package sample;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Template22 extends Template {

    public BufferedImage slot;
    public BufferedImage frameCorner;
    public BufferedImage frameEdge;
    public Color fill;

    public Template22(BufferedImage template) {
        slot = template.getSubimage(0, 0, 18, 18);
        frameCorner = template.getSubimage(19, 0, 2, 2);
        frameEdge = template.getSubimage(21, 0, 1, 2);
        fill = getColor(template, 21, 3);
    }

    @Override
    void drawSlot(BufferedImage img, int pos_x, int pos_y) {
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(slot, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, (float) pos_x, (float) pos_y), null);
        g2d.dispose();
    }

    @Override
    void drawSlotMatrix(BufferedImage img, int pos_x, int pos_y, int width, int height) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                drawSlot(img, pos_x + x * slot.getWidth(), pos_y + y * slot.getHeight());
            }
        }
    }

    @Override
    void drawInventory(BufferedImage img, int pos_x, int pos_y) {
        drawSlotMatrix(img, pos_x, pos_y, 9, 3);
        drawSlotMatrix(img, pos_x, pos_y + 58, 9, 1);
    }

    /*
     * Always draws downwards or rightwards
     * Position anchor is always the top-left pixel
     *
     * NO ROTATION: JUST MAKE 4 CORNERS
     */
    @Override
    void drawFrameEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length) {
        Graphics2D g2d = img.createGraphics();
        AffineTransform at = new AffineTransform();
        // n is the left vertical
        // w is the bottom horizontal
        switch (direction) {
            case 'n':
                at.rotate(90);
                at.scale(1.0d, (double) length);
                break;
            case 'w':
                at.scale(1.0d, -1.0d);
                break;
            case 's':
                at.rotate(90);
                at.scale(-1.0d, 1.0d);
                break;
            case 'e':
                break;
        }
        at.translate(pos_x, pos_y);
        g2d.drawImage(slot, at, null);
        g2d.dispose();
    }

    @Override
    void drawFrameCorner(BufferedImage img, int pos_x, int pos_y, int corner) {

    }

    @Override
    void drawFrame(BufferedImage img, int pos_x, int pos_y, int width, int height) {

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

    // returns the amount the image has to move on each axis
    public int[] rotateHelper(BufferedImage img, int degrees, int pos_x, int pos_y) {
        int trans_x = 0;
        int trans_y = 0;
        if (degrees == 90) {
            trans_x = -pos_y + img.getWidth();
            trans_y = pos_x + img.getHeight();
        }
        return new int[] {trans_x, -trans_y};
    }
}
