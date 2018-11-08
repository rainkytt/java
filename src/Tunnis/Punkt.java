// ül 2
package Tunnis;

public class Punkt {
    private double x;
    private double y;
    private int veerand;

    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
        this.veerand = getVeerand();
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
        this.veerand = getVeerand();
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public int getVeerand() {
        if (this.x > 0 & this.y > 0) veerand = 1;
        else if (this.x > 0 & this.y < 0) veerand = 2;
        else if (this.x < 0 & this.y < 0) veerand = 3;
        else if (this.x < 0 & this.y > 0) veerand = 4;
        else veerand = 0;
        return veerand;
    }
        @Override
        public String toString () {
            return "x = " + x +
                    ", y = " + y +
                    ", veerand = " + veerand;
        }
    }