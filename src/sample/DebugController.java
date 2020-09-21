package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DebugController {

    @FXML
    private TextField textfield_template_path;

    @FXML
    private Label label_load_template;

    @FXML
    private Button button_template_path_chooser;

    @FXML
    private Button button_generate;

    @FXML
    private CheckBox checkbox_loaded;

    @FXML
    private Label label_output_location;

    @FXML
    private TextField textfield_output_location;

    @FXML
    private Button button_output_location_chooser;

    @FXML
    private CheckBox checkbox_outputclear;

    String filePath;
    BufferedImage template = null;

    int width = 256;
    int height = 256;
    BufferedImage test = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = test.createGraphics();

    // D:\coding\minecraft dev\texturepack tools\guifactory
    String defaultPath = "D:/coding/minecraft dev/texturepack tools/guifactory";

    public void action_btn_template(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File(defaultPath));
        textfield_template_path.setText(defaultPath);
        File selectedFile = fc.showOpenDialog(null);
        if (selectedFile != null) {
            filePath = selectedFile.getAbsolutePath();
            textfield_template_path.setText(filePath);
            try {
                template = ImageIO.read(new File(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(debug(template));

            for (int y = 0; y < template.getHeight(); y++) {
                System.out.println();
                for (int x = 0; x < template.getWidth(); x++) {
                    System.out.print(Arrays.toString(getRGB(template, x, y)));
                }
            }


            Template1 template1 = new Template1(template);
            GUIPress guiPress = new GUIPress(template1);
            guiPress.makeInventory(test);


            File file = new File("D:/coding/minecraft dev/texturepack tools/guifactory/drawimgtest.png");
            try {
                ImageIO.write(test, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
