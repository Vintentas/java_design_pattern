package Patterns.Structural;

/*
Декоратор — это структурный паттерн проектирования, который позволяет динамически добавлять
объектам новую функциональность, оборачивая их в полезные «обёртки».
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

interface Printer {
    void print();
}

class PrinterImp implements Printer {
    String value;

    PrinterImp(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

class PrinterImpDecoratorAfter implements Printer {
    Printer printer;

    PrinterImpDecoratorAfter (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
        System.out.print("!");
    }
}

class PrinterImpDecoratorBefore implements Printer {
    Printer printer;

    PrinterImpDecoratorBefore (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print("Hello ");
        printer.print();
    }
}

class PrinterImpDecoratorAround implements Printer {
    Printer printer;

    PrinterImpDecoratorAround (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.print(" ~~~ ");
        printer.print();
        System.out.print(" ~~~ ");
    }
}