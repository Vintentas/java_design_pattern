package Patterns.Structural;

/*
Заместитель — это структурный паттерн проектирования, который позволяет подставлять вместо реальных объектов
специальные объекты-заменители. Эти объекты перехватывают вызовы к оригинальному объекту,
позволяя сделать что-то до или после передачи вызова оригиналу.
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

class CreditCard implements Many {
    CashMany cashMany = new CashMany();
    int debt;

    @Override
    public void getMany(int cash) {
        cashMany.getMany(cash);
    }

    @Override
    public void spendMany() {
        int cash = cashMany.cash;
        if (cash < 100) {
            debt += 100 - cash;
            cashMany.getMany(debt);
            System.out.println("You took out a loan. Your duty " + debt + "$");
        }
            cashMany.spendMany();
    }
}


class CashMany implements Many {
    int cash;

    @Override
    public void getMany(int cash) {
        this.cash += cash;
        System.out.println("You got " + cash + "$");
    }

    @Override
    public void spendMany() {
        if (cash < 100) {
            System.out.println("You have not any many :( You have only " + cash + "$");
        } else {
            cash -= 100;
            System.out.println("You spent 100$. Now you have " + cash + "$");
        }
    }
}

interface Many {
    void getMany (int cash);
    void spendMany ();
}
