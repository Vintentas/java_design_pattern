package Patterns.Behavioral;

/*
Цепочка обязанностей — это поведенческий паттерн проектирования,
который позволяет передавать запросы последовательно по цепочке обработчиков.
Каждый последующий обработчик решает, может ли он обработать запрос сам и стоит ли передавать запрос дальше по цепи.
 */

public class Chain_of_Command_OR_Chain_of_Responsibility {
    public static void main(String[] args) {

        Support support = new Answerphone();
        System.out.println("My computer don't work! I need help!");
        support.action();
    }
}

interface Support {
    void action ();
}

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