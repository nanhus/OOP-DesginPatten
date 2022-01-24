package source.singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());
    }
}
