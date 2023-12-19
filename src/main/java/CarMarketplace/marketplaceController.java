// Handle showing images and images based on filters - Click images to load detail view
package CarMarketplace;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class marketplaceController {
    public marketplaceController() throws FileNotFoundException {
    }
    Cars[] carArray = { // Array of cars with values pre-selected
            new Ferrari("Blue", true, 8, "src/main/resources/CarImageResources/Ferrari/BluFerrariConvertible.jpg"),
            new Maserati("Red", false, 12, "src/main/resources/CarImageResources/Maserati/RedMaserati.jpg"),
            new AstonMartin("Black", true, 8, "src/main/resources/CarImageResources/Aston/BlkAstonConvertible.jpg"),
            new McLaren("Orange", true, 8, "src/main/resources/CarImageResources/Mc/OranMcLarConvertible.jpg"),
            new Lamborghini("Black", true, 6, "src/main/resources/CarImageResources/Lambo/BlkLamboConvertible.jpg"),
            new Ferrari("Red", false, 4, "src/main/resources/CarImageResources/Ferrari/RedFerrari.jpg"),
            new Maserati("White", true, 12, "src/main/resources/CarImageResources/Maserati/WhiteMaserConvertible.jpg"),
            new AstonMartin("Green", false, 8, "src/main/resources/CarImageResources/Aston/GreenAston.jpg"),
            new McLaren("Yellow", false, 8, "src/main/resources/CarImageResources/Mc/YellowMcLaren.jpg"),
            new Lamborghini("Black", false, 6, "src/main/resources/CarImageResources/Lambo/BlkLambo.jpg")
    };
    Filters filters = new Filters(); // Filter object
    @FXML
    public void switchToCarDetailsView(MouseEvent event, Cars car) throws IOException { // Switch to detail view on mouse click
        Image image = new Image(new FileInputStream(car.getImageLink()));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("carDetailsView.fxml")); // Switch to car detail view
        Parent root = loader.load();

        carDetailsController carDetailsController = loader.getController(); // Create an instance of the car detail controller and call set image to pass data to it
        carDetailsController.setImage(image, car.getBrand(), car.getPriceInThousands(), car.getColor(), car.isConvertible(), car.getZeroToSixtyTime()); // Send car details

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private CheckBox filterBrandAstonMartin;
    @FXML
    private CheckBox filterBrandFerrari;
    @FXML
    private CheckBox filterBrandLamborghini;
    @FXML
    private CheckBox filterBrandMaserati;
    @FXML
    private CheckBox filterBrandMcLaren;
    @FXML
    private CheckBox filterColorBlack;
    @FXML
    private CheckBox filterColorBlue;
    @FXML
    private CheckBox filterColorGreen;
    @FXML
    private CheckBox filterColorOrange;
    @FXML
    private CheckBox filterColorRed;
    @FXML
    private CheckBox filterColorWhite;
    @FXML
    private CheckBox filterColorYellow;
    @FXML
    private CheckBox filterConvertibleOff;
    @FXML
    private CheckBox filterConvertibleOn;
    @FXML
    private CheckBox filterPrice100k;
    @FXML
    private CheckBox filterPrice120k;
    @FXML
    private CheckBox filterPrice200k;
    @FXML
    private CheckBox filterPrice265k;
    @FXML
    private CheckBox filterPrice400k;
    Image[] images = { // Image array of each cars image link to go in image views
            new Image(new FileInputStream(carArray[0].getImageLink())),
            new Image(new FileInputStream(carArray[1].getImageLink())),
            new Image(new FileInputStream(carArray[2].getImageLink())),
            new Image(new FileInputStream(carArray[3].getImageLink())),
            new Image(new FileInputStream(carArray[4].getImageLink())),
            new Image(new FileInputStream(carArray[5].getImageLink())),
            new Image(new FileInputStream(carArray[6].getImageLink())),
            new Image(new FileInputStream(carArray[7].getImageLink())),
            new Image(new FileInputStream(carArray[8].getImageLink())),
            new Image(new FileInputStream(carArray[9].getImageLink())),
    };
    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView imageView3;
    @FXML
    private ImageView imageView4;
    @FXML
    private ImageView imageView5;
    @FXML
    private ImageView imageView6;
    @FXML
    private ImageView imageView7;
    @FXML
    private ImageView imageView8;
    @FXML
    private ImageView imageView9;
    @FXML
    private ImageView imageView10;

    @FXML
    void image1Clicked(MouseEvent event) throws IOException { // On image click, switch to car detail view
        if (!Objects.equals(carArray[0].getImageLink(), "src/main/resources/White.jpg")) { // If it is not the white jpg
            switchToCarDetailsView(event, carArray[0]); // Switch view with event sent and car sent
        }
    }
    @FXML
    void image2Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[1].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[1]);
        }
    }
    @FXML
    void image3Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[2].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[2]);
        }
    }
    @FXML
    void image4Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[3].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[3]);
        }
    }
    @FXML
    void image5Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[4].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[4]);
        }
    }
    @FXML
    void image6Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[5].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[5]);
        }
    }
    @FXML
    void image7Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[6].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[6]);
        }
    }
    @FXML
    void image8Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[7].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[7]);
        }
    }
    @FXML
    void image9Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[8].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[8]);
        }
    }
    @FXML
    void image10Clicked(MouseEvent event) throws IOException {
        if (!Objects.equals(carArray[9].getImageLink(), "src/main/resources/White.jpg")) {
            switchToCarDetailsView(event, carArray[9]);
        }
    }

    // Loop through images array, each image is tied to a car object. Check the cars filters vs hashmap filters
    // Car 1: Ferrari, Blue, On, 200 - check brand against hashmap using the brand as a key. If value is true, dont display image. Repeat for each filter

    // After all boxes are unchecked, need to reset all images back to default
    // Loop through each car. Check if its brand is checked, if it is, proceed to check if its color is selected as well. Check price next, then price. If all are checked display
    // If a brand filter is active, and current brand is not selected, dont show. If
    void setImages() throws FileNotFoundException { // Set all images based on filter selection
        boolean display; // Display a car
        boolean missingFilterSection; // Filter section missing from car details
        boolean reset; // If no filters are selected, show all images again
        for (int i = 0; i < images.length; i++) { // Loop through each image, and each car
            display = false; // Flip bools to default values each loop
            missingFilterSection = false;
            reset = true;
            if (filters.getBrandHashMap("Flag")) { // Check if flag is flipped
                reset = false; // If a brand has been selected, no need to reset
                if (filters.getBrandHashMap(carArray[i].getBrand())) { // Check if the current car is currently selected or not
                    display = true; // If it is, it can be displayed
                }
                else {
                    missingFilterSection = true; // If the car is not selected, then it is missing a filter section
                }
            }
            if (filters.getColorHashMap("Flag")) { // Check if colors is flipped
                reset = false;
                if (filters.getColorHashMap(carArray[i].getColor())) { // Check if the car color is selected
                    display = true;
                }
                else {
                    display = false; // If not selected it cant be displayed
                    missingFilterSection = true; // And it is missing a filter section
                }
            }
            if (filters.getConvertibleHashMap("Flag")) {
                reset = false;
                if (filters.getConvertibleHashMap(carArray[i].isConvertible())) {
                    display = true;
                }
                else {
                    display = false;
                    missingFilterSection = true;
                }
            }
            if (filters.getPriceHashMap(0)) {
                reset = false;
                if (filters.getPriceHashMap(carArray[i].getPriceInThousands())) {
                    display = true;
                }
                else {
                    display = false;
                    missingFilterSection = true;
                }
            }
            if (reset) { // If no filters are applied then reset and show all cars again
                images[i] = new Image(new FileInputStream(carArray[i].getImageLink())); // Set images to car images
            }
            else if ((display) && (!missingFilterSection)) { // If display is true and no sections are missing then display car
                images[i] = new Image(new FileInputStream(carArray[i].getImageLink()));
            }
            else { // If the car does not match all filters set its image to white
                images[i] = new Image(new FileInputStream("src/main/resources/White.jpg"));
            }
        }
        imageView1.setImage(images[0]); // Set all image views to image array
        imageView2.setImage(images[1]);
        imageView3.setImage(images[2]);
        imageView4.setImage(images[3]);
        imageView5.setImage(images[4]);
        imageView6.setImage(images[5]);
        imageView7.setImage(images[6]);
        imageView8.setImage(images[7]);
        imageView9.setImage(images[8]);
        imageView10.setImage(images[9]);
    }
    @FXML
    void filterBrandAstonMartinChecked() throws FileNotFoundException { // On checkbox click set the filter hashmap with value
        filters.checkboxSelected(1, "AstonMartin", !filters.getBrandHashMap("AstonMartin")); // Send filter the filter map to be changed and the key, and the opposite value to put in
        setImages(); // Set images based on the checkbox selected
    }
    @FXML
    void filterBrandFerrariChecked() throws FileNotFoundException {
        filters.checkboxSelected(1, "Ferrari", !filters.getBrandHashMap("Ferrari"));
        setImages();
    }
    @FXML
    void filterBrandLamborghiniChecked() throws FileNotFoundException {
        filters.checkboxSelected(1, "Lamborghini", !filters.getBrandHashMap("Lamborghini"));
        setImages();
    }
    @FXML
    void filterBrandMaseratiChecked() throws FileNotFoundException {
        filters.checkboxSelected(1, "Maserati", !filters.getBrandHashMap("Maserati"));
        setImages();
    }
    @FXML
    void filterBrandMcLarenChecked() throws FileNotFoundException {
        filters.checkboxSelected(1, "McLaren", !filters.getBrandHashMap("McLaren"));
        setImages();
    }
    @FXML
    void filterColorBlackChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "Black", !filters.getColorHashMap("Black"));
        setImages();
    }
    @FXML
    void filterColorBlueChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "Blue", !filters.getColorHashMap("Blue"));
        setImages();
    }
    @FXML
    void filterColorGreenChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "Green", !filters.getColorHashMap("Green"));
        setImages();
    }
    @FXML
    void filterColorOrangeChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "Orange", !filters.getColorHashMap("Orange"));
        setImages();
    }
    @FXML
    void filterColorRedChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "Red", !filters.getColorHashMap("Red"));
        setImages();
    }
    @FXML
    void filterColorWhiteChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "White", !filters.getColorHashMap("White"));
        setImages();
    }
    @FXML
    void filterColorYellowChecked() throws FileNotFoundException {
        filters.checkboxSelected(2, "Yellow", !filters.getColorHashMap("Yellow"));
        setImages();
    }
    @FXML
    void filterConvertibleOffChecked() throws FileNotFoundException {
        filters.checkboxSelected(3, "Off", !filters.getConvertibleHashMap("Off"));
        setImages();
    }
    @FXML
    void filterConvertibleOnChecked() throws FileNotFoundException {
        filters.checkboxSelected(3, "On", !filters.getConvertibleHashMap("On"));
        setImages();
    }
    @FXML
    void filterPrice100kChecked() throws FileNotFoundException {
        filters.checkboxSelected(4, "100", !filters.getPriceHashMap(100));
        setImages();
    }
    @FXML
    void filterPrice120kChecked() throws FileNotFoundException {
        filters.checkboxSelected(4, "120", !filters.getPriceHashMap(120));
        setImages();
    }
    @FXML
    void filterPrice200kChecked() throws FileNotFoundException {
        filters.checkboxSelected(4, "200", !filters.getPriceHashMap(200));
        setImages();
    }
    @FXML
    void filterPrice265kChecked() throws FileNotFoundException {
        filters.checkboxSelected(4, "265", !filters.getPriceHashMap(265));
        setImages();
    }
    @FXML
    void filterPrice400kChecked() throws FileNotFoundException {
        filters.checkboxSelected(4, "400", !filters.getPriceHashMap(400));
        setImages();
    }

}