package Patterns.Behavioral.Observer;

/*
Наблюдатель — это поведенческий паттерн проектирования, который создаёт механизм подписки,
позволяющий одним объектам следить и реагировать на события, происходящие в других объектах.

Наблюдателями являются объекты, реализующие интерфейс Person. Пользователи получают рассылку от класса Advertising.
 */

import java.util.ArrayList;

public class Observer {
    public static void main(String[] args) {
        Advertising advertising = new Advertising();

        PersonImpl anna = new PersonImpl("Anna");
        advertising.addPerson(anna);
        advertising.addPerson(new PersonImpl("Elena"));
        advertising.sentSpam("spam");
        advertising.addPerson(new PersonImpl("Anton"));
        advertising.sentSpam("more spams");
        advertising.removePerson(anna);
        advertising.sentSpam("a lot of spam");
    }
}


