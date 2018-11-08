// ül 5: Alphabet
package Tunnis;

import java.util.Scanner;

public class BigText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta tekst: ");
        String text = input.nextLine().toLowerCase();
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < text.length(); i++) {
                Character symbol = text.charAt(i);
                if (Alphabet.getAlphabet().containsKey(symbol)) {
                    String[] bigText = Alphabet.getAlphabet().get(symbol);
                    System.out.print(bigText[row]);
                }
            }
            System.out.println();
        }
    }
}
