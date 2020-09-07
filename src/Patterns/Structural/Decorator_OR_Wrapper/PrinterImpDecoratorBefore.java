package Patterns.Structural.Decorator_OR_Wrapper;

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
