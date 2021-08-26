package creational.abstactfactory;

import creational.abstactfactory.button.IButton;

/**
 * @author Nurcan Yilmaz
 */
public abstract class AbstractFactory {
    abstract IButton createButton();

}
