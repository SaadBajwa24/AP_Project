package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookingTest {

	Booking obj1;
	
	@Test
	public void bookingTest() 
	{
		obj1=new Booking();
		obj1.InitializeMoive(2, 2, 3, 4);
		assertEquals(2,obj1.getBookingid());
		assertEquals(2,obj1.getShowid());
		assertEquals(3,obj1.getCustomerid());
		assertEquals(4,obj1.getSeats());
	}

}
