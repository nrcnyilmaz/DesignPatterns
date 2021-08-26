package creational.abstactfactory;

import creational.abstactfactory.button.IButton;
import creational.abstactfactory.button.IOSButton;

/**
 * @author Nurcan Yilmaz
 */
public class IOSFactory extends AbstractFactory {
    @Override
    IButton createButton() {
        return new IOSButton();
    }
}
