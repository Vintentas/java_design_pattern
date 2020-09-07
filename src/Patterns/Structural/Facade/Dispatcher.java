package Patterns.Structural.Facade;

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
