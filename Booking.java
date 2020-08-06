import java.util.*;
public class Booking {
	public int SeatNumber;
	public Flight flight;
	public Passenger passenger;
	public static ArrayList<Integer> passengers = new ArrayList<>();
	public Booking(int seatNumber, Flight flight, Passenger passenger) {
		try {
			if(passengers.contains(passenger.Passport_Number)) {
				throw new Exception("One passenger can only have one booking");
			}
			passengers.add(passenger.Passport_Number);
			SeatNumber = seatNumber;
			this.flight = flight;
			this.passenger=passenger;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
