package JavaStart.ArraysAndControls.Controler;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private final LocalDateTime timeOfValidating;
    private final int validityTime;

    public Ticket(int validityTime) {
        this(LocalDateTime.now(), validityTime);
    }
    public Ticket(LocalDateTime timeOfValidating, int validityTime) {
        this.timeOfValidating = timeOfValidating;
        this.validityTime = validityTime;
    }

    public LocalDateTime getTimeOfValidating() {
        return timeOfValidating;
    }

    public long getValidityTime() {
        return validityTime;
    }

    public boolean isValid(){
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfValidating, currentTime);
        return duration.toMinutes() < validityTime;
    }
}
