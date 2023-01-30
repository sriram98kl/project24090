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
import pagesOfYasasiiWeb.restore_Empolyee_yasassiweb;
import pagesOfYasasiiWeb.sitecreationAmeswak_pages;

public class sitecreationAmeswak_Testcase  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;
private restore_Empolyee_yasassiweb restore;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "Al-Nahdah");
	Thread.sleep(3000);
	
//	this.restore =new restore_Empolyee_yasassiweb(driver);
//	restore.restre();
//	Thread.sleep(2000);
	
	
	
}

@Test(dataProvider="getData" ,priority=0 )
public void aptreg(String sitename,String ParentSite ,String mappingCode ,String Address ,String Country ,String State,String City,String Region,String RegistrationNumber ,String MedicalLicense,String PhoneNumber,String department ) throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		
		sitecreationAmeswak_pages site =new sitecreationAmeswak_pages(driver);
		
		site.sitecreation(sitename, ParentSite, mappingCode, Address, Country, State, City, Region, RegistrationNumber, MedicalLicense, PhoneNumber, department);
		
		site.restore();
		}

@Test(dataProvider="getData",priority=1 )
public void restore(String sitename,String ParentSite ,String mappingCode ,String Address ,String Country ,String State,String City,String Region,String RegistrationNumber ,String MedicalLicense,String PhoneNumber,String department ) throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		
		sitecreationAmeswak_pages site =new sitecreationAmeswak_pages(driver);
		
	//	site.sitecreation(sitename, ParentSite, mappingCode, Address, Country, State, City, Region, RegistrationNumber, MedicalLicense, PhoneNumber, department);
		
		//site.restore();
		
		//site.sitemappingUser(sitename);
		
		}
@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("site");
	return data;
}




}



