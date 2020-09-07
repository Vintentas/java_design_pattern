package Patterns.Structural.Decorator_OR_Wrapper;

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
