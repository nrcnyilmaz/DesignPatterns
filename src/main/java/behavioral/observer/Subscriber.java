package behavioral.observer;

public class Subscriber implements Observer {

    String nickName;

    public Subscriber(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(nickName + " : " + message);
    }
}
