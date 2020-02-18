package part2.task1.exceeption;

public class FlowerNotExistException extends Exception {
    public FlowerNotExistException(String message) {
        super(message);
    }

    public FlowerNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
