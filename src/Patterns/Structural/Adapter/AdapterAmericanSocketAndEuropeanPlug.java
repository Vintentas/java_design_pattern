package Patterns.Structural.Adapter;

class AdapterAmericanSocketAndEuropeanPlug extends AmericanPlug {
    EuropeanPlug europeanPlug = new EuropeanPlug();

    void connectWithAmericanSocket () {
        System.out.println("Used adapter");
        europeanPlug.connectWithEuropeanSocket();
    }

}
