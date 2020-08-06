import java.util.*;

public class Flight {
	public Operation_manager operationManager;
	public ArrayList<Crew> crewList;
	public Airline airline;
	public Airport origin;
	public Airport destination;
	public int Flight_number;
	public int Departure_date;
	public int Arrival_date;
	public int Departure_time;
	public int Arrival_time;
	public int Actual_arrival_time;
	public int Actual_departure_time;
	public HashMap<Integer, Booking> bookings = new HashMap<Integer, Booking>();
	public static ArrayList<Integer> flights = new ArrayList<>();

	public Flight(int flight_number, Airport origin, Airport destination, int departure_date, int arrival_date,
			int departure_time, int arrival_time, int actual_arrival_time, int actual_departure_time,
			Operation_manager operationManager, ArrayList<Crew> crewList, Airline airline) {
		try{
		if(flights.contains(flight_number)) {
			throw new Exception("Flight with this flight number already exists.");
		}
		if(arrival_time-departure_time<=180) {
			if(crewList.size()>3) {
				throw new Exception("Since this is a less than 3 hrs flight you cannot have more than 3 crew members.");
			}
		}
		else {
			if(crewList.size()<4) {
				throw new Exception("Since this is a more than 3 hrs flight you should atleast have 4 crew members.");
			}
			else if(crewList.size()>6) {
				throw new Exception("You cannot have more than 6 crew members for a flight.");
			}
		}
		flights.add(flight_number);
		Flight_number = flight_number;
		this.origin = origin;
		this.destination = destination;
		Departure_date = departure_date;
		Arrival_date = arrival_date;
		Departure_time = departure_time;
		Arrival_time = arrival_time;
		Actual_arrival_time = actual_arrival_time;
		Actual_departure_time = actual_departure_time;
		this.operationManager = operationManager;
		this.crewList = crewList;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int Delay_arrival() {
		return Actual_arrival_time - Arrival_time;

	}

	public int Delay_departure() {
		return Actual_departure_time - Departure_time;

	}

	public String addBooking(Booking b) {
		if (bookings != null) {
			if(bookings.size()>10) {
				return "Flight is fully booked cannot add more.";
			}
			if (bookings.containsKey(b.SeatNumber)) {
				return "Seat already booked";
			} else {
				bookings.put(b.SeatNumber, b);
				return "Seat booked successfully";
			}
		} else {
			bookings = new HashMap<Integer, Booking>();
			bookings.put(b.SeatNumber, b);
			return "Seat booked successfully";
		}
	}

	public String cancelBooking(Booking b) {
		if (bookings != null) {
			if (bookings.containsKey(b.SeatNumber)) {
				bookings.remove(b.SeatNumber);
				return "Booking cancelled";
			} else {
				return "Booking not found";
			}
		} else {
			return "No bookings have been made yet";
		}
	}

	public String cancelAllBookings() {
		if (bookings != null) {
			bookings.clear();
			return "All bookings for this flight have been cancelled";
		} else
			return "No bookings to cancel";
	}
}
