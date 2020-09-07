package Patterns.Creational.Factory_Method;

class TrainTicket implements Ticket {
    @Override
    public void buy() {
        System.out.println("You bought the ticket on the train");
    }
}