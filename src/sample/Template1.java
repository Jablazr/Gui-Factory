package sample;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/** Copied from AffineTransform.java
 *
 * Constructs a new <code>AffineTransform</code> from 6 floating point
 * values representing the 6 specifiable entries of the 3x3
 * transformation matrix.
 *
 *      [ x']   [  m00  m01  m02  ] [ x ]   [ m00x + m01y + m02 ]
 *      [ y'] = [  m10  m11  m12  ] [ y ] = [ m10x + m11y + m12 ]
 *      [ 1 ]   [   0    0    1   ] [ 1 ]   [         1         ]
 *
 * param m00 the X coordinate scaling element of the 3x3 matrix
 * param m10 the Y coordinate shearing element of the 3x3 matrix
 * param m01 the X coordinate shearing element of the 3x3 matrix
 * param m11 the Y coordinate scaling element of the 3x3 matrix
 * param m02 the X coordinate translation element of the 3x3 matrix
 * param m12 the Y coordinate translation element of the 3x3 matrix
 * since 1.2
 */

public class Template1 extends Template {

    public BufferedImage slot;
    public BufferedImage bigSlot;

    // 1 2
    // 3 4
    public BufferedImage dynamicSlotCorner1;
    public BufferedImage dynamicSlotCorner2;
    public BufferedImage dynamicSlotCorner3;
    public BufferedImage dynamicSlotCorner4;

    //   2
    // 1   4
    //   3
    public BufferedImage dynamicSlotEdge1;
    public BufferedImage dynamicSlotEdge2;
    public BufferedImage dynamicSlotEdge3;
    public BufferedImage dynamicSlotEdge4;

    // 1 2
    // 3 4
    public BufferedImage frameCorner1;
    public BufferedImage frameCorner2;
    public BufferedImage frameCorner3;
    public BufferedImage frameCorner4;

    //   2
    // 1   4
    //   3
    public BufferedImage frameEdge1;
    public BufferedImage frameEdge2;
    public BufferedImage frameEdge3;
    public BufferedImage frameEdge4;

    public BufferedImage anvilRename;
    public BufferedImage anvilRed;
    public BufferedImage anvilHammer;

    public BufferedImage inventoryEffects;
    public BufferedImage inventoryEffectFrame;
    public BufferedImage inventoryArrow;

    public BufferedImage enchantingCost;
    public BufferedImage enchantSelection;
    public BufferedImage enchantList;
    public BufferedImage lapisSlot;

    public BufferedImage brewingProgress;
    public BufferedImage brewingInterface;

    public BufferedImage arrowCrossed;
    public BufferedImage arrow;
    public BufferedImage arrowFilled;
    public BufferedImage plus;

    public BufferedImage slotBackground1;
    public BufferedImage slotBackground2;
    public BufferedImage dynamicBackground;
    public BufferedImage background;

    public BufferedImage furnaceStatus;
    public BufferedImage furnaceProgress;

    public BufferedImage saddleSlot;
    public BufferedImage horseArmorSlot;

    public BufferedImage villagerButtons;

    public BufferedImage beaconInterface;
    public BufferedImage beaconSeparator;
    public BufferedImage beaconButtons;


