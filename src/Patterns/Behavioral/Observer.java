package Patterns.Behavioral;

/*
Наблюдатель — это поведенческий паттерн проектирования, который создаёт механизм подписки,
позволяющий одним объектам следить и реагировать на события, происходящие в других объектах.
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

class Advertising {
    ArrayList<Person> people = new ArrayList<>();
    String massage;

    void addPerson (Person person) {
        people.add(person);
    }

    void removePerson (Person person) {
        people.remove(person);
    }

    void sentSpam(String massage) {
        this.massage = massage;
        System.out.println("Send massage: \"" + massage + "\"");
        for (Person person : people) {
            person.getSpam(massage);
        }
    }
}

interface Person {
    void getSpam(String string);
}

class PersonImpl implements Person {
    String name;

    PersonImpl(String string) {
        name = string;
    }

    @Override
    public void getSpam(String string) {
        System.out.println("  " + name + " gets massage: \"" + string + "\"");
    }
}


