package part2.task1.service;

import part2.task1.model.Flower;
import part3.task2.ReadJSON;
import part3.task2.WriteJSON;

import java.util.ArrayList;
import java.util.List;

public class Bucket implements BucketInterface {

    private List<Flower> bucket = new ArrayList<>();

    public void addFlower(Flower flower) {
        bucket.add(flower);
    }


    @Override
    public int getBucketPrice() {
        int allFlowers = 0;
        for (int i = 0; i < bucket.size(); i++) {
            allFlowers += bucket.get(i).getFlowerPrice();
        }
        return allFlowers;
    }

    @Override
    public void writeBucketToJson() {
        WriteJSON.writeFlowers(bucket);
    }

    @Override
    public void readBucketFromJson() {
        bucket = ReadJSON.readFlowers();
    }

    @Override
    public String getFlowerColor(int flowerNumber) {
        String color = null;
        try {
            color = bucket.get(flowerNumber - 1).getFlowerColor();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.toString() + " Вы ввели не существующий номер цветка");
        }
        return color;
    }
}