    public Template1(BufferedImage template) {
        slot = template.getSubimage(7, 8, 18, 18);
        bigSlot = template.getSubimage(177, 0, 26, 26);
        dynamicSlotCorner1 = template.getSubimage(148, 106, 1, 1);
        dynamicSlotCorner2 = template.getSubimage(165, 106, 1, 1);
        dynamicSlotCorner3 = template.getSubimage(148, 123, 1, 1);
        dynamicSlotCorner4 = template.getSubimage(165, 123, 1, 1);
        dynamicSlotEdge1 = template.getSubimage(148, 107, 1, 1);
        dynamicSlotEdge2 = template.getSubimage(149, 106, 1, 1);
        dynamicSlotEdge3 = template.getSubimage(164, 123, 1, 1);
        dynamicSlotEdge4 = template.getSubimage(165, 122, 1, 1);
        frameCorner1 = template.getSubimage(0, 0, 4, 4);
        frameCorner2 = template.getSubimage(172, 0, 4, 4);
        frameCorner3 = template.getSubimage(0, 87, 4, 4);
        frameCorner4 = template.getSubimage(172, 87, 4, 4);
        frameEdge1 = template.getSubimage(0, 4, 4, 1);
        frameEdge2 = template.getSubimage(4, 0, 1, 4);
        frameEdge3 = template.getSubimage(171, 87, 1, 4);
        frameEdge4 = template.getSubimage(172, 86, 4, 1);
        anvilRename = template.getSubimage(0, 92, 110, 32);
        anvilRed = template.getSubimage(0, 125, 110, 16);
        anvilHammer = template.getSubimage(177, 27, 30, 30);
        inventoryEffects = template.getSubimage(0, 175, 143, 54);
        inventoryEffectFrame = template.getSubimage(0, 142, 120, 32);
        inventoryArrow = template.getSubimage(148, 92, 16, 13);
        enchantingCost = template.getSubimage(0, 230, 44, 26);
        enchantSelection = template.getSubimage(144, 139, 108, 57);
        enchantList = template.getSubimage(144, 197, 110, 59);
        lapisSlot = template.getSubimage(177, 114, 18, 18);
        brewingProgress = template.getSubimage(208, 27, 21, 29);
        brewingInterface = template.getSubimage(177, 58, 64, 55);
        arrowCrossed = template.getSubimage(228, 0, 28, 21);
        arrow = template.getSubimage(232, 22, 24, 17);
        arrowFilled = template.getSubimage(232, 40, 24, 17);
        plus = template.getSubimage(204, 0, 13, 13);
        slotBackground1 = template.getSubimage(224, 0, 1, 1);
        slotBackground2 = template.getSubimage(224, 4, 1, 1);
        dynamicBackground = template.getSubimage(224, 8, 1, 1);
        background = template.getSubimage(219, 1, 1, 1);
        furnaceStatus = template.getSubimage(242, 58, 14, 14);
        furnaceProgress = template.getSubimage(242, 73, 14, 14);
        saddleSlot = template.getSubimage(196, 114, 18, 18);
        horseArmorSlot = template.getSubimage(215, 114, 18, 18);
        villagerButtons = template.getSubimage(111, 92, 36, 38);
        beaconInterface = template.getSubimage(257, 0, 216, 97);
        beaconSeparator = template.getSubimage(257, 98, 18, 18);
        beaconButtons = template.getSubimage(276, 98, 131, 22);
    }

