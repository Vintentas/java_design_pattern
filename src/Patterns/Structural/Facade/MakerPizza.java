package Patterns.Structural.Facade;

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