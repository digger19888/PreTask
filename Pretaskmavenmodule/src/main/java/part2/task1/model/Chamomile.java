package part2.task1.model;


public class Chamomile extends Flower {
    public Chamomile() {
        this.flowerColor = "Blue";
        this.flowerPrice = 8;
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
