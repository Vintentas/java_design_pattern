package Patterns.Creational;

/*
Одиночка — это порождающий паттерн проектирования, который гарантирует,
что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    public static void main(String[] args) {

        MySingletonSimple mySingletonSimple1 = MySingletonSimple.getSingletonSimple();
        MySingletonSimple mySingletonSimple2 = MySingletonSimple.getSingletonSimple();

        System.out.println("should be true: " + (mySingletonSimple1 == mySingletonSimple2));

    }
}

class MySingletonSimple {
    static MySingletonSimple mySingletonSimple;

    private MySingletonSimple() {}

    public static MySingletonSimple getSingletonSimple() {
        if (mySingletonSimple == null) {
            mySingletonSimple = new MySingletonSimple();
        }
        return mySingletonSimple;
    }
}

class MySingletonConcurrent {
    static MySingletonConcurrent mySingletonConcurrent;

    private MySingletonConcurrent() {}

    static public MySingletonConcurrent getMySingleton() {
        if (mySingletonConcurrent == null) {
            synchronized (MySingletonConcurrent.class){
                if (mySingletonConcurrent == null) {
                    mySingletonConcurrent = new MySingletonConcurrent();
                }
            }
        }
        return mySingletonConcurrent;
    }
}


