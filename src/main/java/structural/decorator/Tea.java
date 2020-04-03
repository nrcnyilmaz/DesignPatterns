package structural.decorator;

/**
 * @author Nurcan Yilmaz
 */
public class Tea implements IDrink {
    @Override
    public void makeDrink() {
        System.out.println("Tea is made.");
    }
}
