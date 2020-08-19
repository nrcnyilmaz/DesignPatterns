package behavioral.strategy;

import java.util.Scanner;

/**
 * @author Nurcan Yilmaz
 */
public class StrategyMainClass {

    public static void main(String[] args) {

        System.out.println(" ** STRATEGY DESIGN PATTERN DEMO ** ");

        Scanner in = new Scanner(System.in);
        IAttack attack = null;
        Context context = new Context();
        int input;

        System.out.println("Choose weapon: \n1-Knife\n2-Blade\n3-Gun\n");
        input = in.nextInt();
        switch (input) {
            case 1:
                attack = new Knife();
                break;
            case 2:
                attack = new Blade();
                break;
            case 3:
                attack = new Gun();
                break;
            default:
                System.out.println("Please enter valid weapon");
                main(args);
                return;
        }

        context.setChoice(attack);
        context.attack();

    }
}
