package Patterns.Structural.Composite;

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
