package Tunnis;

public class Ruut {
    public double ruuduKylg;
    public String varv;
    public double x, y;

    public Ruut() {
        this.x = 0.0;
        this.y = 0.0;
        this.ruuduKylg = 0.0;
        this.varv = "värvitu";
    }

    public Ruut(double x, double y, double ruuduKylg) {
        this.x = x;
        this.y = y;
        this.ruuduKylg = ruuduKylg;
        this.varv = "värvitu";
    }

    public Ruut(double x, double y, double ruuduKylg, String varv) {
        this.x = x;
        this.y = y;
        this.ruuduKylg = ruuduKylg;
        this.varv = varv;
    }

    public double ruuduYmbermoot(){
        return this.ymmardamine(4 * this.ruuduKylg);
    }

    public double ruuduPindala() {
        return this.ymmardamine(Math.pow(this.ruuduKylg, 2));
    }

    public double ymmardamine(double x){
        return Math.round(x * 100) / 100.0; // 2 komakohaga
    }

    public void kaheRuuduVordlus(Ruut teineRuut){
        // kahe ruudu keskpunkti vahekaugus
        double vahekaugus = Math.sqrt(Math.pow(this.x - teineRuut.x, 2) + Math.pow(this.y - teineRuut.y, 2));
        if(vahekaugus == (this.ruuduKylg + teineRuut.ruuduKylg)){
            System.out.println("Ruutudel on 1 kokkupuute punkt");
        } else if(vahekaugus < (this.ruuduKylg + teineRuut.ruuduKylg)){
            System.out.println("Ruutudel on 2 kokkupuute punkti");
        } else {
            System.out.println("Ruudud ei puutu kokku");
        }
    }

    @Override
    public String toString() {
        return "Antud ruut on ümbermõõduga " +
                ruuduKylg + " ja " + varv + " värviga";
    }
}
