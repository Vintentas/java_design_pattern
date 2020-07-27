package Patterns.Creational;

/*
Фабричный метод — это порождающий паттерн проектирования,
который определяет общий интерфейс для создания объектов в суперклассе,
позволяя подклассам изменять тип создаваемых объектов.
 */

public class Factory_Method {
    public static void main(String[] args) {
        Vacation vacation = new goingToVacationByPlane();
        Ticket ticket = vacation.startingVacation();
        ticket.buy();

        vacation = new goingToVacationByTrain();
        ticket = vacation.startingVacation();
        ticket.buy();

    }
}

class goingToVacationByPlane extends Vacation {
    Ticket startingVacation () {
        return new PlaneTicket();
    }
}

class goingToVacationByTrain extends Vacation {
    Ticket startingVacation () {
        return new TrainTicket();
    }
}

abstract class Vacation {
    abstract Ticket startingVacation();
}


class PlaneTicket implements Ticket {
    @Override
    public void buy() {
        System.out.println("You bought the ticket on the plane");
    }
}

class TrainTicket implements Ticket {
    @Override
    public void buy() {
        System.out.println("You bought the ticket on the train");
    }
}

interface Ticket {
    void buy();
}