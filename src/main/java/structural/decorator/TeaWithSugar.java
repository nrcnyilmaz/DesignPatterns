package structural.decorator;

/**
 * @author Nurcan Yilmaz
 */
public class TeaWithSugar extends AbstractDecorator {

    public TeaWithSugar(IDrink tea) {
        super(tea);
    }

    @Override
    public void makeDrink() {
        super.makeDrink();
        System.out.println("Sugar is added.");
    }
}
