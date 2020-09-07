package Patterns.Creational.Singleton;

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
