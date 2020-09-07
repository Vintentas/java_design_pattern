package Patterns.Structural.Facade;


/*
Фасад — это структурный паттерн проектирования,
который предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.

В примере класс Dispatcher - является фасадом. Он скрывает внутри работу нескольких методов.
 */

public class Facade {

    public static void main(String[] args) {

        withoutFacade();
        System.out.println("----");
        withFaced();

    }

    static void withoutFacade() {
        Ingredients ingredients = new Ingredients();
        ingredients.setCheese(true);
        ingredients.setMeet(true);
        ingredients.setVegetables(true);

        MakerPizza makerPizza = new MakerPizza(ingredients);
        makerPizza.makePizza();

        Deliver deliver = new Deliver(makerPizza);
        deliver.deliverPizza();

    }

    static void withFaced() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.orderPizza();

    }
}

