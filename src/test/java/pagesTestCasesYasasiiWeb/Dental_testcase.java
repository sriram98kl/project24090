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
import pagesOfYasasiiWeb.Master_restore_yasassiweb;
import pagesOfYasasiiWeb.dental_yasassiWeb;
import pagesOfYasasiiWeb.restore_Empolyee_yasassiweb;

public class Dental_testcase extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	private Master_restore_yasassiweb master;
	private restore_Empolyee_yasassiweb restore;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$","King Fahad");
		Thread.sleep(2000);
	
		
	//site mapping	
//		this.master =new Master_restore_yasassiweb(driver);
//		master.restore();
		this.master =new Master_restore_yasassiweb(driver);
		master.restore();	
		
	//	this.restore =new restore_Empolyee_yasassiweb(driver);
	//	restore.restre();
	//	Thread.sleep(2000); 
		
		
	}
	


	@Test(dataProvider="getData" ,priority=0)
	public void  master (String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription)throws InterruptedException, IOException, AWTException {
		
		
	
			Thread.sleep(2000);
			
			dental_yasassiWeb  token= new dental_yasassiWeb(driver);
			
			token.master(codeType, code, ServiceName, BaseCategory, SubCategory, ServiceDescription);
			
		//	token.categrymaster(codeType, code, ServiceName, BaseCategory, SubCategory, ServiceDescription);
			
		//	token.edit(codeType, code, ServiceName);
			
			
	}
	
	

	
	
//	
//	@Test(dataProvider="getData" ,priority=1)
//	public void  masterservicemap(String sitename,String ParentSite ,String mappingCode ,String Address ,String Country ,String State,String City,String Region,String RegistrationNumber ,String MedicalLicense,String PhoneNumber,String department )throws InterruptedException, IOException, AWTException {
//		
//			Thread.sleep(2000);
//			
//			dental_yasassiWeb  token= new dental_yasassiWeb(driver);
//			token.serviceMapping(sitename);
//		
//	}
//	
	
@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		//[][] data =readExcel("dental");
		//Object[][] data =readExcel("procedureservice");
		  Object[][] data =readExcel("Almes-Derma");
		return data;
		}

 

}
