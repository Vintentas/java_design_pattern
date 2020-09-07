package Patterns.Structural.Composite;

import java.util.ArrayList;

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
