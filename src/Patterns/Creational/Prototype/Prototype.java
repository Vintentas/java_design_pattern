package Patterns.Creational.Prototype;

/*
Прототип — это порождающий паттерн, который позволяет копировать объекты любой сложности
без привязки к их конкретным классам.

В примере копируем объект Car через метод clone.
*/

public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("grin", "BMW", new Engine(500));
        Car car2 = (Car) car1.clone();

        System.out.println("Cars is same? " + (car1 == car2));
        System.out.println("Engines is same? " + (car1.engine == car2.engine));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }

}
