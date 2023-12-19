// Credit Card Class - Setters for credit card values and verification that returns true or error code
package CarMarketplace;

public class CreditCard {
    String firstName;
    String lastName;
    String csv;
    String cardNumber;
    String month;
    String year;
    final int numberLength = 16;
    final int csvLength = 3;
    final int monthLength = 2;
    final int yearLength = 4;
    final int monthMax = 12;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String verification() { // Return string error message for verification
        try {
            if (!firstName.matches("[a-zA-Z]+")) { // Regex to check if first & last name is a-z
                return "First Name Error";
            }
            if (!lastName.matches("[a-zA-Z]+")) {
                return "Last Name Error";
            }

            Double.parseDouble(cardNumber); // Cast value to double, if it exceptions its caught
            if(cardNumber.length() != numberLength) { // If the length is not correct
                return "Card Number Error";
            }

            Integer.parseInt(month);
            if (month.length() != monthLength) {
                return "Month Error";
            }

            Integer.parseInt(year);
            if (year.length() != yearLength) {
                return "Year Error";
            }

            Integer.parseInt(csv);
            if (csv.length() != csvLength) {
                return "Year Error";
            }

        } catch (NumberFormatException e) {
            return "Error - Number Format Exception"; // If cast fails return num error
        }

        return "True"; // If it passes all, return true
    }
}