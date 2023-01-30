package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRADTTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData" , priority=0)
public void aptreg(String firstname,String gender,String age,String encounter,String MRNo , String docnomb,String TITLE ,String NAME , String AGE , String MBLNO ,String ENCdoc,String Docid , String DOCPassword,String Site) throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		
		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
		Schedule.ERpatientAdmit(TITLE, NAME, AGE, MBLNO);
		Schedule.encounter(ENCdoc, Site, Docid, DOCPassword);
		
		
		
		}



@Test(dataProvider="getData" , priority=1)
public void EMRADT(String firstname,String gender,String age,String encounter,String MRNo , String docnomb,String TITLE ,String NAME , String AGE , String MBLNO,String ENCdoc,String Docid , String DOCPassword,String Site) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		
		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
		Schedule.AdtSelectionn(firstname,gender,age,encounter,MRNo);
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("ERPatientFlow");
	return data;
}




}
