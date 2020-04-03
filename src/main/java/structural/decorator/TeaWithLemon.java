package structural.decorator;

/**
 * @author Nurcan Yilmaz
 */
public class TeaWithLemon extends AbstractDecorator {
    public TeaWithLemon(IDrink tea) {
        super(tea);
    }

    @Override
    public void makeDrink() {
        super.makeDrink();
        System.out.println("Lemon is added. We are from Erzurum :D");
    }
}
