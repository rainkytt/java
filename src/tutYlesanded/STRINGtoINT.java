package tutYlesanded;

public class STRINGtoINT {
    public static void main(String[] args) {
        String numberAsString = "2018.125";
        String numberAsStr = "2018";

        double number = Double.parseDouble(numberAsString);
        int num = Integer.parseInt(numberAsStr);

        numberAsString += 1;
        number += 1;
        num += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
        System.out.println("num = " + num);
    }
}
