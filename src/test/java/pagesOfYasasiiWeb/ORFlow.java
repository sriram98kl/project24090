package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class ORFlow extends PageFactoryInitYasasiiWeb{
	protected static String filepath=System.getProperty("user.dir")+"C:\\Users\\haritha\\Workspace Eclipse\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls";


	public ORFlow(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;


	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[contains(@class,'form-group ng-star-inserted')]//input[@id='mobilephone']")
	public WebElement phoneno;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")
	public WebElement SelectOrganisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement docIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement num;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement docadd;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement howdiduknow;

	@FindBy(xpath = "//label[normalize-space()='Newspaper']")
	public WebElement checknewspaper;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement howdiduknowOk;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement fosave;

	@FindBy(xpath = "/html/body/app-root/ki-dialog/div[2]/div/div/div/div[2]/div[2]/button")
	public WebElement successok;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
	
	
	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement AddReg;
	
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement saVe;
	
	
	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement billsaveok;
	
	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")
	public WebElement collectionChargeNo;
	
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement enterProvider;
	
	
	
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;
	
	
	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement downarrow;
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement logout;	
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yes;
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement enteruserid;	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement enterpassword;
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "//li[normalize-space()=' SOAP ']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk;
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CPOEService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement enternameofProcedure;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEMedicine;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement entermedicine;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral/Handover/Handoff']")
	public WebElement referral;
	
	@FindBy(xpath = "//div[@class='col-md-6 md-height-dropdown-list']//input[@id='rhtonamewithid']")
	public WebElement referralprovider;
	
	@FindBy(xpath = "//div[@class='tab-body']//input[@id='timeframeid']")
	public WebElement timeframe;
	
	@FindBy(xpath = "//li[normalize-space()='Within 1 Day']")
	public WebElement selecttimeframe;
	
	@FindBy(xpath = "//div[@class='row ng-star-inserted']//textarea[@id='reason']")
	public WebElement remarksadd;
	
	@FindBy(xpath = "//div[@class='col-md-12 ta-r rtl-right pr-0']//button[@type='button'][normalize-space()='Add']")
	public WebElement referraladd;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement op;
	
	@FindBy(xpath = "//li[normalize-space()='Pending Orders']")
	public WebElement pendingorder;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-landing[1]/div[2]/app-otview[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")
	public WebElement selectslot;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/label[2]/i[1]")
	public WebElement anestheEdit;
	
	@FindBy(xpath = "//ki-select-control[@formcontrolname='attendeegradeid']//input[@id='undefined']")
	public WebElement grade;
	
	@FindBy(xpath = "//li[normalize-space()='Senior']")
	public WebElement selectgrade;
	
	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement anesthesiaclick;
	
	@FindBy(xpath = "//li[normalize-space()='Block Anesthesia']")
	public WebElement selectanesthesia;
	
	@FindBy(xpath = "//button[@id='subresourceaddid']")
	public WebElement add;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[2]/i[1]")
	public WebElement surgeonedit;
	
	@FindBy(xpath = "//li[normalize-space()='Senior Surgeon']")
	public WebElement selectsugrade;
	
	@FindBy(xpath = "//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement reportingstatus;
	
	@FindBy(xpath = "//li[normalize-space()='Day Case']")
	public WebElement Daycase;
	
	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement saveschedule;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement saveok;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement togglebar;
	
	@FindBy(xpath = "//span[normalize-space()='OR Authorization']")
	public WebElement orAuthorization;
	
	@FindBy(xpath = "//input[@id='searchmrno']")
	public WebElement searckMRNo;
	
	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-pristine ng-valid']//label[@class='check-container min-top']//span[@class='checkmark']")
	public WebElement authorizedcheckbox;
	
	@FindBy(xpath = "//span[normalize-space()='OR Tracking Board']")
	public WebElement ORTrackingboard;
	
	@FindBy(xpath = "//th[normalize-space()='Status']")
	public WebElement status;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement eterMRNo;
	
	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement CPOEAdministration;
	
	@FindBy(xpath = "//label[normalize-space()='Operation Room']")
	public WebElement OperatioRoom;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement checkboxselect;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement VerifiedBy;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement ORSave;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Passwordfield;
	
	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectedQua;
	
	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement Nurseverifiesby;
	
	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifiedPass;
	
	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement today;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement billprint;
	
//	@FindBy(xpath = "")
//	public WebElement pending order;
	
//	@FindBy(xpath = "")
//	public WebElement op;
	
//	@FindBy(xpath = "")
//	public WebElement pending order;
	
//	@FindBy(xpath = "")
//	public WebElement op;
	
//	@FindBy(xpath = "")
//	public WebElement pending order;
	
//	@FindBy(xpath = "")
//	public WebElement op;
	
//	@FindBy(xpath = "")
//	public WebElement pending order;
	
//	@FindBy(xpath = "")
//	public WebElement op;
	
//	@FindBy(xpath = "")
//	public WebElement pending order;
	
//	@FindBy(xpath = "")
//	public WebElement op;
	
//	@FindBy(xpath = "")
//	public WebElement pending order;

	//////////////Register a patient with mandatory field entering


	public void EnterPatientDetails(String Firstname,String Lastname ,String Gender,String Phoneno,String Age,String Documentno,String HAddress,String Organisatn , String Provider) throws InterruptedException, IOException
	{

		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Mr']")).click();
		Thread.sleep(500);
		firstname.sendKeys(Firstname);
		Thread.sleep(500);
		//gender.click();	
		Thread.sleep(500);
		//gender.sendKeys(Gender);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}


		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}

		Thread.sleep(1000);
		organisation.sendKeys(Organisatn);
		Thread.sleep(900);
		SelectOrganisation.click();
		age.sendKeys(Age);
		phoneno.sendKeys(Phoneno);				
		contInformation.click();
		homeadd1.sendKeys(HAddress);
		docIdentification.click();
		Thread.sleep(1500);
		//num.sendKeys(Keys.HOME + "2545214578596584");
		for (int i = 0; i <=16; i++) {

			docnumber.sendKeys(Keys.BACK_SPACE);

		}
		docnumber.sendKeys(Keys.HOME +Documentno);
		Thread.sleep(900);
		docadd.click();
		Thread.sleep(1000);
		howdiduknow.click();
		Thread.sleep(500);
		checknewspaper.click();
		Thread.sleep(700);
		howdiduknowOk.click();
		Thread.sleep(800);
		fosave.click();

//		//////////////Write MRNo to excel sheet
		
		
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\\\Users\\\\sriram\\\\eclipse-workspace\\\\HHCYasasiiWeb24090\\\\src\\\\test\\\\resources\\\\excelYasasiiWeb\\\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(102);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);

//
//		Thread.sleep(3000);
//		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
//		System.out.println(mrno);
//
//		String word[]=mrno.split("[ :] ");
//		System.out.println("number of words: "+word.length);
//		for(int i=0;i<word.length;i++)
//		{
//			System.out.println("word["+i+"]="+word[i]);
//		}
//		System.out.println(word[1]);
//
//		File src=new File("C:\\\\Users\\\\haritha\\\\Workspace Eclipse\\\\HHCYasasiiWeb24090\\\\src\\\\test\\\\resources\\\\excelYasasiiWeb\\\\24090testData.xls");
//		FileInputStream fis=new FileInputStream(src);
//		HSSFWorkbook wb=new HSSFWorkbook(fis);
//		HSSFSheet RegistrationFirstNmae=wb.getSheetAt(81);	
//		int i=RegistrationFirstNmae.getLastRowNum();
//		System.out.println("Number of rows: " + i);		
//		RegistrationFirstNmae.getRow(i).createCell(6).setCellValue(word[1]);	
//		FileOutputStream fout=new FileOutputStream(src);	
//		wb.write(fout);


		Thread.sleep(1000);
		successok.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		billprint.click();
		Thread.sleep(500);
		AddReg.click();
		Thread.sleep(500);
		saVe.click();
		Thread.sleep(600);
		billsaveok.click();
		Thread.sleep(1000);
		
///////////Patient admission in ADT
		Thread.sleep(600);
		ADT.click();
		Thread.sleep(600);	
		collectionChargeNo.click();
		Thread.sleep(600);
		enterProvider.sendKeys(Provider);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Provider+"')])[1]")).click();
		Thread.sleep(600);
		
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Super Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		/*	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//ul[@id='check']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}*/

		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		//SelectBed.click();
		SAve.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();

		
		
	}	
	
	public void logoutin(String doctorid, String Drpassword,String Site) throws InterruptedException
	{
//////////loging out
		Thread.sleep(3000);
		downarrow.click();//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys(doctorid);
		enterpassword.sendKeys(Drpassword);
		Thread.sleep(800);
		
		site.click();
		Thread.sleep(800);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")) );
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")).click();
		
		
		
		
		

		Thread.sleep(1500);
		login.click();
		Thread.sleep(800);
	}
	
