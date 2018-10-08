package tutYlesanded;

public class Massiivid {
    public static void main(String[] args) {
        int[] myIntArray = new int[10]; // massiiv sisaldab 10 elementi 0-9
        myIntArray[0] = 45;
        myIntArray[1] = 55;
        myIntArray[5] = 111;
        System.out.println(myIntArray[5]); // väljastab 6-nda elemendi

        double[] myDoubleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // teisiti massiivi kirjeldus
        System.out.println(myDoubleArray[3]);
        System.out.println(myDoubleArray[7]);

        int[] myIntArray2 = new int[10]; // kolmas viis massiivi jaoks
        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }
        for (int i = 0; i < myIntArray2.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray2[i]);
        }
    }
}
