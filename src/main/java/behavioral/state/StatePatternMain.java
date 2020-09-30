package behavioral.state;

/**
 * @author Nurcan Yilmaz
 */
public class StatePatternMain {

    public static void main(String[] args) {
        System.out.println(" ** STATE DESIGN PATTERN DEMO ** ");
        MusicPlayerStateContext stateContext = new MusicPlayerStateContext(); // state set off
        stateContext.pressButton();
        stateContext.pressButton();
        stateContext.pressButton();

    }
}
