package part2.task1.model;

import org.json.simple.JSONObject;

public abstract class Flower {

    String flowerColor;
    int flowerPrice;

    public abstract int getFlowerPrice();

    public abstract String getFlowerColor();

    public JSONObject getAsJson() {
        JSONObject flowerDetails = new JSONObject();
        flowerDetails.put("flowerColor", flowerColor);
        flowerDetails.put("flowerPrice", flowerPrice);
        flowerDetails.put("flowerType", this.getClass().getSimpleName());
        JSONObject flowerObject = new JSONObject();
        flowerObject.put("flower", flowerDetails);
        return flowerObject;
    }

}


