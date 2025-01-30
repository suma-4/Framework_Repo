package pack1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = "SmokeTest")
	public void createContact()
	{
		String Browser = System.getProperty("Browser");
		String URL = System.getProperty("URL");
		String Username = System.getProperty("Username");
		String Password = System.getProperty("Password");
		System.out.println(Browser);
		System.out.println(URL);
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@Test(groups = "Regression Test")
	public void modifyContact()
	{
		System.out.println("execute MC");
	}
	
	@Test
	public void deleteContact()
	{
		System.out.println("Just deletet the contact");
	}
}
