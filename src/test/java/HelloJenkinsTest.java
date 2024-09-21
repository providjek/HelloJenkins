import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJenkinsTest {
    @Test
    public void testHelloMessage() {
        String expectedMessage = "Hello Jenkins";
        assertEquals(expectedMessage, "Hello Jenkins");
    }
}
