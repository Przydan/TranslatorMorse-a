package pl.przydan.dictionaries;

import org.junit.Test;

import static org.junit.Assert.*;

public class Morse_aDictionaryTest {

    @Test
    public void translateShouldReturnTranslatedStringWhenCharacterIsGiven() {
        // given
        Dictionary dictionary = new Morse_aDictionary();

        String expected = ".-";
        // when
        String result = dictionary.translate("A");

        // then
        assertEquals(expected,result);
    }

    @Test
    public void translateShouldReturnTranslatedStringWhenStringIsGiven() {
        // given
        Dictionary dictionary = new Morse_aDictionary();

        String expected = "... --- ... / ... --- ... ";
        // when
        String result = dictionary.translate("sos sos");

        // then
        assertEquals(expected,result);
    }
}