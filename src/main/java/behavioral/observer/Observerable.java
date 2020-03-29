package behavioral.observer;

public interface Observerable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllSubscribers(String message);
}
