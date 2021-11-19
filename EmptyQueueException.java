/**
 * @Author Bryan Zen 113252725
 * @version 1.0
 * @since 2021-10-20
 */

public class EmptyQueueException extends Exception {

    /**
     * Throws exception when a selected queue is empty.
     * @param message Extends Exception class, returns a string output.
     */
    public EmptyQueueException(String message) {
        super(message);
    }
}