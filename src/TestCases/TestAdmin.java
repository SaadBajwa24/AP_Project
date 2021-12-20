package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdmin {

	private Admin myadmin;
	
	@Test
	public void InitializeTest() {
		myadmin=new Admin();
		myadmin.InitializeAdmin("haris", "IamAdmin123");
		assertEquals("haris",myadmin.getusername());
		assertEquals("IamAdmin123",myadmin.getpassword());
	}
	
	@Test
	public void GettersSettersTest() {
		myadmin=new Admin("omar","merci");
		assertEquals("omar",myadmin.getusername());
		assertEquals("merci",myadmin.getpassword());
		myadmin.setusername("saad");
		myadmin.setpassword("Hello123");
		assertEquals("saad",myadmin.getusername());
		assertEquals("Hello123",myadmin.getpassword());
	}
	
}
