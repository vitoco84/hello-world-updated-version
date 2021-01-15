import static org.junit.Assert.*;

public class HelloWorldTest {

    @org.junit.Test
    public void getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.getHelloWorld());
    }
}