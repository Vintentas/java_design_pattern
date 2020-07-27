package Patterns.Creational;

/*
Прототип — это порождающий паттерн проектирования, который позволяет копировать объекты,
не вдаваясь в подробности их реализации.
*/


public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("grin", "BMW", new Engine(500));
        Car car2 = (Car) car1.clone();

        System.out.println("Cars is same? " + (car1 == car2));
        System.out.println("Engines is same? " + (car1.engine == car2.engine));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }

}

class Car implements Cloneable {
    String model;
    String color;
    Engine engine;

    Car (String color, String model, Engine engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    protected Object clone()  {
        Engine engine = (Engine) this.engine.clone();
        return new Car(color, model, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine.getPower() +
                '}';
    }
}

class Engine implements Cloneable {
    int power;

    Engine (int power) {
        this.power = power;
    }

    protected Object clone()  {
        return new Engine(power);
    }

    public int getPower() {
        return power;
    }
}

