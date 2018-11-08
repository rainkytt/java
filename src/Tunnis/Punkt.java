// ül 2
package Tunnis;

public class Punkt {
    private double x;
    private double y;
    private int veerand;
    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
        this.veerand = 0;
    }
    @Override
    public String toString() {
        return "x = " + x +
                ", y = " + y +
                ", veerand = " + veerand;
    }
}