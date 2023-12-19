// Credit card controller - Get credit card details from user and verify, if any fail display error, if all good, display receipt view
package CarMarketplace;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class creditCardController {
    public int price;
    CreditCard creditCard = new CreditCard();

    @FXML
    private Button buttonSubmit;

    @FXML
    private Label labelError;

    @FXML
    private TextField textFieldCSV;

    @FXML
    private TextField textFieldCardNum;

    @FXML
    private TextField textFieldFName;

    @FXML
    private TextField textFieldLName;

    @FXML
    private TextField textFieldMonth;

    @FXML
    private TextField textFieldYear;

    @FXML
    void buttonSubmitPressed(ActionEvent event) throws IOException {
        creditCard.setFirstName(textFieldFName.getText()); // Set credit card values
        creditCard.setLastName(textFieldLName.getText());
        creditCard.setCardNumber(textFieldCardNum.getText());
        creditCard.setMonth(textFieldMonth.getText());
        creditCard.setYear(textFieldYear.getText());
        creditCard.setCsv(textFieldCSV.getText());
        String creditText = creditCard.verification(); // Set text with error code from verification or true
        if (!creditText.equals("True")) { // If the verification is not correct display the error
            labelError.setText(creditText);
        }
        else { // If the verification was true change to receipt view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("receiptView.fxml"));
            Parent root = loader.load();

            receiptController receiptController = loader.getController();
            receiptController.setPrice(price); // Send price to receipt controller

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }


    public void setPrice(int carPrice) { // Set price to send to receipt
        price = carPrice;
    }
}