    @Override
    void drawSlot(BufferedImage img, int pos_x, int pos_y) {
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(slot, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
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
     * n is the left vertical
     * e is the top horizontal
     */
    @Override
    void drawFrameEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length) {
        Graphics2D g2d = img.createGraphics();
        switch (direction) {
            case 'n':
                g2d.drawImage(frameEdge1, new AffineTransform(1, 0, 0, length, pos_x, pos_y), null);
                break;
            case 'e':
                g2d.drawImage(frameEdge2, new AffineTransform(length, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 's':
                g2d.drawImage(frameEdge4, new AffineTransform(1, 0, 0, length, pos_x, pos_y), null);
                break;
            case 'w':
                g2d.drawImage(frameEdge3, new AffineTransform(length, 0, 0, 1, pos_x, pos_y), null);
                break;
        }
        g2d.dispose();
    }

    @Override
    void drawFrameCorner(BufferedImage img, int pos_x, int pos_y, int corner) {
        Graphics2D g2d = img.createGraphics();
        switch (corner) {
            case 1:
                g2d.drawImage(frameCorner1, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 2:
                g2d.drawImage(frameCorner2, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 3:
                g2d.drawImage(frameCorner3, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 4:
                g2d.drawImage(frameCorner4, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
        }
        g2d.dispose();
    }

    @Override
    void drawFrame(BufferedImage img, int pos_x, int pos_y, int width, int height) {
        // the minimum width is the width of both corners of an edge
        int minWidth = frameCorner1.getWidth() * 2;
        int minHeight = frameCorner1.getHeight() * 2;

        // discount the width of both edge corners when calculating the edge width
        // width is only relevant for the edges and position calculation
        width = Math.max(width, minWidth) - minWidth;
        height = Math.max(height, minHeight) - minHeight;

        drawFrameCorner(img, pos_x, pos_y, 1);
        drawFrameEdge(img, pos_x + frameCorner1.getWidth(), pos_y, 'e', width);
        drawFrameCorner(img, pos_x + frameCorner1.getWidth() + width, pos_y, 2);

        drawFrameEdge(img, pos_x + frameCorner1.getWidth() + width, pos_y + frameCorner1.getHeight(), 's', height);
        drawFrameCorner(img, pos_x + frameCorner1.getWidth() + width, pos_y + frameCorner1.getHeight() + height, 4);

        drawFrameEdge(img, pos_x, pos_y + frameCorner1.getHeight(), 'n', height);
        drawFrameCorner(img, pos_x, pos_y + frameCorner1.getHeight() + height, 3);

        drawFrameEdge(img, pos_x + frameCorner1.getWidth(), pos_y + frameCorner1.getHeight() + height, 'w', width);

        draw(img, background, new AffineTransform(width, 0, 0, height, pos_x + frameCorner1.getWidth(), pos_y + frameCorner1.getHeight()));
    }

    /*
     * Always draws downwards or rightwards
     * Position anchor is always the top-left pixel
     * n is the left vertical
     * e is the top horizontal
     */
    @Override
    void drawDynamicSlotEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length) {
        Graphics2D g2d = img.createGraphics();
        switch (direction) {
            case 'n':
                g2d.drawImage(dynamicSlotEdge1, new AffineTransform(1, 0, 0, length, pos_x, pos_y), null);
                break;
            case 'e':
                g2d.drawImage(dynamicSlotEdge2, new AffineTransform(length, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 's':
                g2d.drawImage(dynamicSlotEdge4, new AffineTransform(1, 0, 0, length, pos_x, pos_y), null);
                break;
            case 'w':
                g2d.drawImage(dynamicSlotEdge3, new AffineTransform(length, 0, 0, 1, pos_x, pos_y), null);
                break;
        }
        g2d.dispose();
    }

    @Override
    void drawDynamicSlotCorner(BufferedImage img, int pos_x, int pos_y, int corner) {
        Graphics2D g2d = img.createGraphics();
        switch (corner) {
            case 1:
                g2d.drawImage(dynamicSlotCorner1, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 2:
                g2d.drawImage(dynamicSlotCorner2, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 3:
                g2d.drawImage(dynamicSlotCorner3, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
            case 4:
                g2d.drawImage(dynamicSlotCorner4, new AffineTransform(1, 0, 0, 1, pos_x, pos_y), null);
                break;
        }
        g2d.dispose();
    }

    @Override
    void drawDynamicSlot(BufferedImage img, int pos_x, int pos_y, int width, int height, BufferedImage background) {
        // the minimum width is the width of both corners of an edge
        int minWidth = dynamicSlotCorner1.getWidth() * 2;
        int minHeight = dynamicSlotCorner1.getHeight() * 2;

        // discount the width of both edge corners when calculating the edge width
        // width is only relevant for the edges and position calculation
        width = Math.max(width, minWidth) - minWidth;
        height = Math.max(height, minHeight) - minHeight;

        drawDynamicSlotCorner(img, pos_x, pos_y, 1);
        drawDynamicSlotEdge(img, pos_x + dynamicSlotCorner1.getWidth(), pos_y, 'e', width);
        drawDynamicSlotCorner(img, pos_x + dynamicSlotCorner1.getWidth() + width, pos_y, 2);

        drawDynamicSlotEdge(img, pos_x + dynamicSlotCorner1.getWidth() + width, pos_y + dynamicSlotCorner1.getHeight(), 's', height);
        drawDynamicSlotCorner(img, pos_x + dynamicSlotCorner1.getWidth() + width, pos_y + dynamicSlotCorner1.getHeight() + height, 4);

        drawDynamicSlotEdge(img, pos_x, pos_y + dynamicSlotCorner1.getHeight(), 'n', height);
        drawDynamicSlotCorner(img, pos_x, pos_y + dynamicSlotCorner1.getHeight() + height, 3);

        drawDynamicSlotEdge(img, pos_x + dynamicSlotCorner1.getWidth(), pos_y + dynamicSlotCorner1.getHeight() + height, 'w', width);

        draw(img, background, new AffineTransform(width, 0, 0, height, pos_x + dynamicSlotCorner1.getWidth(), pos_y + dynamicSlotCorner1.getHeight()));
    }

    public void draw(BufferedImage img, BufferedImage obj, AffineTransform at) {
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(obj, at, null);
        g2d.dispose();
    }
}