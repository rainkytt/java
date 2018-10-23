// Klassside näide, seotud klassiga Main
package tutYlesanded;

public class Car { // "public" ehk piiramatu ligipääs ehk "access modifier"

    private int doors; // kasutamiseks saadaval ainult "Car" klassile
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) { // loome avaliku meetodi (method to update a model), parameetriga "String"
        this.model = model; // "this" is referring to a field in a class = parameetriks on "mudel"
    }

    public String getModel() { // a method that can be call elsewhere to return what the current model is
        return this.model;
    }
}
