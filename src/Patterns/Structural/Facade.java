package Patterns.Structural;


/*
Фасад — это структурный паттерн проектирования,
который предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.
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

class Dispatcher {
    Ingredients ingredients = new Ingredients();
    MakerPizza makerPizza = new MakerPizza(ingredients);
    Deliver deliver = new Deliver(makerPizza);

    void orderPizza () {
        ingredients.setCheese(true);
        ingredients.setMeet(true);
        ingredients.setVegetables(true);

        makerPizza.makePizza();

        deliver.deliverPizza();
    }

}


class Ingredients {
    private boolean cheese = false;
    private boolean meet = false;
    private boolean vegetables = false;

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setMeet(boolean meet) {
        this.meet = meet;
    }

    public void setVegetables(boolean vegetables) {
        this.vegetables = vegetables;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMeet() {
        return meet;
    }

    public boolean isVegetables() {
        return vegetables;
    }

}

class MakerPizza {

    private Ingredients ingredients;
    private boolean pizza = false;

    MakerPizza(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isPizza() {
        return pizza;
    }

    public void setPizza(boolean pizza) {
        this.pizza = pizza;
    }


    void makePizza (){
        if (ingredients.isVegetables() && ingredients.isCheese() && ingredients.isMeet()){
            System.out.println("Pizza is being cooked...");
            System.out.println("Pizza is being cooked...");
            System.out.println("Pizza is cooked");
            pizza = true;
        }
    }

}

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

