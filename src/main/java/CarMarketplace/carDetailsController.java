// Car Details Controller - Show image of car and allow purchase from click - Load credit card view
package CarMarketplace;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class carDetailsController {
    private Image carImage;
    private int carPrice;
    @FXML
    private Button buttonPurchase;

    @FXML
    private Label currentCarTitle;

    @FXML
    private ImageView imageview;
    public void setImage(Image image, String brand, int price, String color, String convertible, Double zeroToSixtyTime) { // Set image file from the given car files
        carImage = image;
        carPrice = price;
        imageview.setImage(carImage);
        currentCarTitle.setText(color + " " + brand); // Car name is color and brand
        labelCarBrand.setText(brand);
        labelCarPrice.setText("$" + String.valueOf(price) + "K"); // Add money sign to price
        labelCarColor.setText(color);
        String convertibleString;
        if (convertible.equals("On")) { // Convertible will say true or false
            convertibleString = "True";
        }
        else {
            convertibleString = "False";
        }
        labelCarConvertible.setText(convertibleString);
        labelCarTime.setText(zeroToSixtyTime + " Seconds"); // Add seconds
    }

    @FXML
    private Label labelCarBrand;

    @FXML
    private Label labelCarColor;

    @FXML
    private Label labelCarConvertible;

    @FXML
    private Label labelCarPrice;

    @FXML
    private Label labelCarTime;

    @FXML
    void buttonPurchasePressed(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("creditCardView.fxml")); // Switch to credit card view
        Parent root = loader.load();

        creditCardController creditCardController = loader.getController(); // Instance of credit card to send price
        creditCardController.setPrice(carPrice);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

