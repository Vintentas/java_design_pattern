package Patterns.Creational.Prototype;

class Car implements Cloneable {
    String model;
    String color;
    Engine engine;

    Car (String color, String model, Engine engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    protected Object clone() {
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