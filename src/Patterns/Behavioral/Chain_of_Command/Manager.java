package Patterns.Behavioral.Chain_of_Command;

class Manager implements Support {

    Support next = new TechnicalSupport();

    @Override
    public void action() {
        System.out.println("try turning it off and on...");
        System.out.println("...if it don't work, pleas wait...");
        if (next != null) {
            next.action();
        }
    }
}
