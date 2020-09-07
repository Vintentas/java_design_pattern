package Patterns.Creational.Singleton;

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
