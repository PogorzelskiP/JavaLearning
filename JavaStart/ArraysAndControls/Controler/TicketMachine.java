package JavaStart.ArraysAndControls.Controler;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TicketMachine {
    public static Passenger buyTicket(Passenger passenger, int validityTime) {
        Ticket ticket = new Ticket(validityTime);
        return new Passenger(passenger.getName(), passenger.getSurname(), ticket);
    }
}