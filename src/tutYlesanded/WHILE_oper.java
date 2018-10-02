package tutYlesanded;

public class WHILE_oper {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is: " + count);
            count++;
        }

        count = 0;
        do { // käivitub alati vähemalt 1 kord
            System.out.println("Count value was: " + count);
            count++;
        } while (count != 5);

    }
}
