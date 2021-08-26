package creational.abstactfactory;

import creational.abstactfactory.button.IButton;

/**
 * @author Nurcan Yilmaz
 */
public class AbstractFactoryMainClass {

    public static void main(String[] args) {

        System.out.println(" ** ABSTRACT METHOD DESIGN PATTERN DEMO ** ");

        AbstractFactory androidFactory = new AndroidFactory();
        IButton androidButton = androidFactory.createButton();
        androidButton.click();

        AbstractFactory iosFactory = new IOSFactory();
        IButton iosButton = iosFactory.createButton();
        iosButton.click();
        iosButton.changeColor("GREEN");


    }
}
