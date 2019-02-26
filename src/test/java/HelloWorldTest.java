import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    private HelloWorld hello;

    @Before
    public void setUp() throws Exception {
        hello = new HelloWorld();
    }

    @Test
    public void isItFive() {
        assertEquals(5, hello.isItFive());
    }
}