package behavioral.state;

/**
 * @author Nurcan Yilmaz
 */
public class MusicPlayerStateContext {
    private MusicPlayerState state;

    public MusicPlayerStateContext() {
        state = new PlayPlayerState();
    }

    public void setState(MusicPlayerState state) {
        this.state = state;
    }

    public void pressButton(){
        this.state.pressButton(this);
    }
}
