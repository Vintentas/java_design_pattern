package Patterns.Creational.Factory_Method;

class PlaneTicket implements Ticket {
    @Override
    public void buy() {
        System.out.println("You bought the ticket on the plane");
    }
}
