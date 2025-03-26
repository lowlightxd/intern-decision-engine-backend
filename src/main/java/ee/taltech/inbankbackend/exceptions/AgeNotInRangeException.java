package ee.taltech.inbankbackend.exceptions;

/**
 * Thrown when the age of the customer is not in the valid range.
 */
public class AgeNotInRangeException extends Throwable {
    private final String message;
    private final Throwable cause;

    public AgeNotInRangeException(String message) {
        this(message, null);
    }

    public AgeNotInRangeException(String message, Throwable cause) {
        this.message = message;
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
