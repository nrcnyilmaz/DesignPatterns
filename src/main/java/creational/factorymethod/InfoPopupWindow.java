package creational.factorymethod;

public class InfoPopupWindow extends PopupWindow {

    public InfoPopupWindow() {
        color = "Blue";
    }

    @Override
    void show() {
        System.out.println("Info popup window is displaying. Window color is: " + color);
    }
}
