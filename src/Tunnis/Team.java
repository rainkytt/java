// ül 4 Athlete

import Tunnis.Athlete;

import java.util.ArrayList;
import java.util.Collections;

package Tunnis;

public class Team {
    public static void main(String[] args) {
        Athlete kristiina = new Athlete("Kristiina", 10.0);
        Athlete andrus = new Athlete("Andrus", 12.0);
        Athlete jaak = new Athlete("Jaak", 13.0);

        ArrayList<Athlete> athletes = new ArrayList<Athlete>();

        athletes.add(kristiina);
        athletes.add(andrus);
        athletes.add(jaak);

        for (Athlete athlete : athletes) {
            System.out.printf("%s\t\t%5.2f\n", athlete.getName(), athlete.getResult());
        }

    }
}