package creational.abstactfactory.button;

import creational.abstactfactory.button.IButton;

/**
 * @author Nurcan Yilmaz
 */
public class WindowsPhoneButton implements IButton {

    @Override
    public void click() {
        //do something
        System.out.println("Windows Phone button is clicked.");
    }

    @Override
    public void changeColor(String color) {
        //do something
        System.out.println("Windows Phone button color is changed to " + color);
    }

}
