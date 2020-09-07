package Patterns.Creational.Abstract_Factory.Factory;

import Patterns.Creational.Abstract_Factory.Product.BMVHatchback;
import Patterns.Creational.Abstract_Factory.Product.BMVSedan;
import Patterns.Creational.Abstract_Factory.Product.Hatchback;
import Patterns.Creational.Abstract_Factory.Product.Sedan;

public class BMWCarFactory extends CarFactory {
    @Override
    public Sedan createSedan() {
        return new BMVSedan();
    }

    @Override
    public Hatchback createHatchback() {
        return new BMVHatchback();
    }
}
