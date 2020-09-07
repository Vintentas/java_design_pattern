package Patterns.Structural.Adapter;

/*
Адаптер — это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.

 В примере адептером выступает класс AdapterAmericanSocketAndEuropeanPlug.
 Паттерн реализован с использованием наследования и компазиции.
  */

public class Adapter {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AdapterAmericanSocketAndEuropeanPlug();
        AmericanSocket americanSocket = new AmericanSocket();
        americanPlug.connectWithAmericanSocket();
        americanSocket.doEnergy (americanPlug);
    }
}

