import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnagramTest {
    Anagram ia = new Anagram();

    @Test
    void testNumberOne() {
        assertTrue(ia.isAnagram("silent", "listen"));
    }

    @Test
    void testNumberTwo() {
        assertFalse(ia.isAnagram("medve", "cica"));
    }

}