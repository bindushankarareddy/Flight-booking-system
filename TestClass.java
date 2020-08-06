import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Operation_manager om = new Operation_manager("Bindu", "Montreal", "abcd", 1234, "operation manager");
		Crew c1 = new Crew("bhargav", "Tirupathi", "efgh", 9874, "pilot");
		Crew c2 = new Crew("bindu", "Tirupathi", "efgh", 9874, "pilot");
		Crew c3 = new Crew("amulya", "Tirupathi", "efgh", 9874, "pilot");
		Crew c4 = new Crew("sibi", "Tirupathi", "efgh", 9874, "pilot");
		Crew c5 = new Crew("chaithra", "Tirupathi", "efgh", 9874, "pilot");
		Crew c6 = new Crew("bhavya", "Tirupathi", "efgh", 9874, "pilot");
		Crew c7 = new Crew("monica", "Tirupathi", "efgh", 9874, "pilot");
		Crew c8 = new Crew("chandu", "Tirupathi", "efgh", 9874, "pilot");
		Crew c9 = new Crew("rachana", "Tirupathi", "efgh", 9874, "pilot");
		Crew c10 = new Crew("babu", "Tirupathi", "efgh", 9874, "pilot");
		Crew c11 = new Crew("keerthi", "Tirupathi", "efgh", 9874, "pilot");
		Crew c12 = new Crew("kunal", "Kolkata", "efgh", 9874, "air host");
		ArrayList<Crew> crew = new ArrayList<Crew>();
		ArrayList<Crew> crew_1 = new ArrayList<Crew>();
		ArrayList<Crew> crew_2 = new ArrayList<Crew>();
		ArrayList<Crew> crew_3 = new ArrayList<Crew>();
		crew_1.add(c1);
		crew_1.add(c2);
		crew_1.add(c3);
		crew_1.add(c4);
		crew_2.add(c1);
		crew_2.add(c2);
		crew_2.add(c3);
		crew_2.add(c4);
		crew_2.add(c5);
		crew_2.add(c6);
		crew_2.add(c7);
		crew_3.add(c1);
		crew_3.add(c2);
		crew_3.add(c3);
		System.out.println(om.addCrewMember(c1));
		System.out.println(om.addCrewMember(c2));
		System.out.println(om.addCrewMember(c3));
		System.out.println(om.addCrewMember(c4));
		System.out.println(om.addCrewMember(c5));
		System.out.println(om.addCrewMember(c6));
		System.out.println(om.addCrewMember(c7));
		System.out.println(om.addCrewMember(c8));
		System.out.println(om.addCrewMember(c9));
		System.out.println(om.addCrewMember(c10));
		System.out.println(om.addCrewMember(c11));
		Airport origin = new Airport("Bangalore");
		Airport destination = new Airport("Singapore");
		Airline airline=new Airline("Reddy");
		Flight f1= new Flight(1345, origin, 
				destination, 20200219, 20200220, 
				1430, 1730, 1435, 1735, om, crew_1, airline);
		Flight f2= new Flight(1345, origin, 
				destination, 20200219, 20200220, 
				1430, 1730, 1435, 1845, om, crew_1, airline);
		Flight f200= new Flight(1346, origin, 
				destination, 20200219, 20200220, 
				1430, 1530, 1435, 1535, om, crew_1, airline);
		Flight f210= new Flight(1347, origin, 
				destination, 20200219, 20200220, 
				1430, 1830, 1435, 1835, om, crew_2, airline);
		Flight f220= new Flight(1348, origin, 
				destination, 20200219, 20200220, 
				1430, 1830, 1435, 1835, om, crew_3, airline);
		//System.out.println(f1.Flight_number+ "xxx"+ f200.Flight_number);
		Passenger p1=new Passenger("Manya", "Hosur", "manyareddy", 12345, 9999);
		//Passenger p2=new Passenger("Sanjana", "Hosur", "sanjanareddy", 12345, 9999);
		
        Booking b1=new Booking(123, f1, p1);
        Booking b2=new Booking(124, f1, p1);
        System.out.println(f1.addBooking(b1));
        System.out.println(f1.addBooking(b1));
        //System.out.println(f1.cancelBooking(b1));
        System.out.println(f1.cancelAllBookings());
	}
}
