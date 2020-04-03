package structural.decorator;

/**
 * @author Nurcan Yilmaz
 */
public abstract class AbstractDecorator implements IDrink {

    private IDrink tea;

    public AbstractDecorator(IDrink tea) {
        this.tea = tea;
    }

    @Override
    public void makeDrink() {
        tea.makeDrink();
    }
}
