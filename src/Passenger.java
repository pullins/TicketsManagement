import java.util.*;

public class Passenger {
	String name;
	//int total;
	public List<Tickets> tickets = new LinkedList<Tickets>();
	
	
	public void buyTicket(FlightLine fl, int n){
		tickets.addAll(fl.sellTicket(n));
	}
	
	public void showTicket(FlightLine fl){
		Iterator<Tickets> iter = tickets.iterator();
		while(iter.hasNext()){
			if(iter.next().getFlightLine().equals(fl.getName())){
				System.out.println("Ticket: "+fl.getName());
			}
		}
	}
		
	public void useTicket(FlightLine fl, int n){
		for(int i=0;i<n;i++){
			fl.checkTicket(this);
			tickets.remove(0);
		}
	}
	
}
	
	