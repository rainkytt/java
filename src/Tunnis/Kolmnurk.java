// ül 2
package Tunnis;

public class Kolmnurk {
    private Sirge a;
    private Sirge b;
    private Sirge c;

    public Kolmnurk(Sirge a, Sirge b, Sirge c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (kasMoodustubKolmnurk()) {
            System.out.println("Saab moodustada kolmnurk");
        } else {
            System.out.println("Ei saa moodustada kolmnurk");
        }
    }

    public boolean kasMoodustubKolmnurk() {
        if (a.getPikkus() == b.getPikkus() & b.getPikkus() == c.getPikkus() & c.getPikkus() == a.getPikkus()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Kolmnurk\n" +
                "a:\n" + a +
                "\nb: \n" + b +
                "\nc: \n" + c;
    }
}
