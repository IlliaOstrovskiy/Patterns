package generating_patterns.singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("First");
        Singleton anotherSingleton = Singleton.getInstance("Second");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}