package part3.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import part2.task1.model.Chamomile;
import part2.task1.model.Flower;
import part2.task1.model.Lily;
import part2.task1.model.Rose;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadJSON {
    private static List<Flower> flowers = new ArrayList<>();

    public static List<Flower> readFlowers() {
        flowers = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("flowers.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray flowerList = (JSONArray) obj;
            flowerList.forEach(flower -> parseFlowerObject((JSONObject) flower));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return flowers;
    }

    private static void parseFlowerObject(JSONObject flower) {
        JSONObject flowerObject = (JSONObject) flower.get("flower");
        String flowerColor = (String) flowerObject.get("flowerColor");
        Long flowerPrice = (Long) flowerObject.get("flowerPrice");
        String flowerType = (String) flowerObject.get("flowerType");
        switch (flowerType) {
            case "Rose":
                flowers.add(new Rose());
                break;
            case "Lily":
                flowers.add(new Lily());
                break;
            case "Chamomile":
                flowers.add(new Chamomile());
                break;
        }
    }
}
