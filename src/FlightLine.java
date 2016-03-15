import java.util.*;

public class FlightLine {
	private String flightLineName;
	private int total;
	private int ticketsSold;
	List<Tickets> tickets;
	
	
	/*public FlightLine(){
		super();
	}
	*/
	
	public FlightLine(String name){
		this.flightLineName = name;
		tickets = new LinkedList<Tickets>();
	}
	
	public void createTicket(int n){
		for(int i=0;i<n;i++){
			Tickets tck = new Tickets(this);
			this.tickets.add(tck);
			this.total++;
		}
	}
	
	public List<Tickets> sellTicket(int n){
		if(n>total){
			System.out.println("There is no enough tickets for sale.");
			return null; 
		}
		List<Tickets> result = new LinkedList<Tickets>();
		for(int i=0;i<n;i++){
			result.add(this.tickets.get(0));
			this.tickets.remove(0);
			this.total--;
			this.ticketsSold++;
		}
		return result;
	}

	public void showName(){
		System.out.println("The Flight Line is: " + flightLineName);
	}
	
	public String getName(){
		return this.flightLineName;
	}
	
	public void showSold(){
		System.out.println("Total tickets sold: "+ticketsSold);
	}
	
	public boolean checkTicket(Passenger p){
		Iterator<Tickets> iter = p.tickets.iterator();
		while(iter.hasNext()){
			return iter.next().getFlightLine().equalsIgnoreCase(this.flightLineName)?true:false;
		}
		return false;
	}
}