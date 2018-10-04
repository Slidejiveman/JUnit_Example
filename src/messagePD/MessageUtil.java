package messagePD;

/**
 * @see https://www.tutorialspoint.com/junit/junit_basic_usage.htm
 */
public class MessageUtil {

    private String message;

    /**
     * No-argument constructor that sets the message for the object.
     * @param message
     */
    public MessageUtil(String message) {
        this.message = message;
    }

    /**
     * Prints the classes set message to the console
     * @return the message to be printed
     */
    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
