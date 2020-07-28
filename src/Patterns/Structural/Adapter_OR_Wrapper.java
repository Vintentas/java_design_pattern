package Patterns.Structural;

/*
Адаптер — это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.
 */

public class Adapter_OR_Wrapper {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AdapterAmericanSocketAndEuropeanPlug();
        AmericanSocket americanSocket = new AmericanSocket();
        americanPlug.connectWithAmericanSocket();
        americanSocket.doEnergy (americanPlug);
    }
}

class AdapterAmericanSocketAndEuropeanPlug extends AmericanPlug {
    EuropeanPlug europeanPlug = new EuropeanPlug();

    void connectWithAmericanSocket () {
        System.out.println("Used adapter");
        europeanPlug.connectWithEuropeanSocket();
    }

}

class AmericanSocket {
    void doEnergy (AmericanPlug americanPlug) {
        System.out.println("All work");
    }
}

class AmericanPlug {
    void connectWithAmericanSocket () {
        System.out.println("Have contact with AmericanSocket!");
    }
}

class EuropeanPlug {
    void connectWithEuropeanSocket () {
        System.out.println("Have contact with EuropeanSocket!");
    }
}
