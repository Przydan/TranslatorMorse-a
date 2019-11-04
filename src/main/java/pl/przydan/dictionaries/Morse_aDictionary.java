package pl.przydan.dictionaries;


import java.util.LinkedHashMap;
import java.util.Map;

public class Morse_aDictionary implements Dictionary {
    private static Map<Character, String> Morse_aCharacters;

    static {
        Morse_aCharacters = new LinkedHashMap<>();
        Morse_aCharacters.put('A', ".-");
        Morse_aCharacters.put('Ą', ".-.-");
        Morse_aCharacters.put('B', "-...");
        Morse_aCharacters.put('C', "-.-.");
        Morse_aCharacters.put('Ć', "-.-..");
        Morse_aCharacters.put('D', "-..");
        Morse_aCharacters.put('E', ".");
        Morse_aCharacters.put('Ę', "..-..");
        Morse_aCharacters.put('F', "..-.");
        Morse_aCharacters.put('G', "--.");
        Morse_aCharacters.put('H', "....");
        Morse_aCharacters.put('J', ".---");
        Morse_aCharacters.put('K', "-.-");
        Morse_aCharacters.put('L', ".-..");
        Morse_aCharacters.put('Ł', ".-..-");
        Morse_aCharacters.put('M', "--");
        Morse_aCharacters.put('N', "-.");
        Morse_aCharacters.put('Ń', "--.--");
        Morse_aCharacters.put('O', "---");
        Morse_aCharacters.put('Ó', "---.");
        Morse_aCharacters.put('P', ".--.");
        Morse_aCharacters.put('Q', "--.-");
        Morse_aCharacters.put('R', ".-.");
        Morse_aCharacters.put('S', "...");
        Morse_aCharacters.put('Ś', "...-...");
        Morse_aCharacters.put('T', "-");
        Morse_aCharacters.put('U', "..-");
        Morse_aCharacters.put('V', "...-");
        Morse_aCharacters.put('W', ".--");
        Morse_aCharacters.put('X', "-..-");
        Morse_aCharacters.put('Y', "-.--");
        Morse_aCharacters.put('Z', "--..");
        Morse_aCharacters.put('Ż', "--..-.");
        Morse_aCharacters.put('Ź', "--..-");
        Morse_aCharacters.put('0', "-----");
        Morse_aCharacters.put('1', ".----");
        Morse_aCharacters.put('2', "..---");
        Morse_aCharacters.put('3', "...--");
        Morse_aCharacters.put('4', "....-");
        Morse_aCharacters.put('5', ".....");
        Morse_aCharacters.put('6', "-....");
        Morse_aCharacters.put('7', "--...");
        Morse_aCharacters.put('8', "---..");
        Morse_aCharacters.put('9', "----.");
        Morse_aCharacters.put(' ', ".-..-");
        Morse_aCharacters.put('.', ".-.-.-");
    }

    @Override
    public String translate(Character character) {
        String value;
        return value = Morse_aCharacters
                .entrySet()
                .stream()
                .filter(e -> e.getKey().equals(character))
                .findFirst()
                .map(characterStringEntry -> characterStringEntry.getValue())
                .orElse("");
    }

}
