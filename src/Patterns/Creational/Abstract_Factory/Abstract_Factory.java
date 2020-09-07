package Patterns.Creational.Abstract_Factory;

/*
Абстрактная фабрика — это порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов,
не привязываясь к конкретным классам создаваемых объектов.
(Решает проблему создания целых семейств связанных продуктов, без указания конкретных классов продуктов.)

В примере: CarFactory - абстрактная фабрика, которая порождает конкретные фабрики: FordCarFactory и BMWCarFactory.
Продукты - интерфейсы Hatchback и Sedan реализованы в соответствующих классах.
Клиент покупает машину. Сначала выбирается фабрика - производитель, а затем тип конкретной машины.

 */

import Patterns.Creational.Abstract_Factory.Factory.BMWCarFactory;
import Patterns.Creational.Abstract_Factory.Factory.CarFactory;
import Patterns.Creational.Abstract_Factory.Factory.FordCarFactory;

public class Abstract_Factory {

    public static void main(String[] args) {
        CarFactory carFactory = new FordCarFactory();
        System.out.println(carFactory.createHatchback().printMassage());
        System.out.println(carFactory.createSedan().printMassage());

        carFactory = new BMWCarFactory();
        System.out.println(carFactory.createHatchback().printMassage());
        System.out.println(carFactory.createSedan().printMassage());
    }

}