package Tunnis;

public class Ring {
    public double raadius;
    public String varv;
    public double x, y;

    public Ring() {
        this.x = 0.0;
        this.y = 0.0;
        this.raadius = 0.0;
        this.varv = "värvitu";
    }

    public Ring(double x, double y, double raadius) {
        this.x = x;
        this.y = y;
        this.raadius = raadius;
        this.varv = "värvitu";
    }

    public Ring(double x, double y, double raadius, String varv) {
        this.x = x;
        this.y = y;
        this.raadius = raadius;
        this.varv = varv;
    }

    public double ringjoonePikkus(){
        return this.ymmardamine(2 * Math.PI * this.raadius);
    }

    public double ringiPindala() {
        return this.ymmardamine(Math.PI * Math.pow(this.raadius, 2));
    }

    public double ymmardamine(double x){
        return Math.round(x * 100) / 100.0; // 2 komakohaga
    }

    public void kaheRingiVordlus(Ring teineRing){
        // kahe ringi keskpunkti vahekaugus
        double vahekaugus = Math.sqrt(Math.pow(this.x - teineRing.x, 2) + Math.pow(this.y - teineRing.y, 2));
        if(vahekaugus == (this.raadius + teineRing.raadius)){
            System.out.println("Ringidel on 1 kokkupuute punkt");
        } else if(vahekaugus < (this.raadius + teineRing.raadius)){
            System.out.println("Ringidel on 2 kokkupuute punkti");
        } else {
            System.out.println("Ringid ei puutu kokku");
        }
    }

    @Override
    public String toString() {
        return "Antud ring on raadiusega " +
                raadius + " ja " + varv + " värviga";
    }
}

