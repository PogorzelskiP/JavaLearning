package JavaStart.ArraysAndControls.Controler;

import java.time.LocalDateTime;

public class TicketMachine {
    public static void buyTicket(Passenger passenger, int timeMinutes) {
        Ticket ticket = new Ticket(timeMinutes);
        passenger.setTicket(ticket);
    }
}