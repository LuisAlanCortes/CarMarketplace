module CarMarketPlace {
    requires javafx.controls;
    requires javafx.fxml;


    opens CarMarketplace to javafx.fxml;
    exports CarMarketplace;
}