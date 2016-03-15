
public class TicketsManagement {
	public static void main(String[] args){
		FlightLine sss = new FlightLine("ChunQiu");
		sss.createTicket(10);
		sss.showName();
		///sss.showSold();
		
		Passenger p = new Passenger();
		p.buyTicket(sss, 5);
		sss.showSold();
		
		///p.showTicket(sss);
		p.useTicket(sss, 3);
		p.showTicket(sss);
		
		
	}

}
