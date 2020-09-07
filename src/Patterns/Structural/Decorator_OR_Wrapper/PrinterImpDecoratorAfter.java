package Patterns.Structural.Decorator_OR_Wrapper;

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
