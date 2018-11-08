// ül 5: Koosta programm, mis küsib kasutaja käest sisendina teksti ja väljastab sama tekst “ascii art” kujul.

package Tunnis;
import java.util.HashMap;

public class Alphabet {
    private static final HashMap<Character, String[]> alphabet = new HashMap<Character, String[]>();
    static {
        alphabet.put('a', new String[]{
                        " ###  ",
                        "#   # ",
                        "##### ",
                        "#   # ",
                        "#   # "
                }
        );
    }

    public static HashMap<Character, String[]> getAlphabet() {
        return alphabet;
    }
}
