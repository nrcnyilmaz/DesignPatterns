package creational.factorymethod;

public class SuccessPopupWindow extends PopupWindow {

    public SuccessPopupWindow() {
        color = "Green";
    }

    @Override
    public void show() {
        System.out.println("Success popup window is displaying. Window color is: " + color);

    }
}
