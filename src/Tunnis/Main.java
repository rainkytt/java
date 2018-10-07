package Tunnis;

public class Main {
    public static void main(String[] args) {
        Ring ring1 = new Ring();
        Ring ring2 = new Ring(1, 2, 5);
        Ring ring3 = new Ring(2, 4, 3, "punase");

        System.out.println(ring1.toString());
        System.out.println(ring2.toString());
        System.out.println(ring3.toString());

        System.out.println(ring1.varv + " ring1 ringjoone pikkus  = " + ring1.ringjoonePikkus());
        System.out.println(ring2.varv + " ring2 ringjoone pikkus  = " + ring2.ringjoonePikkus());
        System.out.println(ring3.varv + " ring3 ringjoone pikkus  = " + ring3.ringjoonePikkus());

        System.out.println(ring1.varv + " ring1 pindala  = " + ring1.ringiPindala());
        System.out.println(ring2.varv + " ring2 pindala  = " + ring2.ringiPindala());
        System.out.println(ring3.varv + " ring3 pindala  = " + ring3.ringiPindala());

        ring1.kaheRingiVordlus(ring2);
        ring1.kaheRingiVordlus(ring3);
        ring3.kaheRingiVordlus(ring2);


        Ruut ruut1 = new Ruut();
        Ruut ruut2 = new Ruut(1, 2, 5);
        Ruut ruut3 = new Ruut(2, 4, 3, "punase");

        System.out.println(ruut1.toString());
        System.out.println(ruut2.toString());
        System.out.println(ruut3.toString());

        System.out.println(ruut1.varv + " ruudu1 ümbermõõt  = " + ruut1.ruuduYmbermoot());
        System.out.println(ruut2.varv + " ruudu2 ümbermõõt  = " + ruut2.ruuduYmbermoot());
        System.out.println(ruut3.varv + " ruudu3 ümbermõõt  = " + ruut3.ruuduYmbermoot());

        System.out.println(ring1.varv + " ruut1 pindala  = " + ruut1.ruuduPindala());
        System.out.println(ring2.varv + " ruut2 pindala  = " + ruut2.ruuduPindala());
        System.out.println(ring3.varv + " ruut3 pindala  = " + ruut3.ruuduPindala());

        ruut1.kaheRuuduVordlus(ruut2);
        ruut1.kaheRuuduVordlus(ruut3);
        ruut3.kaheRuuduVordlus(ruut2);
    }
}
