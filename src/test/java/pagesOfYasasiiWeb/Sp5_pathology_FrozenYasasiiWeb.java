package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Sp5_pathology_FrozenYasasiiWeb extends  PageFactoryInitYasasiiWeb {
	public Sp5_pathology_FrozenYasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath="//span[normalize-space()='Normal']")
	public WebElement category;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[2]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[7]/span[1]/span[1]/span[1]/i[1]")
	public WebElement VVIP;		
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

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement Saveservice;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath="//i[@class='ki ki-beaker']")
	public WebElement Investigation;

	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement Executionloc;

	@FindBy(xpath="//button[@class='btn btn-primary active sm m0']")
	public WebElement ExecutionlocOK;

	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmOK;

	@FindBy(xpath="//input[@id='mrno']")
	public WebElement SearchField;

	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/label[2]/span[1]")
	public WebElement caudatecheckbox;

	@FindBy(xpath="//button[@id='onsaveid']")
	public WebElement ivstgnSave;

	@FindBy(xpath="//button[normalize-space()='OK']//i[@class='ki ki-check']")
	public WebElement SaveOK1;

	@FindBy(xpath="//input[@id='status']")
	public WebElement ivstgnStatus;

	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement despatch;

	@FindBy(xpath="//span[normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement orderCheckbox;

	@FindBy(xpath="//i[@title='Receive']")
	public WebElement Recieve;

	@FindBy(xpath="//i[@class='ki ki-sample-check']")
	public WebElement Accept;

	@FindBy(xpath="//i[@class='ki ki-microscope pl-3']")
	public WebElement pathologyProcess;

	@FindBy(xpath="//input[@id='cassettecount']")
	public WebElement cassetteCount;

	@FindBy(xpath="//input[@id='donebydrname']")
	public WebElement Donebydoc;

	@FindBy(xpath="//input[@id='donebyname']")
	public WebElement Donebytech;

	@FindBy(xpath="//label[normalize-space()='Decalcification']//span[@class='checkmark']")
	public WebElement declarification;

	@FindBy(xpath="//label[normalize-space()='STAT']//span[@class='checkmark']")
	public WebElement Stat;

	@FindBy(xpath="//label[normalize-space()='Special']//span[@class='checkmark']")
	public WebElement Special;

	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath="//button[@class='icon-btn btn-dark-green inline']")
	public WebElement pathAdd;

	@FindBy(xpath="//input[@id='cassetremarks0']")
	public WebElement CasssetteRemarks;

	@FindBy(xpath="//button[@id='onsavemain']")
	public WebElement PathSave;

	@FindBy(xpath="//div[@id='id2']")
	public WebElement Processing;

	@FindBy(xpath="//ki-calender-time[@id='enddate']//input[@type='text']")
	public WebElement Enddate;

	@FindBy(xpath="//span[normalize-space()='Today']")
	public WebElement today;

	@FindBy(xpath="//input[@id='cassettecount']")
	public WebElement blockCount;

	@FindBy(xpath="//input[@id='blockremarks0']")
	public WebElement blockRemarks0;

	@FindBy(xpath="//input[@id='blockremarks1']")
	public WebElement blockRemarks1;

	@FindBy(xpath="//input[@id='blockremarks2']")
	public WebElement blockRemarks2;

	@FindBy(xpath="//input[@id='slidecount0']")
	public WebElement slidecount;

	@FindBy(xpath="//input[@id='slideremarks0']")
	public WebElement slideremark0;

	@FindBy(xpath="//input[@id='slideremarks1']")
	public WebElement slideremark1;

	@FindBy(xpath="//input[@id='reversalprocessid']")
	public WebElement reversalprocess;

	@FindBy(xpath="//input[@id='adviceid']")
	public WebElement Advice;

	@FindBy(xpath="//input[@id='specialtestid']")
	public WebElement Specialtest;

	@FindBy(xpath="//ki-checkbox-control[@id='isgeneratefinalreport']//span[@class='checkmark']")
	public WebElement GeneratefinalReport;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement investHAmb;



	@FindBy(xpath="//textarea[@id='clinicaldetails']")
	public WebElement clinicalDetails;

	@FindBy(xpath="//textarea[@id='clinicaldiagnosisrep']")
	public WebElement clinicalDiagnosis;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement macroScopy;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement microscopy;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/ki-editor[1]/div[1]/div[2]/div[1]/p[1]")
	public WebElement opinion;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[2]/ki-editor[1]/div[1]/div[2]/div[1]")
	public WebElement FinalDiagnosis;

	@FindBy(xpath="//textarea[@id='commentsrep']")
	public WebElement comment;

	@FindBy(xpath="//label[@class='check-container list-report']//span[@class='checkmark']")
	public WebElement cancerRegistry;

	@FindBy(xpath="//input[@id='ticdname']")
	public WebElement topograghy;

	@FindBy(xpath="//input[@id='micdname']")
	public WebElement morphology;

	@FindBy(xpath="//input[@id='caicdname']")
	public WebElement ICD;

	@FindBy(xpath="//button[normalize-space()='Preview']")
	public WebElement Preview;

	@FindBy(xpath="//button[normalize-space()='Close']")
	public WebElement close;

	@FindBy(xpath="//button[@id='onsaverepgen']")
	public WebElement ReportSave;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Range;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Resulttatus;

	@FindBy(xpath="//i[@class='ki ki-edit-log']")
	public WebElement Resultlog;

	@FindBy(xpath="//i[@title='Home Page']")
	public WebElement Homeicon;

	@FindBy(xpath="//i[@title='Document View']")
	public WebElement DocumentView;

	@FindBy(xpath="//i[@class='ki ki-template-result']")
	public WebElement ResultEnter;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/label[1]/i[1]")
	public WebElement criticalCall;

	@FindBy(xpath="//input[@id='callstatusid']")
	public WebElement callStatus;
	
	@FindBy(xpath="//textarea[@id='feedback']")
	public WebElement feedback;
	
	@FindBy(xpath="//button[@id='crcall']")
	public WebElement callSave;

	@FindBy(xpath="//i[@title='Critical result informed']")
	public WebElement criticalInformed;

