package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observerable {
    List<Observer> observerList = new ArrayList<>();
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void postMessage(String message) {
        System.out.println(userName + " : " + message);
        notifyAllSubscribers(message);

    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribers(String message) {
        observerList.forEach(observer -> {
            observer.getMessage(message);
        });
    }
}
