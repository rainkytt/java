// ül 4
// Loo programm, mis küsib kasutaja käest sportlase tulemuse ja nime, lisab selle ArrayList-i, sorteerib tulemuse järgi kahanevalt.
//Iga käivitamise peale küsib kasutaja käest andmed ja kuvab pingerea.
//ArrayList-i sorteerimiseks kasuta Collections.sort() meetodit.
package Tunnis;

public class Athlete {
    private String name;
    private Double result;

    public Athlete(String name, Double result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public Double getResult() {
        return result;
    }
}