package Patterns.Creational.Abstract_Factory.Product;

public class FordHatchback implements Hatchback {
    @Override
    public String printMassage() {
        return "You bought Ford hatchback";
    }
}
