// ül 3: kolmnurk ühe tsükliga
package Tunnis;
import java.util.Collections;

public class Kolmnurk2 {
    public static void main(String[] args) {
        int rowNumbers = 5;
//        String symbols = "oooo*********";
//        for (int r = 0; r < rowNumbers; r++) {
//            System.out.println(symbols.substring(r, rowNumbers + 2 * r));
        // variant 2
        String symbols = String.join("", Collections.nCopies(rowNumbers-1, " ")) + String.join("", Collections.nCopies(rowNumbers*2-1, "*"));
        for(int r = 0; r < rowNumbers; r++){
            System.out.println(symbols.substring(r, rowNumbers + 2 * r));
        }
    }
}
