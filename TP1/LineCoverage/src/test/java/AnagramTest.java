import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    static Anagram anagram = new Anagram();
@Test void isAnagramShouldReturnTrueIfthe2InputsAreAnagram(){
    assertEquals(true, anagram.isAnagram("FINAL","NALFI"));
    }
    @Test void isAnagramShouldReturnFalseIfthe2InputsAreNotAnagram(){
        assertEquals(false, anagram.isAnagram("FINAL","NAZFI"));
    }
    @Test void isAnagramShouldThrowExceptionIfthe2InputsAreNull(){
        assertThrows(NullPointerException.class, ()->anagram.isAnagram(null,"FINAL"));
    }
}