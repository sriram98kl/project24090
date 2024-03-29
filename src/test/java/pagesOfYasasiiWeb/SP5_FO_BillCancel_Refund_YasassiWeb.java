package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_FO_BillCancel_Refund_YasassiWeb extends PageFactoryInitYasasiiWeb{
	public SP5_FO_BillCancel_Refund_YasassiWeb(WebDriver driver) {
		super(driver);
	} 

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

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;


	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;
	//button[@id='billingsave']

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;

	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement category;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;//label[@class='icon-btn btn-dark-green inline']

	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOk;


	@FindBy(xpath = "//div[contains(@class,'page-inner-btn-group')]//button[1]")
	public WebElement Save;

	@FindBy(xpath = "//i[@class='ki ki-wallet icon-btn-billing btn-dark-green inline']")
	public WebElement Wallet;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-payment-types[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement AdvCheck;

	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement withdraw;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active'][normalize-space()='OK']")
	public WebElement withdraw0k;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//i[contains(@class,'ki ki-cash-transfer')]")
	public WebElement AvailedService;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox;

	@FindBy(xpath = "//i[@title='Request for Advance Refund']")
	public WebElement request;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement auth;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[3]/span[2]/i[2]")
	public WebElement cancel;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement droplist;

	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement AdvanceView;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[3]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement RCM;

	@FindBy(xpath = "//span[normalize-space()='Approve Request']")
	public WebElement ApproveRequest;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CHECK;

	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement AdvanceApproval;

	@FindBy(xpath = "//div[@class='row advance-approve ng-star-inserted']//th[@class='amount'][normalize-space()='Net Amount']")
	public WebElement Element;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement AmountEdit;

	@FindBy(xpath = "//input[@id='approvalamount0']")
	public WebElement Amount1;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Request Approved']")
	public WebElement reqAPPROVE;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement reqSave;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath="//span[normalize-space()='Cancellation/Refund']")
	public WebElement cancelrefund;

	@FindBy(xpath="//i[@class='ki ki-medical-kit']")
	public WebElement encounter;

	@FindBy(xpath="//ki-select-control[@formcontrolname='serviceid']//input[@id='undefined']")
	public WebElement ServiceNAme;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;



	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement  yes;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon1;


	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon2;

	@FindBy(xpath = "//input[@id='issuedPlace']")
	public WebElement IssuedPlace;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='issuedDate']//input[@type='text']")
	public WebElement IssuedDate;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[1]/button[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
	public WebElement BackArrow;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[3]/td[1]/span[1]")
	public WebElement Date;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validFrom;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[1]/button[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
	public WebElement BackArrow1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[3]/td[2]/span[1]")
	public WebElement Date1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validTo;

	@FindBy(xpath = "//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")
	public WebElement FrontArrow;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[3]/td[7]/span[1]")
	public WebElement Date2;

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill']")
	public WebElement DocInfo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[2]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Category;
	
	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement regAdd;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Servicename;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement printCheck;
	



	public void patReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException, IOException, AWTException {


		Thread.sleep(2000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Normal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='VVIP']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		Thread.sleep(1000);
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		Thread.sleep(1000);
		IssuedPlace.click();
		Thread.sleep(1000);
		IssuedPlace.sendKeys("Coimbatore");
		Thread.sleep(1000);
		IssuedDate.click();
		Thread.sleep(1000);

		for (int i = 0; i <10; i++) {

			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_LEFT);
					
		}
		
		Thread.sleep(1000);
		Date.click();
		validFrom.click();
		for (int i = 0; i <8; i++) 
		{

			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_LEFT);
	    	
					
					
					
					
					
		}

		Date1.click();
		validTo.click();
		for (int i = 0; i <10; i++) {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_LEFT);
					

		}

		Date2.click();
		docAdd.click();
		Thread.sleep(1000);
		act.moveToElement(DocInfo).build().perform();
		Thread.sleep(2500);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(3000);
		SaveSuccess.click();
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);
		
		//		String word[]=mrno.split("[ :] ");
		//		System.out.println("number of words: "+word.length);
		//		for(int i=0;i<word.length;i++)
		//		{
		//			System.out.println("word["+i+"]="+word[i]);
		//		}
		//		System.out.println(word[1]);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(78);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);


	}



	public void BillCancelReq(String MRNO , String PROVIDER ,String SERVICE1, String AMOUNT ,String SERVICE2 ) throws InterruptedException

	{
//		////Encounter
//				Hamberger.click();
//				Thread.sleep(1000);
//		      	EnterMRNo.clear();
//				Thread.sleep(100);
//			//	EnterMRNo.click();
//				Thread.sleep(800); 
//				EnterMRNo.sendKeys(MRNO);
//				Thread.sleep(2000);
//				SearchButton.click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
//				//PatientSelect.click();
//	          	encounter.click();
				
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printCheck.click();
		Thread.sleep(1000);
		regAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(3000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
        Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		printCheck.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		
		
////////followup bill
		
		Servicename.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//li[normalize-space()='Follow-up Consultation']")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		printCheck.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);
		//ServiceAdd
		/*	driver.findElement(By.xpath("//div[contains(text(),'Patient Info')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Billing')]")).click();
		Thread.sleep(1000);
		// js.executeScript("arguments[0].scrollIntoView();",  Service);
		Thread.sleep(2000);
		Service.click();	
		Thread.sleep(1000);
		AddnewService.click();
		Thread.sleep(2000);
		servicename.click();
		Thread.sleep(2000);
		servicename.sendKeys(SERVICE2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE2+"']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);   */


		// WalletPay
		/*	js.executeScript("arguments[0].scrollIntoView();", Wallet );
			Thread.sleep(1000);
			String Amount =  driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
			Thread.sleep(1000);
			Wallet.click();
			Thread.sleep(1000);
			AdvCheck.click();
			Thread.sleep(1000);
			withdraw.click();
			Thread.sleep(1000);
			withdraw.clear();
			Thread.sleep(1000);
			withdraw.sendKeys(Amount);
			Thread.sleep(1000);
			withdraw0k.click();   */


		Thread.sleep(1000);
		AvailedService.click();
		Thread.sleep(1000);
		//AdvanceView.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//label[@title='Request for Cancellation']"));

		int k =	dynamicElement2.size();
		System.out.println("size of k="+k);

		int i = k-1;
		System.out.println(i);
		Thread.sleep(3000);
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/label[2]/i[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
	//	driver.findElement(By.xpath("//tbody/tr["+k+"]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		// Checkbox.click();//tbody/tr[1]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@title='Request for Cancellation'])[1]")).click();
		// request.click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		Thread.sleep(1000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Administrator(admin)']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		droplist.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(2000);

		cancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		//AdvanceView.click();
		Thread.sleep(2000);
		droplist.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Valid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-user-referral']")).click();
		AvailedService.click();
		Thread.sleep(3000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/label[2]/i[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		// Checkbox.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[3]/span[2]/label[1]/span[1]/i[1]")).click();
		// request.click();
		Thread.sleep(2000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Administrator(admin)']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();

	}

	public void AuthorisingRequest(String URL, String User , String Password , String site,String MRNO ) throws InterruptedException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int l =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ l);
		int k=l-1;
		System.out.println("window handles no."+ k);
		driver.switchTo().window(tabs.get(k));
		driver.switchTo().window(tabs.get(k));
		Thread.sleep(3000);
		driver.get(URL);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);



		Hamberger.click();
		Thread.sleep(1000);
		//FO.click();
		Thread.sleep(1000);
		RCM.click();
		Thread.sleep(1000);
		ApproveRequest.click();
		Thread.sleep(1000);
		//	AdvanceApproval.click();
		Thread.sleep(1000); 

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//td[@class='max mr-num']"));

		int z =	dynamicElement.size();
		int a= z/4;

		System.out.println("size="+a);
		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
		//CHECK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")).click();	

		Thread.sleep(1000);
		remark1.click();
		Thread.sleep(1000);
		remark1.sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		APPROVE.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(1000);

		///////Approve Cancel

		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon1.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		RemarksIcon2.click();
		Thread.sleep(800);
		Remarks1.click();
		Thread.sleep(1000);
		Remarks1.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);

		/////////////////////////////

		Hamberger.click();
		Thread.sleep(1000);
		//FO.click();
		Thread.sleep(1000);
		//RCM.click();
		Thread.sleep(1000);
		cancelrefund.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//span[@class='checkmark']"));
		Thread.sleep(1000);
		int y =	dynamicElement1.size();
		System.out.println("Y="+y);
		int b= y/4;
		System.out.println("b="+ b);
		Thread.sleep(1000);



		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		String Returnamount =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/table[1]/tbody[1]/tr[1]/td[9]")).getText();
		Thread.sleep(1000);
		System.out.println("returnAmount"+Returnamount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='wallet']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='wallet']")).sendKeys( Keys.BACK_SPACE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='wallet']")).sendKeys(Returnamount);
		Thread.sleep(3000);
		reqSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);



		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("CURRENT NO.OF WINDOWS"+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(3000);

	}

	public void checkRestored(String PROVIDER) throws InterruptedException {

		
		
		
		driver.findElement(By.xpath("//i[@id='refresh']")).click();
		Thread.sleep(2000);
		encounter.click();
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);



		// WalletPay

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Wallet );
		Thread.sleep(1000);
		String Amount =  driver.findElement(By.xpath("//label[@class='pay-style']")).getText();
		Thread.sleep(1000);
		Wallet.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='dialog-content Error']//button[@type='button'][normalize-space()='OK']")).click();

		Thread.sleep(2000);
		AdvCheck.click();
		Thread.sleep(1000);
		withdraw.click();
		Thread.sleep(1000);
		withdraw.clear();
		Thread.sleep(1000);
		withdraw.sendKeys(Amount);
		Thread.sleep(3000);
		withdraw0k.click();  
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(1000);
		
		
		
		
		

	}







}
