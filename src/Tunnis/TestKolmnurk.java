// ül 2
package Tunnis;

public class TestKolmnurk {
    public static void main(String[] args) {
        Punkt punktO = new Punkt();
        Punkt punktA = new Punkt(1, 0);
        Punkt punktB = new Punkt(-1, 0);
        Punkt punktC = new Punkt(0, 1.73);

        Sirge a = new Sirge(punktA, punktB);
        Sirge b = new Sirge(punktB, punktC);
        Sirge c = new Sirge(punktC, punktA);

        Kolmnurk kolmnurk = new Kolmnurk(a, b, c);
        System.out.println(kolmnurk);
    }
}
