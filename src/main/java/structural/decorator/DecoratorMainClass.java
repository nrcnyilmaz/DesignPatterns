package structural.decorator;

/**
 * @author Nurcan Yilmaz
 */
public class DecoratorMainClass {

    public static void main(String[] args) {
        System.out.println(" ** DECORATOR DESIGN PATTERN DEMO ** ");

        Tea tea = new Tea(); //made tea
        TeaWithCinnamon teaWithCinnamon = new TeaWithCinnamon(tea); //add lemon to tea
        TeaWithLemon teaWithLemonAndCinnamon = new TeaWithLemon(teaWithCinnamon); //add cinnamon to tea with lemon
        System.out.println("\n--> I want tea with lemon and cinnamon:");
        teaWithLemonAndCinnamon.makeDrink();

        System.out.println("\n--> I want tea:");
        tea.makeDrink();

        TeaWithLemon teaWithLemon = new TeaWithLemon(tea); //add lemon to tea
        System.out.println("\n-->I want tea with lemon:");
        teaWithLemon.makeDrink();

    }
}
