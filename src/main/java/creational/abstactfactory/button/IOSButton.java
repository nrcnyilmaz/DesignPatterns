package creational.abstactfactory.button;

/**
 * @author Nurcan Yilmaz
 */
public class IOSButton implements IButton {
    @Override
    public void click() {
        //do something
        System.out.println("IOS button is clicked.");
    }

    @Override
    public void changeColor(String color) {
        //do something
        System.out.println("IOS button color is changed to " + color);
    }

}
