package Tunnis;

public class yl1 {

    public static void main(String[] args) {
        // tabel
        int suurus = 10;
        // read
        for (int r = 0; r < suurus; r++) {
            // veerud
            for (int v = 0; v < suurus; v++) {
                // mitte korrapärane element
                int tulemus;
                if (r > v) {
                    tulemus = suurus - 1 - r;
                } else {
                    tulemus = suurus - 1 - v;
                }
                // veeru numbri väljastamine
                // System.out.print(tulemus + " "); // üks võimalustest

                // elemendi väljastamine
                System.out.format("%2d", tulemus); // veel üks võimalustest
                // System.out.format("%2d", suurus - 1 - (r > v ? r : v)); // veel üks võimalus
                // System.out.format("%2d", suurus - 1 - Math.max(r, v)); // veel üks võimalus
            }
            // reavahetus
            System.out.println();
        }
    }
}
