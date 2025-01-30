package pack2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test(groups = "SmokeTest")
	public void createOrg()
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
	public void modifyOrg()
	{
		System.out.println("execute mO");
	}
}