//////////Adding Major procedure in doctor note
	
	public void addingmajorprocedure(String MRNo,String majorprocedure,String Medicine,String refProvider ) throws InterruptedException {


		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		//MOdules.click();
		//EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(500);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(1500);
		UpArrow.click();
		Thread.sleep(1000);
		//lock.click();
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(2000);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}

		Thread.sleep(1000);
		EnterChiefComplaint.clear();
		Thread.sleep(1000);
		EnterChiefComplaint.sendKeys("Patient has abdominal pain in left side");
		Thread.sleep(1000);
		EnterTemplate.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//*[contains(text(),' SOAP')])")) );
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),' SOAP ')])")).click();
//		EnterTemplate.sendKeys("SO");
		Thread.sleep(800);
//		SelectTemplate.click();
		ClickOk.click();
		Thread.sleep(500);
		
		diagnosis.click();
	//	driver.findElement(By.xpath("//input[@id='fav']")).sendKeys("Colorado tick fever");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@title='Colorado tick fever']")).click();
        Thread.sleep(500);
		
		
		//////////Adding procedure
		CPOEService.click();
		enternameofProcedure.sendKeys(majorprocedure);
		Thread.sleep(500);
	//	enternameofProcedure.clear();
	//	Thread.sleep(1000);
	//	enternameofProcedure.sendKeys(majorprocedure);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='item-name'][normalize-space()='Pancreaticoduodenectomy (Wipple Procedure)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='woundclassid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Class II']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ki-radio-list[@id='isbloodtrans']//label[@class='radio-container ng-star-inserted'][normalize-space()='No']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ki-radio-list[@id='ispostopicubed']//label[@class='radio-container ng-star-inserted'][normalize-space()='No']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='implantotherdevice']")).sendKeys("No");
		driver.findElement(By.xpath("//ki-radio-list[@id='isinfectiousdesease']//label[@class='radio-container ng-star-inserted'][normalize-space()='No']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='equipinstramentremark']")).sendKeys("Yes");
		driver.findElement(By.xpath("//ki-radio-list[@id='isansethetistinformed']//label[@class='radio-container ng-star-inserted'][normalize-space()='No']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='General']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='clinicalindication']")).sendKeys("Clinical indication added");
		driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();
