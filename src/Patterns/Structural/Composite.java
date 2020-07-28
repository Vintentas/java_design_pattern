package Patterns.Structural;
/*
Компоновщик — это структурный паттерн проектирования, который позволяет сгруппировать
множество объектов в древовидную структуру, а затем работать с ней так, как будто это единичный объект.
 */

import java.util.ArrayList;

public class Composite {
    public static void main(String[] args) {
        Thing many = new Something("some many");
        Thing key = new Something("a key");
        Thing dress = new Something("a dress");
        Thing passport = new Something("a passport");
        Thing shoes = new Something("a shoes");

        Bag littleBag = new Bag("a littleBag");
        littleBag.addThings(many);
        littleBag.addThings(key);
        littleBag.addThings(passport);

        Bag bigBag = new Bag("a bigBag");
        bigBag.addThings(dress);
        bigBag.addThings(shoes);
        bigBag.addThings(littleBag);

        littleBag.removeThings(key);
        bigBag.print();

    }
}

interface Thing {
    void print();

}

class Something implements Thing {
    String name;

    Something (String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("I'am " + name);
    }
}

class Bag implements Thing {
    ArrayList<Thing> things = new ArrayList();
    String name;

    Bag (String name) {
        this.name = name;
    }

    public void addThings (Thing thing) {
        things.add(thing);
    }

    public void removeThings (Thing thing) {
        things.remove(thing);
    }

    @Override
    public void print() {
        if(things != null) {
            System.out.println("I'am " + name + ". I have: ");
            for (Thing thing : things) {
                thing.print();
            }
        }
    }
}
