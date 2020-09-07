package Patterns.Behavioral.Chain_of_Command;

class TechnicalSupport implements Support {

    Support next = new Master();

    @Override
    public void action() {
        System.out.println("try updating your driver...");
        System.out.println("...if it don't work, pleas wait...");
        if (next != null) {
            next.action();
        }
    }
}
