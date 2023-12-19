// Filter Class - Hashmaps for every filter section, getters and setters, and a function to set flags for each hashmap
package CarMarketplace;
import java.util.HashMap;
import java.util.Objects;
public class Filters {
    // Each map has a flag pair to denote if any of the bools have been flipped
    HashMap<String, Boolean> brandHashMap = new HashMap<>(); // Brand hashmap
    {
        brandHashMap.put("Flag", false);
        brandHashMap.put("AstonMartin", false);
        brandHashMap.put("Ferrari", false);
        brandHashMap.put("Lamborghini", false);
        brandHashMap.put("Maserati", false);
        brandHashMap.put("McLaren", false);
    }
    HashMap<String, Boolean> colorHashMap = new HashMap<>(); // Color
    {
        colorHashMap.put("Flag", false);
        colorHashMap.put("Black", false);
        colorHashMap.put("Blue", false);
        colorHashMap.put("Green", false);
        colorHashMap.put("Orange", false);
        colorHashMap.put("Red", false);
        colorHashMap.put("White", false);
        colorHashMap.put("Yellow", false);
    }
    HashMap<String, Boolean> convertibleHashMap = new HashMap<>(); // Convertible
    {
        convertibleHashMap.put("Flag", false);
        convertibleHashMap.put("On", false);
        convertibleHashMap.put("Off", false);
    }
    HashMap<Integer, Boolean> priceHashMap = new HashMap<>(); // Price
    {
        priceHashMap.put(0, false);
        priceHashMap.put(100, false);
        priceHashMap.put(120, false);
        priceHashMap.put(200, false);
        priceHashMap.put(265, false);
        priceHashMap.put(400, false);
    }

    // PARAMS: Map: Which hashmap 1:Brand, 2:Color, 3:Convertible. 4:Price - Key: Key value - Flag: Opposite value of current bool value of value
    public void checkboxSelected(int map, String key, boolean flag) { // When a checkbox is clicked
        boolean neddToFlip; // If any value in the map is true, the flag variable needs to be flipped
        switch(map) { // Switch to look through specific hashmap
            case 1: { // Brand
                brandHashMap.put(key, flag); // Put in value with opposite value
                neddToFlip = false; // Default value
                for (HashMap.Entry<String, Boolean> entry : brandHashMap.entrySet()) { // Loop through hashmap
                    if ((!Objects.equals(entry.getKey(), "Flag")) && (entry.getValue())) { // If any value that isn't the flag is true
                        neddToFlip = true; // Flag value needs to be flipped
                        break; // Once a true value is found break
                    }
                }
                if (neddToFlip) { // If a true value was found
                    brandHashMap.put("Flag", true); // Flip flag to true
                }
                else {
                    brandHashMap.put("Flag", false); // Flip flag to false
                }
                break;
            }
            case 2: { // Color
                colorHashMap.put(key, flag);
                neddToFlip = false;
                for (HashMap.Entry<String, Boolean> entry : colorHashMap.entrySet()) {
                    if ((!Objects.equals(entry.getKey(), "Flag")) && (entry.getValue())) {
                        neddToFlip = true;
                        break;
                    }
                }
                if (neddToFlip) {
                    colorHashMap.put("Flag", true);
                }
                else {
                    colorHashMap.put("Flag", false);
                }
                break;
            }
            case 3: { // Convertible
                convertibleHashMap.put(key, flag);
                neddToFlip = false;
                for (HashMap.Entry<String, Boolean> entry : convertibleHashMap.entrySet()) {
                    if ((!Objects.equals(entry.getKey(), "Flag")) && (entry.getValue())) {
                        neddToFlip = true;
                        break;
                    }
                }
                if (neddToFlip) {
                    convertibleHashMap.put("Flag", true);
                }
                else {
                    convertibleHashMap.put("Flag", false);
                }
                break;
            }
            case 4: { // Price - Different flag variable (0)
                priceHashMap.put(Integer.parseInt(key), flag);
                neddToFlip = false;
                for (HashMap.Entry<Integer, Boolean> entry : priceHashMap.entrySet()) {
                    if ((!Objects.equals(entry.getKey(), 0)) && (entry.getValue())) {
                        neddToFlip = true;
                        break;
                    }
                }
                if (neddToFlip) {
                    priceHashMap.put(0, true);
                }
                else {
                    priceHashMap.put(0, false);
                }
                break;
            }
            default: {
                System.out.println("Switch Error");
            }
        }
    }

    public boolean getBrandHashMap(String key) {
        return brandHashMap.get(key);
    }

    public void setBrandHashMap(String key, Boolean flag) {
        brandHashMap.put(key, flag);
    }

    public boolean getColorHashMap(String key) {
        return colorHashMap.get(key);
    }

    public void setColorHashMap(String key, Boolean flag) {
        colorHashMap.put(key, flag);
    }

    public boolean getConvertibleHashMap(String key) {
        return convertibleHashMap.get(key);
    }

    public void setConvertibleHashMap(String key, Boolean flag) {
        convertibleHashMap.put(key, flag);
    }

    public boolean getPriceHashMap(int key) {
        return priceHashMap.get(key);
    }

    public void setPriceHashMap(int key, Boolean flag) {
        priceHashMap.put(key, flag);
    }
}
