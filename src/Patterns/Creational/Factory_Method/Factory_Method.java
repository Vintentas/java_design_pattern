package Patterns.Creational.Factory_Method;

/*
Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов
в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
(решает проблему создания различных продуктов, без указания конкретных классов продуктов.)

В примере: Vacation - фабричный метод, через который можно создать и получить продукт - объект типа Ticket.
Клиент выбирает метод путешествия, в первом случае на самолете, в другом - на поезде.
 */

public class Factory_Method {

    public static void main(String[] args) {
        Vacation vacation = new goingToVacationByPlane();
        Ticket ticket = vacation.startingVacation();
        ticket.buy();

        vacation = new goingToVacationByTrain();
        ticket = vacation.startingVacation();
        ticket.buy();

    }
}