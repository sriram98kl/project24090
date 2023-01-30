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
import pagesOfYasasiiWeb.SpeacialityCreation;
import pagesOfYasasiiWeb.dental_yasassiWeb;
import pagesOfYasasiiWeb.restore_Empolyee_yasassiweb;

public class SpecialityCreation_testcase extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	private restore_Empolyee_yasassiweb restore;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("Admin", "KAmeda123$","Naufar Center");
		Thread.sleep(2000);
		
		
		this.restore =new restore_Empolyee_yasassiweb(driver);
		restore.restre();
		Thread.sleep(2000); 
		
		
		
		
		
	}
	
	@Test(dataProvider="getData" ,priority=0)
	public void  master (String Speciality,String DepartmenT,String deptype,String Designation,String SpecialityAlmeswak)throws InterruptedException, IOException, AWTException {
		
		
	
			Thread.sleep(2000);
			
			SpeacialityCreation  token= new SpeacialityCreation(driver);
			
			//  token.master(Speciality, DepartmenT, deptype , SpecialityAlmeswak);
			
			token.designationCreation(Designation);
			
		//	token.restore();
			
			
			
			
	}
	
	@AfterClass
	public void logout() throws Exception
	{  
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("department");
		return data;
		}

 




}
