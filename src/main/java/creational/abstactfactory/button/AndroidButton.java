package creational.abstactfactory.button;

/**
 * @author Nurcan Yilmaz
 */
public class AndroidButton implements IButton {

    @Override
    public void click() {
        //do something
        System.out.println("Android Button is clicked");
    }

    @Override
    public void changeColor(String color) {
        //do something
        System.out.println("Android button color is changed to " + color);
    }

}
