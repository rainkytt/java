// ül 4 Athlete
package Tunnis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        Scanner inputName = new Scanner(System.in);
        Scanner inputResult = new Scanner(System.in);
        while (true) {
            System.out.println("Sisesta sportlase nimi: ");
            String name = inputName.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Sisesta sportlase tulemus: ");
            Double result = inputResult.nextDouble();
            athletes.add(new Athlete(name, result));
        }

        Collections.sort(athletes);

        for (Athlete athlete : athletes) {
            System.out.printf("%s\t\t%5.2f\n", athlete.getName(), athlete.getResult());
        }

    }
}