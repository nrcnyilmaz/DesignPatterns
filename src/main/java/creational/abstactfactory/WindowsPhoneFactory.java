package creational.abstactfactory;

import creational.abstactfactory.button.IButton;
import creational.abstactfactory.button.WindowsPhoneButton;

/**
 * @author Nurcan Yilmaz
 */
public class WindowsPhoneFactory extends AbstractFactory {

    @Override
    IButton createButton() {
        return new WindowsPhoneButton();
    }
}
