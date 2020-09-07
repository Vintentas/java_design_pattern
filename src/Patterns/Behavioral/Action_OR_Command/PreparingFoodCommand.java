package Patterns.Behavioral.Action_OR_Command;

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
