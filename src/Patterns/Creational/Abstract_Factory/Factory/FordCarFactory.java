package Patterns.Creational.Abstract_Factory.Factory;

import Patterns.Creational.Abstract_Factory.Product.FordHatchback;
import Patterns.Creational.Abstract_Factory.Product.FordSedan;
import Patterns.Creational.Abstract_Factory.Product.Hatchback;
import Patterns.Creational.Abstract_Factory.Product.Sedan;

public class FordCarFactory extends CarFactory{
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Hatchback createHatchback() {
        return new FordHatchback();
    }
}
