package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
		Customer customer;
		@Test
		public void BasicTests() 
		{
				customer=new Customer();
				Customer customer2=new Customer("haris","1212","Haris","Riaz","6465","03948","haris@gmail.com","islamabad");
				customer.setusername("saadBajwa");
				customer.setpassword("Hello1234");
				customer.setFirstname("Saad");
				customer.setPhonenumber("018348");
				customer.setLastname("Bajwa");
				customer.setCnic("2346");
				customer.setEmail("saad@gmail.com");
				customer.setAddress("Karachi");
		
				assertEquals("saadBajwa",customer.getusername());
				assertEquals("Hello1234",customer.getpassword());
				assertEquals("Saad",customer.getFirstname());
				assertEquals("Bajwa",customer.getLastname());
				assertEquals("2346",customer.getCnic());
				assertEquals("018348",customer.getPhonenumber());
				assertEquals("saad@gmail.com",customer.getEmail());
				assertEquals("Karachi",customer.getAddress());
				assertEquals("haris",customer2.getusername());
				assertEquals("1212",customer2.getpassword());
				assertEquals("Haris",customer2.getFirstname());
				assertEquals("Riaz",customer2.getLastname());
				assertEquals("6465",customer2.getCnic());
				assertEquals("03948",customer2.getPhonenumber());
				assertEquals("haris@gmail.com",customer2.getEmail());
				assertEquals("islamabad",customer2.getAddress());
				
				
	}
	public void RegisterAndVerifyUserTest() 
	{
		customer=new Customer();
		customer.RegisterUser("SaadBajwa", "hello123", "Saad", "Bajwa", "4872", "0394", "saad@gmail.com", "Lahore");
		assertEquals(true,customer.VerifyUser("SaadBajwa", "Hello123"));
	}
	
}
