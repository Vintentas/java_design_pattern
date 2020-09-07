package Patterns.Behavioral.Action_OR_Command;

/*
Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты,
позволяя передавать их как аргументы при вызове методов, ставить запросы в очередь,
логировать их, а также поддерживать отмену операций.
(Позволяющий заворачивать запросы или простые операции в отдельные объекты.)

Класс Water - реализация паттерна команда. Принимает запросы от клиента и передает их повару.
 */

public class Action_OR_Command {
    public static void main(String[] args) {
        Water water = new Water();
        water.setCommand(new PreparingFoodCommand("Soup"));
        water.setCommand(new PreparingFoodCommand("Salad"));
    }
}

