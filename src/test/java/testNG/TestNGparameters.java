package testNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameters {
	
	
	@Test (enabled = true)
	@Parameters({"firsName","lastName"})
	public void test(String fname, String lname) {
		
		System.out.println("first name: " +fname);
		System.out.println("last name: " +lname);
	}

}
