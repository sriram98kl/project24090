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
import pagesOfYasasiiWeb.SP5_Inclinic_yasassiWeb;
import pagesOfYasasiiWeb.employeeCreation;
import pagesOfYasasiiWeb.restore_Empolyee_yasassiweb;

public class EmployeeCreationTestcase extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	private restore_Empolyee_yasassiweb restore;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver);
	this.hm = login.enterloginDetails("Admin", "KAmeda123$", "Naufar Center");
	this.restore =new restore_Empolyee_yasassiweb(driver);
	restore.restre();
	Thread.sleep(2000); 
	
	
	}

	

	@Test (dataProvider = "getData", priority=0)
	public void inclinic(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country) throws InterruptedException, IOException, AWTException {
		
		
		employeeCreation  INC =new employeeCreation(driver);
	INC.empcreation(FirstName, MiddleName, LastName, Gender, PhoneNumber, userId, UserType, Department, Designation, allowedSites, Userprofile, Passsword, DOJ, emailid, DOB, encounterCreation, modules1, modules2, modules3, modules4, modules5, modules6, modules7, modules8, deafultmodule, RegistrationNO, Country);
		
	
	//INC.editemployess(FirstName, MiddleName, LastName, Gender, PhoneNumber, userId, UserType, Department, Designation, allowedSites, Userprofile, Passsword, DOJ, emailid, DOB, encounterCreation, modules1, modules2, modules3, modules4, modules5, modules6, modules7, modules8, deafultmodule, RegistrationNO, Country);
	//INC.restore();
	
	
	
		}
	//@Test (dataProvider = "getData" , priority=1)
	public void  restore(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ) throws InterruptedException, IOException, AWTException {
		
		
		employeeCreation  INC =new employeeCreation(driver);
	//INC.empcreation(FirstName, MiddleName, LastName, Gender, PhoneNumber, userId, UserType, Department, Designation, allowedSites, Userprofile, Passsword,DOJ);
		
	  //  INC.restore();
	
	
	
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("employeeCreation");
		return data;
		}
	
	



}
