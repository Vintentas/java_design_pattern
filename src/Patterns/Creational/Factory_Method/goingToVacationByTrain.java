package Patterns.Creational.Factory_Method;

class goingToVacationByTrain extends Vacation {
    Ticket startingVacation () {
        return new TrainTicket();
    }
}