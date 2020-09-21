package sample;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

abstract class Template {
    public Color getColor(BufferedImage img, int x, int y) {
        return new Color(img.getRGB(x, y));
    }

    abstract void drawSlot(BufferedImage img, int pos_x, int pos_y);
    abstract void drawSlotMatrix(BufferedImage img, int pos_x, int pos_y, int width, int height);
    abstract void drawInventory(BufferedImage img, int pos_x, int pos_y);
    abstract void drawFrameEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length);
    abstract void drawFrameCorner(BufferedImage img, int pos_x, int pos_y, int corner);
    abstract void drawFrame(BufferedImage img, int pos_x, int pos_y, int width, int height);
    abstract void drawDynamicSlotEdge(BufferedImage img, int pos_x, int pos_y, char direction, int length);
    abstract void drawDynamicSlotCorner(BufferedImage img, int pos_x, int pos_y, int corner);
    abstract void drawDynamicSlot(BufferedImage img, int pos_x, int pos_y, int width, int height, BufferedImage background);
    abstract void draw(BufferedImage img, BufferedImage obj, AffineTransform at);
}