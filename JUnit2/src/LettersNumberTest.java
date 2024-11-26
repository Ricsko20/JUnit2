import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LettersNumberTest {

    private final LettersNumber lettersNumber = new LettersNumber();

    @Test
    public void testCountLetter_EmptyString() {
        assertEquals(0, lettersNumber.countLetter(""));
    }

    @Test
    public void testCountLetter_SingleCharacter() {
        assertEquals(0, lettersNumber.countLetter("a"));
    }

    @Test
    public void testCountLetter_DifferentCharacters() {
        assertEquals(0, lettersNumber.countLetter("abcde"));
    }

    @Test
    public void testCountLetter_SomeRepeats() {
        assertEquals(2, lettersNumber.countLetter("aabbcc"));
    }

    @Test
    public void testCountLetter_AllRepeats() {
        assertEquals(4, lettersNumber.countLetter("aaabbbccc"));
    }

    @Test
    public void testCountLetter_CaseInsensitive() {
        assertEquals(1, lettersNumber.countLetter("aA"));
    }

    @Test
    public void testCountLetter_LongString() {
        assertEquals(3, lettersNumber.countLetter("aabbccddeeffgg"));
    }

    @Test
    public void testCountLetter_NullString() {
        assertEquals(0, lettersNumber.countLetter(null));
    }
}