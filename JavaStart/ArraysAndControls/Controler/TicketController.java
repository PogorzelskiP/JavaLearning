package JavaStart.ArraysAndControls.Controler;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[5];
        passengers[0] = TicketMachine.buyTicket(new Passenger("Paweł","Pogrzelski"), 60);
        passengers[1] = new Passenger("Dawid","Świerzbiński");
        passengers[2] = TicketMachine.buyTicket(new Passenger("Natalia","Wolszczuk"), 90);
        passengers[3] = TicketMachine.buyTicket(new Passenger("Aneta","Jodczyk"), 10);
        passengers[4] = TicketMachine.buyTicket(new Passenger("Wojciech","Bloch"), 30);


    }
}