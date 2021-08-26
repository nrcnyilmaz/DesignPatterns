package creational.abstactfactory;

import creational.abstactfactory.button.AndroidButton;
import creational.abstactfactory.button.IButton;

/**
 * @author Nurcan Yilmaz
 */
public class AndroidFactory extends  AbstractFactory {

    @Override
    IButton createButton() {
        return new AndroidButton();
    }

}
