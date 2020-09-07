package Patterns.Creational.Prototype;

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
