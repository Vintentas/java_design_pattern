package Patterns.Creational.Singleton;

/*
Одиночка — это порождающий паттерн проектирования, который гарантирует,
что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.

В примере представлены 2 варианта: простой и с синхронизацией для многопоточных приложений.
 */

public class Singleton {
    public static void main(String[] args) {

        MySingletonSimple mySingletonSimple1 = MySingletonSimple.getSingletonSimple();
        MySingletonSimple mySingletonSimple2 = MySingletonSimple.getSingletonSimple();

        System.out.println("should be true: " + (mySingletonSimple1 == mySingletonSimple2));

    }
}

