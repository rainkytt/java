// Klasside näide video 25-26, seotud klassiga Car
package tutYlesanded;

public class Main { // klassi (= objekt) tähistatakse suure algustähega "Main"

    public static void main(String[] args) { // meetodid algavad väikse algustähega "main"
        Car porsche = new Car(); // created new datatype called "Porsche" and is of type "Car" (created an object called "Porsche" based on a template called "Car"), peale võrdust on selle "initialize it"
        Car holden = new Car(); // peale võrdust = we used a constructor to create a car object
        System.out.println("Model is " + porsche.getModel()); // andmata parameetriga
        porsche.setModel("Carrera"); // calling a setModel method and updating it with parameter "Carrera"
        System.out.println("Model is " + porsche.getModel());
    }
}
