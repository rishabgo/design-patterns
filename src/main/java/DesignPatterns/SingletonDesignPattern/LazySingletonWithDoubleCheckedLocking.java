package DesignPatterns.SingletonDesignPattern;

public final class LazySingletonWithDoubleCheckedLocking {
    private static volatile LazySingletonWithDoubleCheckedLocking instance;

    private LazySingletonWithDoubleCheckedLocking() {
    }

    public static LazySingletonWithDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (LazySingletonWithDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new LazySingletonWithDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
