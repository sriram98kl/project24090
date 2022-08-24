package pagesOfYasasiiWeb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class IVAdditionalTestYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public IVAdditionalTestYasasiiWeb(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	 
	}
	
	@FindBy(xpath="//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement toggle;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement emr;
	@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Menudropdown;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectop;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectPatient;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement patienthomepageicon;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement patienthomepagelock;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement docnote;
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
    public WebElement createnote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEServices;
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement cpoesearch;
//SaveNote
	@FindBy(xpath="//label[@class='icon emrsave']")
	public WebElement savenote;
//login
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement login;
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;
	@FindBy(xpath="//input[@id='loginsite']")
    public WebElement site;	
	@FindBy(xpath="//button[@id='login_spinner']")
	public WebElement login1;
//Investigationmodule-SampleCollection
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menu;
	@FindBy(xpath="//i[@class='ki ki-beaker']")
	public WebElement inves;
	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement exceutionlo;
	@FindBy(xpath="//button[@class='btn btn-dark-green active btn-sm m0']")
	public WebElement okin;
//searchbymrd/name
	@FindBy(xpath="//input[@id='mrno']")
	public WebElement mrno;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement selectpatient;
	@FindBy(xpath="//button[@id='onsaveid']")
	public WebElement Save;	
//SampleCollection-Dispatch
	@FindBy(xpath="//input[@id='status']")
	public WebElement statusdis;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]")
	public WebElement selectpatient1;
	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement disptach;
//SampleProcessing
	@FindBy(xpath="//span[normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;
	@FindBy(xpath="//input[@id='status']")
	public WebElement statusresult;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/label[1]")
	public WebElement selectpatient2;
	@FindBy(xpath="//label[normalize-space()='Select All']//span[@class='checkmark']")
	public WebElement selectservices;
	@FindBy(xpath="//i[@title='Receive']")
	public WebElement receive;
	@FindBy(xpath="//i[@class='ki ki-sample-check']")
	public WebElement accept;
//Result Entry
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement result;
///Additional Test
	@FindBy(xpath="//i[@class='ki ki-file-medical pl-3']")
	public WebElement addicon;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkbox;
	@FindBy(xpath="//button[@class='btn btn-dark-green btn-sm m0 active']")
	public WebElement saveadd;
///Critical result not informed
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[9]/i[1]")
	public WebElement crire;
	@FindBy(xpath="//input[@id='callstatusid']")
	public WebElement statusre;
	@FindBy(xpath="//textarea[@id='feedback']")
	public WebElement feedback;
	@FindBy(xpath="//button[@id='crcall']")
	public WebElement savecri;
	@FindBy(xpath="//button[@id='onSaveid']")
	public WebElement savesample;
	
//Result entry
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement resultadd;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement range;
//Result Authorization
	@FindBy(xpath="//span[normalize-space()='Result Authorization']")
	public WebElement ResultAuthorization;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement authorize;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]")
	public WebElement Saveau;
	@FindBy(xpath="//button[normalize-space()='Preview']")
	public WebElement preview;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[3]/button[3]")
	public WebElement close;
	@FindBy(xpath="//img[@title='Home Page']")
	public WebElement homepage;
	@FindBy(xpath="//button[@class='rounded-1 btn btn-sm btn-red clear']")
	public WebElement backre;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement satpa;
	
	
	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;
	
	@FindBy(xpath = "//input[@id='IdentifyingDocs']")
	public WebElement idDocs;
	
	@FindBy(xpath = "//input[@id='callerid']")
	public WebElement callername;
	
	
public void patientreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Organisation.sendKeys(ORGANISATION);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		idDocs.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Passport']")).click();
		Thread.sleep(1000);
		
		//aadharNo.click();
		aadharNo.sendKeys(AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);
		
		WebElement checkBoxElement = driver.findElement(By.cssSelector("ki-checkbox-control[id='isemergency'] span[class='checkmark']"));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == true) {
			checkBoxElement.click();
		}
		
		//	Insurance.click();
		///Thread.sleep(1000);
		//	Inscorp.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Company[Corp]']")).click();
		//	PlanName.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Scheme']")).click();
		//Thread.sleep(1000);
		//	insAdd.click();
