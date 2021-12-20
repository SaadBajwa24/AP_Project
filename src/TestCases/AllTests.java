package TestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookingTest.class, CustomerTest.class, MovieTest.class, ShowTest.class,
		TheatreTest.class, TestAdmin.class })
public class AllTests {

}
