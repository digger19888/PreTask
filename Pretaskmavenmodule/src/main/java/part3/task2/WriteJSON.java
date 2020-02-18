package part3.task2;

import org.json.simple.JSONArray;
import part2.task1.model.Flower;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteJSON {
    public static void writeFlowers(List<Flower> flowers) {
        JSONArray flowersList = new JSONArray();
        for (Flower flower : flowers) {

            flowersList.add(flower.getAsJson());
        }

        try (FileWriter file = new FileWriter("flowers.json")) {

            file.write(flowersList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
