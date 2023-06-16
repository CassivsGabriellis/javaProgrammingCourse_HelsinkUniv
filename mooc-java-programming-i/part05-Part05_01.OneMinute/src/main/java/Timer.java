
/**
 *
 * @author cassivsgabriellis
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hundrOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundrOfSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundrOfSeconds.advance();

        if (this.hundrOfSeconds.value() == 0) {
            this.seconds.advance();
        }

    }

    public String toString() {
        return seconds + ":" + hundrOfSeconds;
    }
}