//////////Adding OR Medicine
		Thread.sleep(500);
		CPOEMedicine.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='No Current Medication']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-admission-reconciliation']")).click();
		Thread.sleep(500);
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-reconciliation']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		entermedicine.click();
		Thread.sleep(500);
		entermedicine.sendKeys(Medicine);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Medicine+"')])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='prescriptiontypeid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='OR Order']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='antibioticorderingreasonid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("Remarks added here");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Therapeutic']")).click();	
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='col-md-11']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='updatePharmacy']//i[@class='ki ki-plus icon-plus']")).click();
		Thread.sleep(500);
///////////Adding Referal
		referral.click();
		Thread.sleep(500);
		referralprovider.sendKeys(refProvider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+refProvider+"')])[1]")).click();
		Thread.sleep(500);
		timeframe.click();
		Thread.sleep(500);
		selecttimeframe.click();
		remarksadd.sendKeys("remarks added");
		Thread.sleep(500);
		referraladd.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='icon emrsave']")).click();
		Thread.sleep(6000);
///////////////Zoom out/Zoom in in document viewer
		driver.findElement(By.xpath("//label[@class='icon cpoedocuments']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Capture']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Take A Snapshot']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-zoom-in']")).click();
		driver.findElement(By.xpath("//i[@class='ki ki-zoom-in']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-zoom-out']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@aria-hidden='true']//i[@class='ki ki-refresh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(4000);
		
}
	public void logoutinasanestheetist(String anesthetistid, String Anesthetistpassword,String Site) throws InterruptedException
	{
//////////loging out
		Thread.sleep(3000);
		downarrow.click();//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys(anesthetistid);
		enterpassword.sendKeys(Anesthetistpassword);
		Thread.sleep(800);
		
		site.click();
		Thread.sleep(800);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")) );
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")).click();
		
		
	
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}	
////////////Give Anesthesia fitness	
	public void anesthesiafitness(String MRNo) throws InterruptedException {
		
		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		//MOdules.click();
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(500);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='All IP']")).click();
		Thread.sleep(500);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(500);
		//UpArrow.click();
		Thread.sleep(500);
		//lock.click();
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}

		Thread.sleep(1000);
		EnterChiefComplaint.clear();
		Thread.sleep(1000);
		EnterChiefComplaint.sendKeys("Patient has abdominal pain in left side");
		Thread.sleep(600);
		EnterTemplate.click();
		EnterTemplate.sendKeys("Pre");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),' Pre Anesthesia ')])")).click();
		ClickOk.click();
		Thread.sleep(500);	
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//ki-checkbox-control[@class='ng-untouched ng-pristine ng-valid']//label[contains(@class,'check-container')][normalize-space()='Fit For Surgery']//span[@class='checkmark']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Anesthesia Plan')]")).click();
		driver.findElement(By.xpath("//div[@id='HTF1668']//label[1]//span[1]")).click();
		driver.findElement(By.xpath("//div[@id='HTF1675']//label[@class='radio-container'][normalize-space()='No']//span[@class='checkmark']")).click();
		driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen/div[@class='page-container h-100']/div[@class='note-layout ng-star-inserted ab-locked layout-1']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_TMH564']/div[@class='row']/div[@class='col-md-12']/div[@class='card dynamic-template-card']/div[@class='card-body']/div[@id='component_TMH564']/app-custum-template/div[@class='loaderparent ng-star-inserted']/form[@id='mainhead_form_3']/div[@class='testtable elementcontainertable templatetable']/div[@class='element-container removespace entered']/label[@class='check-container']/span[1]")).click();
		driver.findElement(By.xpath("//label[@class='icon emrsave']")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("")).click();
		
	}
