package script;

import org.testng.annotations.Test;

import page.LoginPage;
import generic.BaseTest;

public class ValidLogin extends BaseTest {
	@Test(priority=1,groups={"login","smoke"})
	public void testValidLogin(){
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
	}
}





