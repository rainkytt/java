package tutYlesanded;

import java.util.Scanner;

public class user_INPUT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // to handle the Enter key, et program ise lõpuni ei jookseks

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        System.out.println("Your name is: " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}
