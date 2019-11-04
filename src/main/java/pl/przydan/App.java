package pl.przydan;

import pl.przydan.dictionaries.Dictionary;
import pl.przydan.dictionaries.Morse_aDictionary;

import static java.lang.Character.toUpperCase;

/**
 * Morse'a translator
 * by Przydan
 */
// TODO: reverse translation, make factory, add secondLanguage

public class App {
    public static void main(String[] args) {

        Dictionary dictionary = new Morse_aDictionary();
        StringBuilder stringBuilder = new StringBuilder();

        String word = "test sos";
        String translatedWord = "";

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            translatedWord = stringBuilder.append(dictionary.translate(toUpperCase(character))).append(" ").toString();
        }

        System.out.println("Wyrażenie do przetłumaczenia: " + word);

        System.out.println("Wyrażenie zapisane alfabetem morsa: " + translatedWord);


    }
}
