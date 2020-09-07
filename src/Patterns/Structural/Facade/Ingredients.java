package Patterns.Structural.Facade;

class Ingredients {
    private boolean cheese = false;
    private boolean meet = false;
    private boolean vegetables = false;

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setMeet(boolean meet) {
        this.meet = meet;
    }

    public void setVegetables(boolean vegetables) {
        this.vegetables = vegetables;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMeet() {
        return meet;
    }

    public boolean isVegetables() {
        return vegetables;
    }

}
