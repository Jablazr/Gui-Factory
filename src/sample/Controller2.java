package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Controller2 {

    @FXML
    private TextField textfield_template_path;

    @FXML
    private Button btn_template;

    @FXML
    private TextField textfield_output_location;

    @FXML
    private Button btn_output_location;

    @FXML
    private TabPane tab_pane;

    @FXML
    private Tab tab_1_8_9;

    @FXML
    private CheckBox cb_dispenser;

    @FXML
    private CheckBox cb_generic_54;

    @FXML
    private CheckBox cb_hopper;

    @FXML
    private CheckBox cb_crafting_table;

    @FXML
    private CheckBox cb_furnace;

    @FXML
    private CheckBox cb_brewing_stand;

    @FXML
    private CheckBox cb_anvil;

    @FXML
    private CheckBox cb_villager;

    @FXML
    private CheckBox cb_enchanting_table;

    @FXML
    private CheckBox cb_beacon;

    @FXML
    private CheckBox cb_horse;

    @FXML
    private CheckBox cb_inventory;

    /*
    private CheckBox[] checkBoxes = {
            cb_anvil,
            cb_beacon,
            cb_brewing_stand,
            cb_crafting_table,
            cb_dispenser,
            cb_enchanting_table,
            cb_furnace,
            cb_generic_54,
            cb_hopper,
            cb_horse,
            cb_inventory,
            cb_villager
    };
    */

    @FXML
    private Button btn_select_all;

    @FXML
    private Button btn_deselect_all;

    @FXML
    private ImageView image_view;

    @FXML
    private Button btn_create_guis;

    @FXML
    private TextArea output_area;

    // D:\coding\minecraft dev\texturepack tools\guifactory
    private String defaultPath = "";

    private String template_path = defaultPath;
    private String output_location = defaultPath;

    BufferedImage template = null;

    @FXML
    void action_btn_create_guis(ActionEvent event) {
        if (cb_anvil.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeAnvil(test);

            File file = new File(output_location + "/anvil.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_generic_54.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeGeneric_54(test);

            File file = new File(output_location + "/generic_54.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_hopper.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeHopper(test);

            File file = new File(output_location + "/hopper.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_horse.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeHorse(test);

            File file = new File(output_location + "/horse.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_villager.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeVillager(test);

            File file = new File(output_location + "/villager.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_brewing_stand.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeBrewing_stand(test);

            File file = new File(output_location + "/brewing_stand.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_beacon.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeBeacon(test);

            File file = new File(output_location + "/beacon.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_enchanting_table.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeEnchanting_table(test);

            File file = new File(output_location + "/enchanting_table.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_crafting_table.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeCrafting_table(test);

            File file = new File(output_location + "/crafting_table.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_furnace.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeFurnace(test);

            File file = new File(output_location + "/furnace.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_inventory.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeInventory(test);

            File file = new File(output_location + "/inventory.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cb_dispenser.isSelected()) {
            int width = 256;
            int height = 256;
            BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeDispenser(test);

            File file = new File(output_location + "/dispenser.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void action_btn_template(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File(defaultPath));

        File selectedFile = fc.showOpenDialog(null);
        if (selectedFile != null) {
            template_path = selectedFile.getAbsolutePath();
            textfield_template_path.setText(template_path);

            try {
                template = ImageIO.read(new File(template_path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            // System.out.println(debug(template));

            for (int y = 0; y < template.getHeight(); y++) {
                System.out.println();
                for (int x = 0; x < template.getWidth(); x++) {
                    System.out.print(Arrays.toString(getRGB(template, x, y)));
                }
            }
        }
    }

    @FXML
    void action_btn_output_location(ActionEvent event) {
        DirectoryChooser dc = new DirectoryChooser();
        dc.setInitialDirectory(new File(output_location));

        File directory = dc.showDialog(null);
        if (directory != null) {
            output_location = directory.getAbsolutePath();
            textfield_output_location.setText(output_location);
        }
    }

    @FXML
    void action_btn_select_all(ActionEvent event) {
        cb_anvil.setSelected(true);
        cb_beacon.setSelected(true);
        cb_brewing_stand.setSelected(true);
        cb_crafting_table.setSelected(true);
        cb_dispenser.setSelected(true);
        cb_enchanting_table.setSelected(true);
        cb_furnace.setSelected(true);
        cb_generic_54.setSelected(true);
        cb_hopper.setSelected(true);
        cb_horse.setSelected(true);
        cb_inventory.setSelected(true);
        cb_villager.setSelected(true);
    }

    @FXML
    void action_btn_deselect_all(ActionEvent event) {
        cb_anvil.setSelected(false);
        cb_beacon.setSelected(false);
        cb_brewing_stand.setSelected(false);
        cb_crafting_table.setSelected(false);
        cb_dispenser.setSelected(false);
        cb_enchanting_table.setSelected(false);
        cb_furnace.setSelected(false);
        cb_generic_54.setSelected(false);
        cb_hopper.setSelected(false);
        cb_horse.setSelected(false);
        cb_inventory.setSelected(false);
        cb_villager.setSelected(false);
    }

    public String debug(BufferedImage img) {
        return "Dimensions: \nWidth: " + img.getWidth() +
                "\nHeight: " + img.getHeight() +
                "\nColor Model: " + img.getColorModel() +
                "\nType: " + img.getType();
    }

    public Color getColor(BufferedImage img, int x, int y) {
        return new Color(img.getRGB(x, y));
    }

    public int[] getRGB(BufferedImage img, int x, int y) {
        Color color = getColor(img, x, y);
        return new int[] {color.getRed(), color.getGreen(), color.getBlue()};
    }
}