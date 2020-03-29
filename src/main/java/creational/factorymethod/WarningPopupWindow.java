package creational.factorymethod;

public class WarningPopupWindow extends PopupWindow{

    public WarningPopupWindow() {
        color = "Yellow";
    }

    @Override
    public void show() {
        System.out.println("Warning popup window is displaying. Window color is: " + color);
    }
}
