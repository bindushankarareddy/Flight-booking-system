import java.util.*;
public class Operation_manager extends Employee {
	public ArrayList<Crew> crew = new  ArrayList<>();
	public Operation_manager(String name, String address, String email,
			int tel, String title) {
		super(name, address, email, tel, title);
		// TODO Auto-generated constructor stub
	}
	public String addCrewMember(Crew c) {
		if(crew.size()>=10) {
			return "Already manages 10. Cannot add more";
		}
		else {
			crew.add(c);
			return "Successfully added "+c.Name;
		}
	}

}