//		Thread.sleep(1000);
//
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
//
//		if(dynamicElement.size() !=0)
//		{
//
//		}
//
//		else
//		{
//			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
//		}
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		
		Thread.sleep(3000);
        String mrno= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
    	System.out.println(mrno);
		
    	String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);
		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(60);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(0).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		SaveSuccess.click();

	}
		
		
		
	
	public void  Additional(String MRNo,String MR,String re,String doc,String readditional,String Site) throws InterruptedException, IOException 
	{
		
		Thread.sleep(1000);
		 EnterPatientName.sendKeys(MRNo);
		 Thread.sleep(800);
		 driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	//	 SelectPatient.click();
		 Thread.sleep(2000);
		// patienthomepageicon.click();
		   Thread.sleep(1000);
		// patienthomepagelock.click();
//////////////DocNote 
		  Thread.sleep(2000);
	      docnote.click();
		  Thread.sleep(3000);
	   //    createnote.click();
		  Thread.sleep(1000);
//////TemplateSelection
	 	   encreate.clear();
	       encreate.click();
		   Thread.sleep(1000);
		    encreate.sendKeys("Fever");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK.click();
			Thread.sleep(1000);
/////CPOEService
			CPOEServices.click();
			Thread.sleep(1000);
			cpoesearch.click();
			Thread.sleep(1000);
			cpoesearch.sendKeys("Potassium");
		    driver.findElement(By.xpath("//div[@id='cpoeservicelist_1']//label[@class='item-name']")).click();
		    Thread.sleep(1000);
////Savenote		
		   savenote.click();	
		   Thread.sleep(3000);
	
////logout
		   driver.findElement(By.xpath("//span[@class='user-name']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		   Thread.sleep(1000);
////login		
		   login.click();
		   Thread.sleep(1000);
		   login.sendKeys("admin");
		   password.click();
		   Thread.sleep(1000);
		   password.sendKeys("kameda321");
		   Thread.sleep(1000);
		   site.click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		   Thread.sleep(1000);
		   login1.click();

////////Investigation module- Sample Collection 
		  menu.click();
		  Thread.sleep(1000);
		  inves.click();
		  Thread.sleep(3000);
		  exceutionlo.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='7th Level Execution Level']")).click();
		  Thread.sleep(1000);
		  callername.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//app-list-item[@id='droplistkey0']//li[contains(text(),'Second Level Sample Collection')]")).click();
		  Thread.sleep(1000);
		  okin.click();
		  Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  selectpatient.click();
		  Thread.sleep(1000);
//////////serum already collected.
		//  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		  Thread.sleep(1000);
		  Save.click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		  Thread.sleep(1000);
///////////Investigation-Dispatch the sample	
		  statusdis.click();
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
	      Thread.sleep(1000);
	   //   driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(1000);
	      mrno.click();
		  Thread.sleep(3000);
		  mrno.clear();
		  Thread.sleep(3000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  selectpatient1.click();
		  Thread.sleep(3000);
		  disptach.click();
		  Thread.sleep(3000);
////////////////SampleProcessing
		  menu.click();
		  Thread.sleep(2000);
		  SampleProcessing.click();
		  Thread.sleep(2000);
		//  driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(2000);
		  mrno.click();
		  Thread.sleep(2000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(2000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  selectpatient2.click();
		  Thread.sleep(2000);
		  selectservices.click();
		  Thread.sleep(2000);
		  receive.click();
		  Thread.sleep(3000);
		  accept.click();
		  Thread.sleep(3000);
		  result.click();
		  Thread.sleep(2000);
		  result.sendKeys(re);
		  result.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  savesample.click();
		  Thread.sleep(3000);
	
//critical result not informed
		  statusdis.click();
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
	      Thread.sleep(1000);
	   //   driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(1000);
	      mrno.click();
		  Thread.sleep(3000);
		  mrno.clear();
		  Thread.sleep(3000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  selectpatient2.click();
		  Thread.sleep(2000);
		  selectservices.click();
		  Thread.sleep(2000);
		  crire.click();
		  Thread.sleep(2000);
		  statusre.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//li[normalize-space()='Got the feed back']")).click();
		  Thread.sleep(2000);
		  feedback.click();
		  Thread.sleep(2000);
		  feedback.sendKeys(doc);
		  Thread.sleep(2000);
		  savecri.click();
		  Thread.sleep(3000);
//Result Entry
		  statusdis.click();
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//li[normalize-space()='Result Entered']")).click();
	      Thread.sleep(1000);
	   //   driver.findElement(By.xpath("//i[@class='ki ki-lock']")).click();
		  Thread.sleep(1000);
	      mrno.click();
		  Thread.sleep(3000);
		  mrno.clear();
		  Thread.sleep(3000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  selectpatient2.click();
		  Thread.sleep(2000);
		  selectservices.click();
		  Thread.sleep(2000);
/////Additional Test Icon
		  addicon.click();
		  Thread.sleep(2000);
		  checkbox.click();
		  Thread.sleep(2000);
		  saveadd.click();
		  Thread.sleep(2000);
		  resultadd.click();
		  Thread.sleep(2000);
		  resultadd.sendKeys(readditional);
		  Thread.sleep(2000);
		  resultadd.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  range.click();
		  Thread.sleep(3000);
		  driver.findElement (By.xpath("//li[normalize-space()='Normal']")).click();
		  Thread.sleep(2000);
		  savesample.click();
		  Thread.sleep(2000);
///Result Authorization
		  menu.click();
		  Thread.sleep(2000);
		  ResultAuthorization.click();
		  Thread.sleep(2000);
		  statusdis.click();
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
	      Thread.sleep(1000);
		  mrno.click();
		  Thread.sleep(3000);
		  mrno.clear();
		  Thread.sleep(3000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(1000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  satpa.click();
		  Thread.sleep(2000);
		  selectservices.click();
		  Thread.sleep(2000);
		  authorize.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		  Thread.sleep(2000);
		  Saveau.click();
		  Thread.sleep(5000);
		  mrno.click();
		  Thread.sleep(1000);
		  mrno.clear();
		  Thread.sleep(1000);
		  mrno.sendKeys(MRNo);
		  Thread.sleep(2000);
		  mrno.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
		  satpa.click();
		  Thread.sleep(2000);
////Preview
		  preview.click();
		  Thread.sleep(2000);
		  close.click();
		  Thread.sleep(2000);
//HomepageView
		  homepage.click();
		  Thread.sleep(3000);
		  backre.click();
		  Thread.sleep(3000);
		  
	
	}
	
	
}