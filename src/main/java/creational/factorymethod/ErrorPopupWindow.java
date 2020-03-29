package creational.factorymethod;

public class ErrorPopupWindow extends PopupWindow {

    public ErrorPopupWindow() {
        color ="Red";
    }

    @Override
    void show() {
        System.out.println("Error popup window is displaying. Window color is: " + color);
    }
}
