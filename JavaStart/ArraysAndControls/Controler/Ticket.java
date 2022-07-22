package JavaStart.ArraysAndControls.Controler;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private final LocalDateTime timeOfPurchace;
    private final int validityTime;

    public Ticket(int validityTime) {
        this(LocalDateTime.now(), validityTime);
    }

    public Ticket(LocalDateTime timeOfValidating, int validityTime) {
        this.timeOfPurchace = timeOfValidating;
        this.validityTime = validityTime;
    }

    public boolean isValid() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfPurchace, currentTime);
        return duration.toMinutes() < validityTime;
    }
}
