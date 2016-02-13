import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest
{
  @Test
  public void testHelloWorld()
  {
    HelloWorld hello = new HelloWorld();
    assertEquals("Hello World!", hello.printHelloWorld());
  }
}
