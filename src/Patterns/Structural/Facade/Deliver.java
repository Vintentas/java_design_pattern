package Patterns.Structural.Facade;

class Deliver {

    MakerPizza makerPizza;

    Deliver(MakerPizza makerPizza) {
        this.makerPizza = makerPizza;
    }

    void deliverPizza() {
        if(makerPizza.isPizza()) {
            System.out.println("Pizza is being delivered...");
            System.out.println("Pizza is being delivered...");
            System.out.println("Pizza is delivered");
            makerPizza.setPizza(false);
        }
    }
}
