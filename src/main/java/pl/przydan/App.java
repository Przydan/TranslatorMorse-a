package pl.przydan;

import pl.przydan.dictionaries.Dictionary;
import pl.przydan.dictionaries.Morse_aDictionary;

import static java.lang.Character.toUpperCase;

/**
 * Morse'a translator
 * by Przydan
 */
// TODO: reverse translation, make factory, add secondLanguage( Greka lub Braille'a)

public class App {
    public static void main(String[] args) {

        Dictionary dictionary = new Morse_aDictionary();


        String sentence = "Litwo ojczyzno ty moja";

        String translatedWord = dictionary.translate(sentence);

        System.out.println("Wyrażenie do przetłumaczenia: " + sentence);

        System.out.println("Wyrażenie zapisane alfabetem morsa: " + translatedWord);


    }


}