//ReviewRequired
	@FindBy(xpath="//label[normalize-space()='Review Required']//span[@class='checkmark']")
	public WebElement reviewreq;
//
	@FindBy(xpath="//input[@id='status']")
	public WebElement status;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]/ki-editor[1]/div[1]/div[2]/div[1]")
	public WebElement frozenreport;
	
	@FindBy(xpath="//label[normalize-space()='Final Report']//span[@class='checkmark']")
	public WebElement finalreport;

	@FindBy(xpath="//label[normalize-space()='Physically Challenged']//span[@class='checkmark']")
	public WebElement physicallyDisabled;
	
	@FindBy(xpath="//label[normalize-space()='Mentally Challenged']//span[@class='checkmark']")
	public WebElement mentallychallenged;
	
	@FindBy(xpath="//label[normalize-space()='Hearing Impaired']//span[@class='checkmark']")
	public WebElement hearingimpaired;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void patReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE) throws InterruptedException, IOException {


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
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-check-square']")).click();
		Thread.sleep(2000);
		VVIP.click();
		Thread.sleep(2000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		
		physicallyDisabled.click();
		Thread.sleep(400);
		mentallychallenged.click();
		Thread.sleep(400);
		hearingimpaired.click();
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
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

		Thread.sleep(1000);

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
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(98);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);

		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(5000);
		EncounterAdd.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();

		//ServiceAdd
		Thread.sleep(1000);
		// js= (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();",  Service);
		Thread.sleep(2000);
		Service.click();	
		Thread.sleep(1000);
		AddnewService.click();
		Thread.sleep(2000);
		servicename.click();
		Thread.sleep(2000);
		servicename.sendKeys(SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(3000); 
		Saveservice.click();
		Thread.sleep(1000);
		SaveOK.click();


	}

	public void investigtion(String URL, String User , String Password , String site, String MRNO,String User1,String Password1) throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
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
		Investigation.click();
		Thread.sleep(1000);
		Executionloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='6th Level Execution']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(3000);
//SampleProcessing
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(5000);
		caudatecheckbox.click();
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(2000);
		SaveOK1.click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(3000);
		/////despatch Pending 
		Thread.sleep(3000);
		SearchField.clear();
		Thread.sleep(3000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		despatch.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")));
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		Thread.sleep(2000);
		investHAmb.click();
		Thread.sleep(1000);
		SampleProcessing.click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		orderCheckbox.click();
		Thread.sleep(2000);
		Recieve.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-sample-check']")));
		Accept.click();
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-microscope pl-3']")));
		pathologyProcess.click();
		Thread.sleep(1000);

///Cryosectioning.
        Thread.sleep(1000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Lekha Santhosh']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);
		
////////Reporting--Review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		//Enddate.click();
		Thread.sleep(1000);
		//today.click();
		Thread.sleep(1000);	
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		reviewreq.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Louis Xaviour']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		Donebydoc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Midhun Rakhav']")).click();
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);
	
