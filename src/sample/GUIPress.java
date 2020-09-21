package sample;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class GUIPress {
    Template1 template;

    public GUIPress(Template1 template) {
        this.template = template;
    }

    public void makeDispenser(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlotMatrix(img, 61, 16, 3, 3);
        template.drawInventory(img, 7, 83);
    }

    public void makeGeneric_54(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 222);
        template.drawSlotMatrix(img, 7, 17, 9, 6);
        template.drawInventory(img, 7, 139);
    }

    public void makeHopper(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 133);
        template.drawSlotMatrix(img, 43, 19, 5, 1);
        template.drawInventory(img, 7, 50);
    }

    public void makeCrafting_table(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlotMatrix(img, 29, 16, 3, 3);
        template.draw(img, template.arrow, new AffineTransform(1, 0, 0, 1, 89, 34));
        template.draw(img, template.bigSlot, new AffineTransform(1, 0, 0, 1, 119, 30));
        template.drawInventory(img, 7, 83);
    }

    public void makeFurnace(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlot(img, 55, 16);
        template.drawSlot(img, 55, 52);
        template.draw(img, template.furnaceStatus, new AffineTransform(1, 0, 0, 1, 56, 36));
        template.draw(img, template.arrow, new AffineTransform(1, 0, 0, 1, 79, 34));
        template.draw(img, template.bigSlot, new AffineTransform(1, 0, 0, 1, 111, 30));
        template.draw(img, template.furnaceProgress, new AffineTransform(1, 0, 0, 1, 176, 0));
        template.draw(img, template.arrowFilled, new AffineTransform(1, 0, 0, 1, 176, 14));
        template.drawInventory(img, 7, 83);
    }

    public void makeBrewing_stand(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.draw(img, template.brewingInterface, new AffineTransform(1, 0, 0, 1, 55, 15));
        template.draw(img, template.brewingProgress, new AffineTransform(1, 0, 0, 1, 176, 0));
        template.drawInventory(img, 7, 83);
    }

    public void makeAnvil(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlot(img, 26, 46);
        template.drawSlot(img, 75, 46);
        template.drawSlot(img, 133, 46);
        template.draw(img, template.anvilHammer, new AffineTransform(1, 0, 0, 1, 17, 7));
        template.draw(img, template.anvilRed, new AffineTransform(1, 0, 0, 1, 59, 20));
        template.draw(img, template.plus, new AffineTransform(1, 0, 0, 1, 53, 49));
        template.draw(img, template.arrow, new AffineTransform(1, 0, 0, 1, 101, 47));
        template.draw(img, template.anvilRename, new AffineTransform(1, 0, 0, 1, 0, 166));
        template.draw(img, template.arrowCrossed, new AffineTransform(1, 0, 0, 1, 176, 0));
        template.drawInventory(img, 7, 83);
    }

    public void makeVillager(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlot(img, 35, 52);
        template.drawSlot(img, 61, 52);
        template.draw(img, template.arrow, new AffineTransform(1, 0, 0, 1, 85, 23));
        template.draw(img, template.arrow, new AffineTransform(1, 0, 0, 1, 85, 53));
        template.draw(img, template.bigSlot, new AffineTransform(1, 0, 0, 1, 115, 49));
        template.draw(img, template.villagerButtons, new AffineTransform(1, 0, 0, 1, 176, 0));
        template.draw(img, template.arrowCrossed, new AffineTransform(1, 0, 0, 1, 212, 0));
        template.drawInventory(img, 7, 83);
    }

    public void makeEnchanting_table(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlot(img, 14, 46);
        template.draw(img, template.lapisSlot, new AffineTransform(1, 0, 0, 1, 34, 46));
        template.draw(img, template.enchantList, new AffineTransform(1, 0, 0, 1, 59, 13));
        template.draw(img, template.enchantSelection, new AffineTransform(1, 0, 0, 1, 0, 166));
        template.draw(img, template.enchantingCost, new AffineTransform(1, 0, 0, 1, 3, 225));
        template.drawInventory(img, 7, 83);
    }

    public void makeBeacon(BufferedImage img) {
        template.drawFrame(img, 0, 0, 230, 219);
        template.drawSlot(img, 135, 109);
        template.draw(img, template.beaconInterface, new AffineTransform(1, 0, 0, 1, 7, 4));
        template.draw(img, template.beaconSeparator, new AffineTransform(1, 0, 0, 1, 52, 108));
        template.draw(img, template.beaconSeparator, new AffineTransform(1, 0, 0, 1, 74, 108));
        template.draw(img, template.beaconSeparator, new AffineTransform(1, 0, 0, 1, 96, 108));
        template.draw(img, template.beaconButtons, new AffineTransform(1, 0, 0, 1, 0, 219));
        template.drawInventory(img, 35, 136);
    }

    public void makeHorse(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.draw(img, template.saddleSlot, new AffineTransform(1, 0, 0, 1, 7, 17));
        template.drawDynamicSlot(img, 25, 17, 54, 54, template.dynamicBackground);
        template.drawDynamicSlot(img, 79, 17, 90, 54, template.slotBackground2);
        template.drawSlotMatrix(img, 0, 166, 5, 3);
        template.draw(img, template.horseArmorSlot, new AffineTransform(1, 0, 0, 1, 0, 220));
        template.drawInventory(img, 7, 83);
    }

    public void makeInventory(BufferedImage img) {
        template.drawFrame(img, 0, 0, 176, 166);
        template.drawSlotMatrix(img, 7, 7, 1, 4);
        template.drawSlotMatrix(img, 87, 25, 2, 2);
        template.drawSlot(img, 143, 35);
        template.drawDynamicSlot(img, 25, 7, 54, 72, template.dynamicBackground);
        template.draw(img, template.inventoryArrow, new AffineTransform(1, 0, 0, 1, 125, 37));
        template.draw(img, template.inventoryEffectFrame, new AffineTransform(1, 0, 0, 1, 0, 166));
        template.draw(img, template.inventoryEffects, new AffineTransform(1, 0, 0, 1, 1, 198));
        template.drawInventory(img, 7, 83);
    }
}