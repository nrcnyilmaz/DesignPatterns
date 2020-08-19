package behavioral.state;

/**
 * @author Nurcan Yilmaz
 */
public class PausePlayerState implements MusicPlayerState {
    @Override
    public void pressButton(MusicPlayerStateContext context) {
        System.out.println("Music is paused.");
        context.setState(new PlayPlayerState());
    }
}
