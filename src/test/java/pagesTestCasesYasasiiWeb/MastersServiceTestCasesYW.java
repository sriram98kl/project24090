package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Master_restore_yasassiweb;
import pagesOfYasasiiWeb.MastersServiceYasasiiWeb;


	public class MastersServiceTestCasesYW extends TestBaseYasasiiWeb{
		public static LoginPageYasasiiWeb login;
		public static HomePageYasasiiWeb hm;
		private Master_restore_yasassiweb master;
		
		
		@BeforeClass
		public void navigateMasterServicePage() throws InterruptedException {
			
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Naufar Center");
		Thread.sleep(3000);
		
		//precondition
		this.master =new Master_restore_yasassiweb(driver);
		master.restore();	
		
		}
		
		
		
		
	//@Test(dataProvider="getData")
		public void addservice(String BaseCategory,String SubCategory,String ServiceName,String Profile ,String POC,String AgeFrom ,String AgeFromUnit,String AgeTo , String AgeToUnit , String DisplayInEmr ,String InternalLab, String ExecutionCategory  ,String ResultType , String ResultUnit , String Specimen ,String Container,String RangeMode1 ,String RangeMode2 , String NormalAgeFrom,String NormalAgeFromUnit,String NormalAgeTo,String NormalAgeToUnit,String Comparision,String CriticalAgeFrom,String CriticalAgeFromUnit,String CriticalAgeTo,String CriticalAgeToUnit,String NormalMin ,String NormalMax, String CriticalMin ,String CiticalMax , String subtest1,String subtest2,String subtest3,String subtest4, String subtest5, String subtest6, String subtest7, String subtest8, String subtest9, String subtest10, String subtest11, String subtest12, String subtest13, String subtest14, String ServiceDescription,String possibleResult,String PossibleResult1,String PossibleResult2, String CodeType , String CodeType1  , String CODE , String CODE1)throws InterruptedException, IOException, AWTException {
			
			MastersServiceYasasiiWeb servicename = new MastersServiceYasasiiWeb(driver) ;
			
			servicename.LaboratoryService(BaseCategory, SubCategory, ServiceName, Profile, POC, AgeFrom, AgeFromUnit, AgeTo, AgeToUnit, DisplayInEmr, InternalLab, ExecutionCategory, ResultType, ResultUnit, Specimen, Container, RangeMode1, RangeMode2, NormalAgeFrom, NormalAgeFromUnit, NormalAgeTo, NormalAgeToUnit, Comparision, CriticalAgeFrom, CriticalAgeFromUnit, CriticalAgeTo, CriticalAgeToUnit, NormalMin, NormalMax, CriticalMin, CiticalMax, subtest1, subtest2, subtest3, subtest4, subtest5, subtest6, subtest7, subtest8, subtest9, subtest10, subtest11, subtest12, subtest13, subtest14, ServiceDescription, possibleResult, PossibleResult1, PossibleResult2, CodeType, CodeType1, CODE, CODE1);
		
			
		//	servicename.codeEdit(ServiceName, CodeType1, CODE1);
		
		}
			
	//	@Test(dataProvider="getData")
		public void labrange(String ServiceName,String RangeMode ,String male ,String female , String others,String AgeFrom ,String FromUnit , String AgeTo ,String AgeToUnit , String Comparision,String Min ,String Max,String panel,String Description)throws InterruptedException, IOException {
			
			MastersServiceYasasiiWeb servicename = new MastersServiceYasasiiWeb(driver) ;
			
			servicename.resultmode(ServiceName, RangeMode, male, female, others, AgeFrom, FromUnit, AgeTo, AgeToUnit, Comparision, Min, Max, panel, Description);
		
		}
		
		
		@Test(dataProvider="getData")
          public void labrange1(String ServiceName,String ServiceDescription)throws InterruptedException, IOException {
			
			MastersServiceYasasiiWeb servicename = new MastersServiceYasasiiWeb(driver) ;
			
			servicename.ServiceEdit(ServiceName, ServiceDescription);
		
		}
		
		
		
		
		
		@AfterClass
		public void logout() throws Exception
		{
			this.hm.clickLogout();
		}


		@DataProvider
		public Object[][] getData() throws Exception{

		
		//Object[][] data =readExcel("laboratoryRangemode");
	      Object[][] data =readExcel("seredit");
			return data;	
		}


}
