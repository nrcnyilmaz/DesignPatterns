package behavioral.state;

/**
 * @author Nurcan Yilmaz
 */
public class PlayPlayerState implements MusicPlayerState {
    @Override
    public void pressButton(MusicPlayerStateContext context) {
        System.out.println("Music is playing.");
        context.setState(new PausePlayerState());
    }
}
