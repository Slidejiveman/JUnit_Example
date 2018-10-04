package messageTest;

import messagePD.MessageUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class exercises the functions of the problem domain message utility class.
 * It is based on the URL below, but modified with some of the conventions I tend
 * to use with my tests at work.
 *
 * @author rdnot 
 * @see https://www.tutorialspoint.com/junit/junit_basic_usage.htm
 */
public class MessageUtilTest {

    /**
     * The String to use in the print message test
     */
    private String message;

    /**
     * The MessageUtil object under test.
     */
    private MessageUtil messageUtil;

    /**
     * Setup method
     */
    @Before
    public void setupTest() {
        message = "Hello World";
        messageUtil = new MessageUtil(message);
    }

    /**
     * Encourage the garbage collector to clean up memory.
     */
    @After
    public void tearDownTest() {
        message = null;
        messageUtil = null;
    }

    /**
     * The test method to use on the print message of the MessageUtil object.
     */
    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }
}
