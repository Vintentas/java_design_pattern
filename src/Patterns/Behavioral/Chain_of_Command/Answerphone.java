package Patterns.Behavioral.Chain_of_Command;

class Answerphone implements Support {

    Support next = new Manager();

    @Override
    public void action() {
        System.out.println("press the key...");
        System.out.println("...if it don't work, pleas wait...");
        if (next != null) {
            next.action();
        }
    }
}
