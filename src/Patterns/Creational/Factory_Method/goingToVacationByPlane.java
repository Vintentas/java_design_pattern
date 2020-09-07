package Patterns.Creational.Factory_Method;

class goingToVacationByPlane extends Vacation {
    Ticket startingVacation () {
        return new PlaneTicket();
    }
}
