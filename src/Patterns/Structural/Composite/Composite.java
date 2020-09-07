package Patterns.Structural.Composite;
/*
Компоновщик — это структурный паттерн проектирования, который позволяет сгруппировать
множество объектов в древовидную структуру, а затем работать с ней так, как будто это единичный объект.

В примере класс Bag - компоновщик, он может содержать как объекты типа Something, так и объекты типа Bag.
Клиент собирает сумку с вещами, а затем перебирает их.
 */

import java.util.ArrayList;

public class Composite {

    public static void main(String[] args) {
        Thing many = new Something("some many");
        Thing key = new Something("a key");
        Thing dress = new Something("a dress");
        Thing passport = new Something("a passport");
        Thing shoes = new Something("a shoes");

        Bag littleBag = new Bag("a littleBag");
        littleBag.addThings(many);
        littleBag.addThings(key);
        littleBag.addThings(passport);

        Bag bigBag = new Bag("a bigBag");
        bigBag.addThings(dress);
        bigBag.addThings(shoes);
        bigBag.addThings(littleBag);

        littleBag.removeThings(key);
        bigBag.print();

    }
}