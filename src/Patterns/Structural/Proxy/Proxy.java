package Patterns.Structural.Proxy;

/*
Заместитель — это структурный паттерн проектирования, который позволяет подставлять вместо реальных объектов
специальные объекты-заменители. Эти объекты перехватывают вызовы к оригинальному объекту,
позволяя сделать что-то до или после передачи вызова оригиналу.

В примере: CreditCard - является прокси объектом и замещает объект CashMany.
Клиент использует кредитную карту, если ему не хватает наличных средств.
 */

public class Proxy {
    public static void main(String[] args) {
        Many many = new CashMany();
        many.getMany(30);
        many.spendMany();
        many.getMany(70);
        many.spendMany();

        System.out.println("-----------------");

        many = new CreditCard();
        many.getMany(30);
        many.spendMany();
        many.getMany(70);
        many.spendMany();
    }
}