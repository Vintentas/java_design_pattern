package Patterns.Behavioral.Chain_of_Command;

/*
Цепочка обязанностей — это поведенческий паттерн проектирования,
который позволяет передавать запросы последовательно по цепочке обработчиков.
Каждый последующий обработчик решает, может ли он обработать запрос сам и стоит ли передавать запрос дальше по цепи.

В примере цепочка обязанностей состоит из классов, которые реализуют интерфейс Support.
Клиент звонит в тех. службу. Его звонок проходит через несколько фаз.
 */

public class Chain_of_Command {
    public static void main(String[] args) {

        Support support = new Answerphone();
        System.out.println("My computer don't work! I need help!");
        support.action();
    }
}