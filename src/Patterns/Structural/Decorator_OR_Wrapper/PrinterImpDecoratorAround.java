package Patterns.Structural.Decorator_OR_Wrapper;

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
