package Patterns.Structural.Proxy;

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
