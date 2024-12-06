package lv.rvt;

public class Clock {
    

    private Clock hours;
    private Clock minutes;
    private Clock seconds;

    public Clock() {
        
@SuppressWarnings("All")
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }

    public void advance() {

        @SuppressWarnings("unchecked")
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();

            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }

    public String toString() {
        
@SuppressWarnings("unchecked")
        return hours + ":" + minutes + ":" + seconds;
    }
    
}
