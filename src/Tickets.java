
public class Tickets {
	private String flightLine;
	//int id;
	boolean notValid=false;
	

	public String getFlightLine(){
		return flightLine;
	}
	
	public Tickets(){
		super();
	}
	public Tickets(FlightLine fl){
		this.flightLine=fl.getName();
	}
	
}
