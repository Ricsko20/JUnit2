import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    Fibonacci f = new Fibonacci();

    @Test
    public void testOne() {
        assertEquals(1, f.fibonacci(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, f.fibonacci(2));
        assertEquals(21, f.fibonacci(8));
    }

    @Test
    public void testThree() {
        assertEquals(832040, f.fibonacci(30));
    }
}