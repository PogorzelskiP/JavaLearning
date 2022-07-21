package JavaStart.ArraysAndControls.Controler;

import java.util.Arrays;

public class TicketController {
    static Passenger[] passengersWithValidTicket(Passenger[] passengers) {
        int x = 0;
        Passenger[] passengers1 = new Passenger[5];
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if(ticket.isValid()){
                passengers1[x] = passenger;
                x++;
            }
        }
        return passengers1;
    }
    

    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[5];
        passengers[0] = TicketMachine.buyTicket(new Passenger("Paweł", "Pogorzelki"),45);
        passengers[1] = TicketMachine.buyTicket(new Passenger("Dawid", "Świerzbiński"),25);
        passengers[2] = TicketMachine.buyTicket(new Passenger("Natalia", "Wolszczuk"), 90);
        passengers[3] = TicketMachine.buyTicket(new Passenger("Aneta", "Jodczyk"), 10);
        passengers[4] = TicketMachine.buyTicket(new Passenger("Wojciech", "Bloch"), 30);

    }
}