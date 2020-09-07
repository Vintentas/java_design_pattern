package Patterns.Behavioral.Chain_of_Command;

class Master implements Support {

    Support next;

    @Override
    public void action() {
        System.out.println("we are going to you, wait!");
        if (next != null) {
            next.action();
        }
    }
}
