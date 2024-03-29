package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.BlockandFreezeYasasiiWeb;

public class BlockandFreezeTestCasesYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$", "Kameda Medical Center");
	Thread.sleep(1000);
		
	}    
//	
	@Test(dataProvider="getData")
	public void OPEMR(String User , String Password ,String cite , String MRNO, String IP) throws InterruptedException, IOException, AWTException {
		BlockandFreezeYasasiiWeb OP = new BlockandFreezeYasasiiWeb(driver) ;
		OP.BlockandFreeze(User, Password , cite , MRNO);
		OP.freeze(IP);
	}
		
	
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("block");
		return data;
		}
}

