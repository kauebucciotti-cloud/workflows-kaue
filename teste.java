import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void testGetGreeting() {
        HelloWorld hello = new HelloWorld();
        
        String esperado = "Hello World!";
        
        String atual = hello.getGreeting();
        
        assertEquals(esperado, atual, "A saudação deve ser 'Hello World!'");
    }
}