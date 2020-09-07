package Patterns.Creational.Abstract_Factory.Factory;

import Patterns.Creational.Abstract_Factory.Product.Hatchback;
import Patterns.Creational.Abstract_Factory.Product.Sedan;

public abstract class CarFactory {
    abstract public Sedan createSedan();
    abstract public Hatchback createHatchback();
}
