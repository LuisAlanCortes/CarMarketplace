// Receipt Controller - Display Car Price
package CarMarketplace;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class receiptController {
    public void setPrice(int price) {
        labelCost.setText("$"+ price + "K"); // Display price
    }
    @FXML
    private Label labelCost;
}

