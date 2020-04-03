package structural.decorator;

/**
 * @author Nurcan Yilmaz
 */
public class TeaWithCinnamon extends AbstractDecorator {
    public TeaWithCinnamon(IDrink tea) {
        super(tea);
    }

    @Override
    public void makeDrink() {
        super.makeDrink();
        System.out.println("Cinnamon is added.");
    }
}
