package Patterns.Behavioral.Observer;

import java.util.ArrayList;

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
