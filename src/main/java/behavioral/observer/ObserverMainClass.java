package behavioral.observer;

public class ObserverMainClass {
    public static void main(String[] args) {
        System.out.println(" ** OBSERVER DESIGN PATTERN DEMO ** ");

        User user = new User("Code Girl");
        Subscriber subscriber = new Subscriber("Subscriber 1");
        Subscriber subscriber1 = new Subscriber("Subscriber 2");

        user.registerObserver(subscriber);
        user.registerObserver(subscriber1);
        user.postMessage("Hello! This is my first post :)");

        user.removeObserver(subscriber1);
        user.postMessage("Hi! This is second post :)");
    }
}
