package Patterns.Structural.Proxy;

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
