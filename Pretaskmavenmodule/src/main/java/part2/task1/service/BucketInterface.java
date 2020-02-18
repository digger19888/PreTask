package part2.task1.service;

public interface BucketInterface {
    int getBucketPrice();

    void writeBucketToJson();

    void readBucketFromJson();

    String getFlowerColor(int flowerNumber);
}
