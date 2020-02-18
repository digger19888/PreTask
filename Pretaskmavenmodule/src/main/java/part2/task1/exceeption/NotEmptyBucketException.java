package part2.task1.exceeption;

public class NotEmptyBucketException extends Exception{
    public NotEmptyBucketException(String message) {
        super(message);
    }

    public NotEmptyBucketException(String message, Throwable cause) {
        super(message, cause);
    }
}
