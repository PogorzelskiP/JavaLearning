package JavaStart.ArraysAndControls.Controler;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[5];
        passengers[0] = new Passenger("Paweł", "Pogorzelski");
        passengers[1] = new Passenger("Rafał", "Wolszczuk");
        passengers[2] = new Passenger("Natalia", "Wolszczuk");
        passengers[3] = new Passenger("Aneta", "jodczyk");
        passengers[4] = new Passenger("Kasia", "Kowalska");

        TicketMachine.buyTicket(passengers[2], 20);
        TicketMachine.buyTicket(passengers[3], 20);

        Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        passengers[1].setTicket(invalidTicket);

        Passenger[] passengerWithoutTicket = validateTickets(passengers);
        System.out.println("Na gapę jadą");
        for (Passenger passenger : passengerWithoutTicket) {
            System.out.println(passenger.getName() + " " + passenger.getSurname());
        }
    }
        private static Passenger[] validateTickets(Passenger[] passengers) {
            int passengersWithoutTicket = 0;
            for (Passenger passenger : passengers) {
                Ticket ticket = passenger.getTicket();
                if(ticket == null || !ticket.isValid())
                    passengersWithoutTicket++;
            }

            Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
            for (int i = 0, j = 0; i < passengers.length; i++) {
                Ticket ticket = passengers[i].getTicket();
                if(ticket == null || !ticket.isValid()) {
                    withoutTicket[j] = passengers[i];
                    j++;
                }
            }
            return withoutTicket;
        }
    }