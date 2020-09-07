package Patterns.Creational.Abstract_Factory.Product;

public class FordSedan implements Sedan {
    @Override
    public String printMassage() {
        return "You bought Ford sedan";
    }
}
