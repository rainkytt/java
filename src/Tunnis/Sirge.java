// ül 2
package Tunnis;

public class Sirge {
    private Punkt punktA;
    private Punkt punktB;
    private double pikkus;

    public Sirge(Punkt punktA, Punkt punktB) {
        this.punktA = punktA;
        this.punktB = punktB;
    }

    public Punkt getPunktA() {
        return punktA;
    }

    public Punkt getPunktB() {
        return punktB;
    }

    public double getPikkus() {
        this.pikkus = Math.sqrt(Math.pow((punktB.getX() - punktA.getX()), 2) + Math.pow((punktB.getY() - punktA.getY()), 2));
        this.pikkus = Math.round(this.pikkus * 100) / 100.0;
        return pikkus;
    }

    @Override
    public String toString() {
        return punktA +
                "\n" + punktB +
                "\npikkus = " + getPikkus();
    }
}