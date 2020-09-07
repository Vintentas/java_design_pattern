package Patterns.Behavioral.Action_OR_Command;

class Cook {
    String dish;
    Cook (String dish) {
        this.dish = dish;
        cookingFood();
    }

    void cookingFood () {
        System.out.println("get order");
        System.out.println("cookingFood...");
        System.out.println("cookingFood...");
        System.out.println(dish + " is ready");
    }
}
