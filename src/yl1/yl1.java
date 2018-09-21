package yl1;

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
                System.out.print(tulemus + " ");
            }
            // reavahetus
            System.out.println();
        }
    }
}
