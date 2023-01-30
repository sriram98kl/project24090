package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.ORFlow;

public class ORFlowTestCases extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	ORFlowTestCases.login =new LoginPageYasasiiWeb(driver) ;
	ORFlowTestCases.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(8000);
		
	
	}
	@Test(dataProvider="getData",priority=0)
	public void foReg(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String MRNo,String HAddress,String Organisatn,String Provider,String doctorid, String Drpassword,String Site,String majorprocedure,String Medicine,String refProvider,String anesthetistid, String Anesthetistpassword,String oradminid, String oradminpassword,String Nuruser ,String Nurpassword,String URL) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		ORFlow reb = new ORFlow(driver) ;
		reb.EnterPatientDetails(Firstname, Lastname, Gender, Phoneno, Age, Documentno, HAddress, Organisatn, Provider);
		ORFlow logoutIn=new ORFlow(driver);
		logoutIn.logoutin(doctorid, Drpassword, Site);
	}
		
	@Test(dataProvider="getData",priority=1)
	public void doc(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String MRNo,String HAddress,String Organisatn,String Provider,String doctorid, String Drpassword,String Site,String majorprocedure,String Medicine,String refProvider,String anesthetistid, String Anesthetistpassword,String oradminid, String oradminpassword, String Nuruser, String Nurpassword, String URL) throws InterruptedException, IOException {
		Thread.sleep(5000);
		ORFlow docnote= new ORFlow(driver);
		docnote.addingmajorprocedure( MRNo, majorprocedure, Medicine, refProvider );
		docnote.logoutinasanestheetist( anesthetistid,  Anesthetistpassword, Site);
		ORFlow anes= new ORFlow(driver);
		anes.anesthesiafitness(MRNo);
		ORFlow log1= new ORFlow(driver);
		log1.logoutinasoradmin(oradminid, oradminpassword, Site);
	}
	
	@Test(dataProvider="getData",priority=2)
	public void or(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String MRNo,String HAddress,String Organisatn,String Provider,String doctorid, String Drpassword,String Site,String majorprocedure,String Medicine,String refProvider,String anesthetistid, String Anesthetistpassword,String oradminid, String oradminpassword,String Nuruser ,String Nurpassword,String URL) throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);
		ORFlow orsch= new ORFlow(driver);
		orsch.orschd( MRNo);
		orsch.operationroom( MRNo , Nuruser , Nurpassword, URL ,  Site);
		orsch.operationroomprocess( MRNo , Nuruser , Nurpassword);
	}
	
		
		

	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("OR");
		return data;	
	}	
	
}