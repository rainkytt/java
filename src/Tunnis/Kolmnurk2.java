// ül 3: kolmnurk ühe tsükliga
package Tunnis;

public class Kolmnurk2 {
    public static void main(String[] args) {
        int rowNumbers = 5;
        String symbols = "oooo*********";
        for (int r = 0; r < rowNumbers; r++) {
            System.out.println(symbols.substring(r, rowNumbers + 2 * r));
        }
    }
}
