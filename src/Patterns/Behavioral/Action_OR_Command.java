package Patterns.Behavioral;

/*
Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты,
позволяя передавать их как аргументы при вызове методов, ставить запросы в очередь,
логировать их, а также поддерживать отмену операций.
 */

public class Action_OR_Command {
    public static void main(String[] args) {
        Water water = new Water();
        water.setCommand(new PreparingFoodCommand("Soup"));
        water.setCommand(new PreparingFoodCommand("Salad"));
    }
}

class Water {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
        command.execute();
    }
}

interface Command {
    void execute();
}

class PreparingFoodCommand implements Command {
    String food;

    PreparingFoodCommand (String food) {
        this.food = food;
    }

    @Override
    public void execute() {
        Cook cook = new Cook (food);
    }
}

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
