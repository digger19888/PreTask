package part2.task1.model;


public class Rose extends Flower {

    public Rose() {
        this.flowerColor = "Red";
        this.flowerPrice = 6;
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
