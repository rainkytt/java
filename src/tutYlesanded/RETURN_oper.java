// see on "overloading methods" sama Meetodi nimi (calculateScore) aga erinevad Parameetrid e. muutujad

package tutYlesanded;

public class RETURN_oper {
    public static void main(String[] args) {
//      calculateScore("Rain", 500); // kui seda rida kasutada, siis 6 ja 7 kustutada
        int newScore = calculateScore("Rain", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75); // rida 18-20 jaoks
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 100; // rida 5 puhul kasutada return 0;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return 0;
    }
}
