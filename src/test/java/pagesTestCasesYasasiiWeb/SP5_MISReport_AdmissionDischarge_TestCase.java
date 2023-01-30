package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_FO_BillCancel_Refund_YasassiWeb;
import pagesOfYasasiiWeb.SP5_MISReport_AdmissionDischarge_Yasassiweb;

public class SP5_MISReport_AdmissionDischarge_TestCase extends TestBaseYasasiiWeb {
	
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test 
	public void ADTreport() throws InterruptedException, IOException, AWTException {
		
		
		SP5_MISReport_AdmissionDischarge_Yasassiweb bill=new SP5_MISReport_AdmissionDischarge_Yasassiweb(driver);
		
		bill.AdmisssionReport();
		bill.dischargeReport();
		
		
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	

}