////Login-Louis Xaviour	
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		driver.switchTo().window(tabs1.get(2));
		Thread.sleep(3000);
		driver.get(URL);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User1);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password1);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")));
		Thread.sleep(1000);
//		Hamberger.click();
//		Thread.sleep(1000);
//		Investigation.click();
//		Thread.sleep(1000);
		Executionloc.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='6th Level Execution']")).click();
		Thread.sleep(2000);
		ExecutionlocOK.click();
		Thread.sleep(2000);
		confirmOK.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		investHAmb.click();
		Thread.sleep(2000);
		SampleProcessing.click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Processing']")).click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
	//pathology icon
		driver.findElement(By.xpath("//i[@class='ki ki-microscope pl-3']")).click();
		Thread.sleep(2000);
	

		////////Reporting
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(2000);
		today.click();
		Thread.sleep(1000);	
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		//GeneratefinalReport.click();
	     Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='data-info']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		Thread.sleep(2000);	
		
	
	
	
	
	
	}


	public void resultEnter(String MRNO, String URL , String User , String Password , String site) throws InterruptedException {
		
				
		
		
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		driver.switchTo().window(tabs.get(3));
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
		Investigation.click();
		Thread.sleep(1000);
		Executionloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='6th Level Execution']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		investHAmb.click();
		Thread.sleep(1000);
		SampleProcessing.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Processing']")).click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Thread.sleep(3000);
		pathologyProcess.click();
		Thread.sleep(1000);

		////////Reporting
	//	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(2000);
		today.click();
		Thread.sleep(1000);	
	//	Remarks.click();
		Thread.sleep(1000);
		//Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		Donebydoc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Midhun Rakhav']")).click();
		Thread.sleep(1000);
		GeneratefinalReport.click();
	     Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='data-info']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
		Thread.sleep(2000);	
		Thread.sleep(3000);
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='ki ki-template-result']")).click();
//Reportgeneraion
		
		Thread.sleep(3000);
	//	ResultEnter.click();
		Thread.sleep(1000);
		clinicalDetails.clear();	
		Thread.sleep(1000);
		clinicalDetails.sendKeys("clinical details");
		Thread.sleep(1000);
		clinicalDiagnosis.clear();
		Thread.sleep(1000);
		clinicalDiagnosis.sendKeys("Clinical diagnosis");
		Thread.sleep(1000);
	//	macroScopy.clear();
		Thread.sleep(1000);
		macroScopy.sendKeys("Macroscopy");
		Thread.sleep(1000);
	//	microscopy.clear();
		Thread.sleep(1000);
		microscopy.sendKeys("microscopy");
		Thread.sleep(1000);
	//	Diagnosis.clear();
		Thread.sleep(1000);
		frozenreport.sendKeys("Diagnosis");
		Thread.sleep(1000);
		Thread.sleep(1000);
		comment.clear();
		Thread.sleep(1000);
		comment.sendKeys("comment");
		Thread.sleep(1000);
		finalreport.click();
		Thread.sleep(1000);
		ReportSave.click();
		Thread.sleep(5000);
		Range.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
//		Thread.sleep(1000);
//	//	driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
//		Thread.sleep(3000);
//		ivstgnStatus.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
//		Thread.sleep(1000);
//		SearchField.clear();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		SearchField.sendKeys(MRNO , Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
//		Thread.sleep(2000);
//		
//		
//		criticalCall.click();
//		Thread.sleep(2000);
//		callStatus.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[normalize-space()='Got the feed back']")).click();
//		Thread.sleep(2000);
//		feedback.click();
//		Thread.sleep(2000);
//		feedback.sendKeys("patient should be under observation");
//		Thread.sleep(2000);
//		callSave.click();
//		Thread.sleep(2000);
//		criticalInformed.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='btn btn-link ng-star-inserted']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
//		Thread.sleep(2000);
		
		///firstlevel Authorize
		
		Thread.sleep(1000);
     	Resulttatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		
		//ivstgnSave.click();//button[@id='onSaveid']
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(1000);
		SearchField.clear();
		
		
		///Second level authorization
		
		
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Resulttatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		//ivstgnSave.click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Resultlog.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		Homeicon.click();
		Thread.sleep(3000);
		DocumentView.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='canvasWrapper']//canvas")).click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(5000, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='rounded-1 btn btn-sm btn-red clear']//i[@class='ki ki-clear-back']")).click();
		Thread.sleep(1000);
		



	}

}

