package part2.task1.model;


public class Lily extends Flower {
    public Lily() {
        this.flowerColor = "White";
        this.flowerPrice = 3;
    }

    @Override
    public int getFlowerPrice() {
        return flowerPrice;
    }

    @Override
    public String getFlowerColor() {
        return flowerColor;
    }
}
