// Car abstract class and all child classes of brands
package CarMarketplace;

public abstract class Cars {
    String brand;
    int priceInThousands;
    String color;
    boolean convertible;
    int cylinders;
    double zeroToSixtyTime;
    String imageLink;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPriceInThousands() {
        return priceInThousands;
    }

    public void setPriceInThousands(int priceInThousands) {
        this.priceInThousands = priceInThousands;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isConvertible() {
        if (convertible) {
            return "On";
        }
        else {
            return "Off";
        }
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getZeroToSixtyTime() {
        return zeroToSixtyTime;
    }

    public void setZeroToSixtyTime(double zeroToSixtyTime) {
        this.zeroToSixtyTime = zeroToSixtyTime;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}

class Ferrari extends Cars {
    public Ferrari(String color, boolean convertible, int cylinders, String imageLink) {
        this.brand = "Ferrari";
        this.zeroToSixtyTime = 2.7;
        this.priceInThousands = 200;
        this.color = color;
        this.convertible = convertible;
        this.cylinders = cylinders;
        this.imageLink = imageLink;
    }
}
class Maserati extends Cars{
    public Maserati(String color, boolean convertible, int cylinders, String imageLink) {
        this.brand = "Maserati";
        this.zeroToSixtyTime = 3.8;
        this.priceInThousands = 100;
        this.color = color;
        this.convertible = convertible;
        this.cylinders = cylinders;
        this.imageLink = imageLink;
    }
}
class AstonMartin extends Cars{
    public AstonMartin(String color, boolean convertible, int cylinders, String imageLink) {
        this.brand = "AstonMartin";
        this.zeroToSixtyTime = 3.6;
        this.priceInThousands = 120;
        this.color = color;
        this.convertible = convertible;
        this.cylinders = cylinders;
        this.imageLink = imageLink;
    }
}
class McLaren extends Cars{
    public McLaren(String color, boolean convertible, int cylinders, String imageLink) {
        this.brand = "McLaren";
        this.zeroToSixtyTime = 2.5;
        this.priceInThousands = 265;
        this.color = color;
        this.convertible = convertible;
        this.cylinders = cylinders;
        this.imageLink = imageLink;
    }
}
class Lamborghini extends Cars{
    public Lamborghini(String color, boolean convertible, int cylinders, String imageLink) {
        this.brand = "Lamborghini";
        this.zeroToSixtyTime = 2.5;
        this.priceInThousands = 400;
        this.color = color;
        this.convertible = convertible;
        this.cylinders = cylinders;
        this.imageLink = imageLink;
    }
}
