package JavaStart.ArraysAndControls.Controler;

import java.time.LocalTime;

public class Ticket {
    private LocalTime timeOfValidating;
    private int validityTime;

    public Ticket(LocalTime timeOfValidating, int validityTime) {
        this.timeOfValidating = timeOfValidating;
        this.validityTime = validityTime;
    }

    public LocalTime getTimeOfValidating() {
        return timeOfValidating;
    }

    public void setTimeOfValidating(LocalTime timeOfValidating) {
        this.timeOfValidating = timeOfValidating;
    }

    public int getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(int validityTime) {
        this.validityTime = validityTime;
    }
}
