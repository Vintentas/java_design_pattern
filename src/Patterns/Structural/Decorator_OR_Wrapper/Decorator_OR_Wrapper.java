package Patterns.Structural.Decorator_OR_Wrapper;

/*
Декоратор — это структурный паттерн проектирования, который позволяет динамически добавлять
объектам новую функциональность, оборачивая их в полезные «обёртки».

В примере используются 3 декоратора: PrinterImpDecoratorAfter, PrinterImpDecoratorBefore и PrinterImpDecoratorAround.
 */

public class Decorator_OR_Wrapper {
    public static void main(String[] args) {
        Printer printer =
                new PrinterImpDecoratorAround(
                        new PrinterImpDecoratorBefore(
                                new PrinterImpDecoratorAfter(
                                        new PrinterImp("world"))));
        printer.print();
    }
}