/////////////Log in as OR Admin
		public void logoutinasoradmin(String oradminid, String oradminpassword,String Site) throws InterruptedException
		{
	//////////loging out
			Thread.sleep(3000);
			downarrow.click();//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']
			Thread.sleep(800);
			logout.click();
			Thread.sleep(800);
			yes.click();
			Thread.sleep(1500);
	///////////login
			enteruserid.sendKeys(oradminid);
			enterpassword.sendKeys(oradminpassword);
			Thread.sleep(800);
			
			site.click();
			Thread.sleep(800);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")) );
			driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")).click();
			
			
		
			Thread.sleep(800);
			login.click();
			Thread.sleep(800);
		}	
		
		public void orschd(String MRNo) throws InterruptedException, AWTException
		{
			Thread.sleep(1000);
       //     driver.navigate().refresh();
            Thread.sleep(1000);
           Robot r= new Robot();
           Thread.sleep(800);
   		r.keyPress(KeyEvent.VK_ENTER);
   		r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
			op.click();
			pendingorder.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
			Thread.sleep(1000);
			selectslot.click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-landing[1]/div[2]/app-otview[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[2]/lib-schedule-view[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/label[1]/i[1]")).click();
			Thread.sleep(800);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[4]/div[1]/div[2]/ki-textarea-control[1]/div[1]/textarea[1]")) );
			Thread.sleep(800);
			anestheEdit.click();
			Thread.sleep(800);
			grade.click();
			Thread.sleep(800);
			selectgrade.click();
			Thread.sleep(800);
			anesthesiaclick.click();
			Thread.sleep(800);
			selectanesthesia.click();
			Thread.sleep(800);
			add.click();
			Thread.sleep(800);
			surgeonedit.click();
			Thread.sleep(800);
			grade.click();
			Thread.sleep(800);
			selectsugrade.click();
			Thread.sleep(800);
			add.click();
			Thread.sleep(800);
			reportingstatus.click();
			Thread.sleep(800);
			Daycase.click();
			Thread.sleep(800);
			saveschedule.click();
			Thread.sleep(1500);
			saveok.click();
			Thread.sleep(800);
			togglebar.click();
			Thread.sleep(800);
			orAuthorization.click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[@title='Search']//i[@class='ki ki-search']")).click();
			Thread.sleep(800);
			searckMRNo.sendKeys(MRNo);
			Thread.sleep(800);
			authorizedcheckbox.click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//span[@title='Preanesthesia Details']//i[@class='ki ki-info-circle-fill']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[@aria-label='Close'][normalize-space()='Close']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[@id='otauthdata']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(5000);
			togglebar.click();
			Thread.sleep(800);
			ORTrackingboard.click();
			Thread.sleep(1000);
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			   jss.executeScript("arguments[0].scrollIntoView();" , status);
				Thread.sleep(4000);
						
}
		
		
		public void operationroom(String MRNo ,String Nuruser ,String Nurpassword,String URL , String Site) throws InterruptedException {

///////////login as nurse
			
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(2000);
			driver.get(URL);
			Thread.sleep(3000);

			userid.click();
			Thread.sleep(800);
			userid.sendKeys(Nuruser);
			Thread.sleep(800);
			password.click();
			Thread.sleep(800);
			password.sendKeys(Nurpassword);
			Thread.sleep(1000);
			site.click();
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")) );
			driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")).click();			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
			Thread.sleep(5000);
////////////////////Process in Operation Room
		
		}		
		
		
		public void operationroomprocess(String MRNo ,String Nuruser ,String Nurpassword) throws InterruptedException, AWTException {
			Thread.sleep(1000);
			eterMRNo.sendKeys(MRNo); 
			Thread.sleep(800);
			driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
			Thread.sleep(1500);
			UpArrow.click();
			Thread.sleep(1000);
			CPOEAdministration.click();
			Thread.sleep(600);
			OperatioRoom.click();
			Thread.sleep(1000);
			checkboxselect.click();
			Thread.sleep(600);
/////////////Checklist ward nurse
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/label[1]")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[2]/div[1]/label[1]")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[2]/div[1]/label[3]")).click();
			Thread.sleep(700);
			VerifiedBy.sendKeys(Nuruser);
			Thread.sleep(600);
			driver.findElement(By.xpath("//strong[normalize-space()='nur001']")).click();		
			Thread.sleep(1200);
			ORSave.click();
			Thread.sleep(600);
			Passwordfield.sendKeys(Nurpassword);
			Thread.sleep(600);
			driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click(); 
			Thread.sleep(5000);
//////////////Checklist Preop nurse			
			driver.findElement(By.xpath("//label[normalize-space()='Checklist Pre-OP Nurse']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[3]/div[1]/label[1]")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/div[3]/div[1]/label[1]")).click();			
			Thread.sleep(1000);
			VerifiedBy.sendKeys(Nuruser);
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tfoot[1]/div[3]/typeahead-container[1]/button[1]/span[1]")).click();		
			Thread.sleep(1000);
			ORSave.click();
			Thread.sleep(1000);
			Passwordfield.sendKeys(Nurpassword);
			Thread.sleep(600);
			driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();
			Thread.sleep(5000);
/////////////////////Transfer Bypass to OR			
			driver.findElement(By.xpath("//label[normalize-space()='Transfer Bypass To OR']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")).click();	
			Thread.sleep(600);
			driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//input[@id='dynamic_selectHTF1744']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//li[normalize-space()='Given']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//input[@id='dynamic_selectHTF1749']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//li[normalize-space()='Given']")).click();
			Thread.sleep(600);
			ORSave.click();
			Thread.sleep(5000);
///////////////Sign In			
			driver.findElement(By.xpath("//label[normalize-space()='Sign In']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='form-group ng-star-inserted']//input[@type='text']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
			Thread.sleep(600);
			ORSave.click();
			Thread.sleep(5000);
//////////////////OR Medicine Admin			
			driver.findElement(By.xpath("//label[normalize-space()='OR Medicine Admin']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='ki-user-drug ki']")).click();
			Thread.sleep(1000);
			rejectedQua.sendKeys("0");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
			Thread.sleep(1000);
			
			
			
			
		
			 List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Ok')][normalize-space()='Yes']"));
				
				if(dynamicElement.size() !=0)
				{
					driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
				}
				  Thread.sleep(800); 

			 
			 Thread.sleep(1000);
			
			
			
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-save']")).click();
			Thread.sleep(1000);
			Nurseverifiesby.sendKeys("Sheethal");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains(text(),' Miss Sheethal(nur01) ')])")).click();
			Thread.sleep(1000);
			verifiedPass.sendKeys("KAmeda123$");
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
			Thread.sleep(5000);
////////////////////Time out			
			driver.findElement(By.xpath("//button[@title='Time Out']//div[@class='btn-name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container h-100']/div[@class='note-layout ng-star-inserted ab-locked layout-1']/div[@class='notelayoutcontainer']/app-cpoe-administration[@class='ng-star-inserted']/div[@class='cpoe-adm-container']/div[@class='cpoe-right-region']/app-or-administration[@class='ng-star-inserted']/div[@class='cpoe-admin-container']/div[@class='or-conatiner']/div[1]")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/label[1]/span[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/label[1]/span[2]")).click();
			Thread.sleep(600);
			Thread.sleep(1000);
			ORSave.click();
			Thread.sleep(3000);
/////////////Intra Operative notes/Vitals
			driver.findElement(By.xpath("//label[normalize-space()='Intra-Operative Notes / Vitals']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@title='Add']")).click();  
			ORSave.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Intra-Operative Procedure']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@title='Add']")).click();
			Thread.sleep(600);
			ORSave.click();
			Thread.sleep(3000);
/////////////After Procedure
			driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("2");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/ki-input-control[1]/div[1]/input[1]")).sendKeys("3");
			Thread.sleep(4000);
			ORSave.click();
			Thread.sleep(5000);
/////////////Coming back to Intra Operative notes/Vitals to enter end date
			//////Adding end date in intra operative procedure
		
			driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();  ///////Just clicking on After Procedure
			Thread.sleep(4000);
			driver.findElement(By.xpath("//label[normalize-space()='Intra-Operative Notes / Vitals']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[normalize-space()='Intra-Operative Procedure']")).click();
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-surgerydetails[1]/form[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[1]/a[1]/i[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//ki-calender-time[@placeholder='End Time']//input[@type='text']")).click();
			Thread.sleep(5000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
	   		r.keyRelease(KeyEvent.VK_ENTER);
	   		
	   		Boolean Enable = driver.findElement(By.xpath("//span[normalize-space()='Today']")).isEnabled();
	   		System.out.println(" today is enabled  :"+Enable);
	   		Thread.sleep(1000);
	   		
	   		
	   		WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Set']")));
	   		
	   		Thread.sleep(1000);
	   		
	   		
	   		
	   		///today
	   		driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[4]")).click();
			//act.moveToElement(today).click().build().perform();
			
	   		
		//	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/div[1]/button[1]/span[1]")).click();  //span[normalize-space()='Today']
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@title='Add']")).click();
			Thread.sleep(1000);
			ORSave.click();
			Thread.sleep(5000);
	        ////////Adding end date in anesthesia notes
			driver.findElement(By.xpath("//span[@class='rep-head-daily']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ki-calender-time[@placeholder='End Time']//input[@type='text']")).click();
//			WebDriverWait wait = new WebDriverWait(driver,30);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Today']")));
//
//			Robot n = new Robot();
//			n.keyPress(KeyEvent.VK_ENTER);
//	   		n.keyRelease(KeyEvent.VK_ENTER);
//	   		Thread.sleep(1000);
//	   		Boolean Enable = driver.findElement(By.xpath("//span[normalize-space()='Today']")).isEnabled();
//	   		System.out.println(" today is enabled  :"+Enable);
//	   		Thread.sleep(1000);
	   		
			driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title='Add']")).click();  
			ORSave.click();
			Thread.sleep(10000);
//////////////Resource Allocation			
			driver.findElement(By.xpath("//label[normalize-space()='Resource Allocation']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='form-group close-active ki-dropdown']//input[@id='typeId']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//li[normalize-space()='Day case']")).click();
			driver.findElement(By.xpath("//div[@class='form-group ki-dropdown']//input[@id='typeId']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//li[normalize-space()='Circulating Nurse']")).click();
			driver.findElement(By.xpath("//input[@id='resourcemasterorid']")).sendKeys("Ancy");
			Thread.sleep(600);
			driver.findElement(By.xpath("//li[normalize-space()='Ancy Joseph(1213)']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@id='ordlsaddid']")).click();
			driver.findElement(By.xpath("//textarea[@id='remarksId']")).sendKeys("Remarks added");
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@id='ormasteraddid']")).click();
			driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
			Thread.sleep(3000);
////////////Sign Out			
			driver.findElement(By.xpath("//label[normalize-space()='Sign Out']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")).click();
			Thread.sleep(600);
		//	driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-star-inserted ng-touched ng-valid']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();		
			Thread.sleep(600);
			driver.findElement(By.xpath("//label[normalize-space()='The name of procedure recorded']//span[@class='checkmark']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[2]")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[2]")).click();
			Thread.sleep(600);
			ORSave.click();
			Thread.sleep(3000);
////////////TimeLine
			driver.findElement(By.xpath("//label[normalize-space()='Time Line']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-timelineview[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")).sendKeys("Remarks added");
			Thread.sleep(600);
			ORSave.click();
			Thread.sleep(1500);
		}
}