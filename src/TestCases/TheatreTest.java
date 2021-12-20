package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;

public class TheatreTest 
{
	private Theatre theatreobj;
	
	@Test
	public void theatreInitializeFunc() 
	{
			theatreobj=new Theatre();
			theatreobj.InitializeTheatre(1, 32);
			assertEquals(1,theatreobj.gettheatreid());
			assertEquals(32,theatreobj.gettheatresize());
		
	}
	
	@Test
	public void gettersAndSettersTest() 
	{
		theatreobj=new Theatre(2,30);
		assertEquals(2,theatreobj.gettheatreid());
		assertEquals(30,theatreobj.gettheatresize());
		theatreobj.settheatreid(4);
		theatreobj.settheatresize(40);
		assertEquals(4,theatreobj.gettheatreid());
		assertEquals(40,theatreobj.gettheatresize());
	}
	
}

