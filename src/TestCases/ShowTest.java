package TestCases;

import static org.junit.Assert.*;
import org.junit.Test;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class ShowTest {

	private Show showobj;
	@Test
	public void ShowTests() throws ClassNotFoundException, SQLException 
	{
		showobj=new Show();
		/*assertEquals(true,showobj.AddShow(34, 2, 19, "4pm-7pm", 800));
		assertEquals(true,showobj.AddShow(2,2,2,"6:30 pm",800));
		assertEquals(true,showobj.UpdateShowTime("07:00 pm",2));
		assertEquals(true,showobj.UpdateShowTheatreid(4,2));
		assertEquals(true,showobj.UpdateShowMovieid(6,19));
		assertEquals(true,showobj.DeleteShow(2));*/
	}

}
