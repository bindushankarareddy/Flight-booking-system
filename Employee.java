import java.util.*;
public class Employee extends Person {
	public String Title;
	public ArrayList<Integer> flightsIWorkOn = new ArrayList<Integer>();
	public Employee(String name, String address, String email, int tel, String title) {
		super(name, address, email, tel);
		Title=title;
	} 
	
	public String addFlight(Flight flight){
		flightsIWorkOn.add(flight.Flight_number);
		return "Flight added";
	}
	public String deleteFlight(Flight flight){
		flightsIWorkOn.remove(flightsIWorkOn.indexOf(flight.Flight_number));
		return "Flight removed";
	}
}
