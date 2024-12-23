package lv.rvt;

public class Timer {
    private ClockHand hundredthsOfASecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfASecond = new ClockHand(100); 
        this.seconds = new ClockHand(60); 
    }

    public void advance() {
        this.hundredthsOfASecond.advance(); 

        
        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return String.format("%02d:%02d", this.seconds.value(), this.hundredthsOfASecond.value());
    }

   
}
