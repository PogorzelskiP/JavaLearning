package JavaStart.ArraysAndControls.Controler;

import java.time.LocalTime;
public class TicketMachine {
    public static Passenger buyTicket(Passenger passenger, int validityTime) {
        LocalTime localTime = LocalTime.now();
        Ticket ticket = new Ticket(localTime, validityTime);
        return new Passenger(passenger.getName(), passenger.getSurname(), ticket);
    }
}