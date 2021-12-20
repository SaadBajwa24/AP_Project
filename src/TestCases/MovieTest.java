package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	private Movie movieobj;
	
	@Test
	public void getterSetterInitializerTest() {
		movieobj=new Movie();
		movieobj.setmovieid(11);
		movieobj.setMoviename("Marine Ford");
		movieobj.setRating("9.9");
		movieobj.setReleasedate("1-1-2014");
		movieobj.setGenre("action");
		movieobj.setDuration("3hr 22mins");
		
		assertEquals(11,movieobj.getmovieid());
		assertEquals("Marine Ford",movieobj.getMoviename());
		assertEquals("9.9",movieobj.getRating());
		assertEquals("1-1-2014",movieobj.getReleasedate());
		assertEquals("action",movieobj.getGenre());
		assertEquals("3hr 22mins",movieobj.getDuration());
		
	}
	
	@Test
	public void EditAndAddTest() {
		movieobj=new Movie();
		movieobj.AddMovie(19, "spiderman", "7.7", "9-12-2009", "3hr 3mins", "fictiion");
		movieobj.EditMovie("19,spiderman,7.7,9-12-2009,3hr 3mins,fiction","12,WAR,6.8,12-10-2018,3hr 12mins,fiction");
		
	}

}
