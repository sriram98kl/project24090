package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRADTYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public EMRADTYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientNme;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement SelectPatientNme;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;

	@FindBy(xpath = "//label[@class='icon adtview']")
	public WebElement ADT;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']")
	public WebElement JustClick;

	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement ER;

	@FindBy(xpath = "//li[normalize-space()='Day Case Admission']")
	public WebElement DayCaseAdmission;

	@FindBy(xpath = "//div[normalize-space()='Recommended Date']")
	public WebElement RecommendedDateClick;

	@FindBy(xpath = "//div[contains(@class,'card-body form-inputs')]//div[contains(@class,'row')]//textarea[@id='remarks']")
	public WebElement EnterRemarks;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement RoomCategory;

	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement RoomCategorySelection;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//li[normalize-space()='Delux(18)']")
	public WebElement SelectRoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement Save;


	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement Provider;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement ThreeDot;


	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement Reason;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement MainCategory;

	@FindBy(xpath = "//label[@class='icon discharesum']")
	public WebElement visitSummary;

	@FindBy(xpath = "//input[@id='undefined']")
	public WebElement Category;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement TreatmentGiven;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/ki-calendar[1]/div[1]/input[1]")
	public WebElement emergencyDate;

	@FindBy(xpath = "//button[normalize-space()='Preview']")
	public WebElement Preview;

	@FindBy(xpath = "//label[contains(@class,'check-container')]//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;

	@FindBy(xpath = "//div[@class='form-group zero-bottom ng-star-inserted']//input[@type='text']")
	public WebElement DOD;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement Today;

	@FindBy(xpath = "//textarea[@id='summary']")
	public WebElement mortalitySummary;

	@FindBy(xpath = "//input[@id='icd']")
	public WebElement ICD;

	@FindBy(xpath = "//input[@id='remarksa']")
	public WebElement A;

	@FindBy(xpath = "//input[@id='remarksb']")
	public WebElement B;

	@FindBy(xpath = "//input[@id='remarksc']")
	public WebElement C;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement mortalityRemarks;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement mortalityAdd;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement ICDcategory;

	@FindBy(xpath = "//button[normalize-space()='Log']")
	public WebElement log;

	@FindBy(xpath = "//button[@class='btn btn-danger sm clear']")
	public WebElement close;

	@FindBy(xpath = "//button[normalize-space()='Print']")
	public WebElement Print;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement medication;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Diet;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Woundcare;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Others;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/ki-calendar[1]/div[1]/input[1]")
	public WebElement DOD1;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement regSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncounterSaveOK;

	@FindBy(xpath = "//span[@class='user-name']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[@class='logout list-item ']")
	public WebElement logout1;


	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;





	public void  ERpatientAdmit(String TITLE ,String NAME , String AGE , String MBLNO) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+TITLE+"']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);


		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}


		else
		{
			System.out.println("sri");
		}


		//List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		//	
		//	System.out.println(dynamicElement.size());
		//	if(dynamicElement.size() !=0)
		//	{
		//		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		//
		//	}
		regSave.click();       


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
		HSSFSheet FOFullRegTest=wb.getSheetAt(15);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(4).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		SaveOK.click();    
	}

	public void  encounter(String ENCdoc,String Site,String Docid , String DOCPassword) throws InterruptedException, AWTException {
		Thread.sleep(3000);
		ENCprvdrName.click();
		Thread.sleep(2000);
		ENCprvdrName.sendKeys(ENCdoc);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ENCdoc+"')])")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		EncounterSaveOK.click();
		
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		


		////////logout

		username.click();
		logout.click();
		Thread.sleep(2000);
		logoutConfirm.click();

		////////login
		Thread.sleep(3000);
		userid.click();
		userid.sendKeys(Docid);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(DOCPassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);



	}

	public void AdtSelectionn(String firstname,String gender,String age,String encounter,String MRNo) throws InterruptedException, AWTException{
		//////////////////Admit the patient		
		Thread.sleep(2000);

		MainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		EnterPatientNme.sendKeys(MRNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='search-icon']//i[@class='ki ki-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		//SelectPatientNme.click();
		Thread.sleep(1000);
		//  UpArrow.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//i[@class='dashboard-lock ki ki-lock-open']")).click();

		ADT.click();
		Thread.sleep(500);
		//JustClick.click();
		Thread.sleep(700);
		ER.click();
		Thread.sleep(1000);

		RoomType.click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Advanced-DLX')])")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(2000);
		//	UpArrow.click();
		Thread.sleep(700);
		ADT.click();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Admission Cancel')]")).click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-adt-cancel[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='adtcancel']")).click();
		Thread.sleep(3000);


		visitSummary.click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency Certificate']")).click();
		Thread.sleep(1000);
		TreatmentGiven.click();
		Thread.sleep(1000);
		TreatmentGiven.sendKeys("Testers can write Test scripts without having in-depth knowledge of programming\r\n"
				+ "Plugins are faster as compared to Selenium\r\n"
				+ "Supports various programming languages\r\n"
				+ "Code can be reused ");
		Thread.sleep(2000);
		emergencyDate.click();
		Thread.sleep(1000);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		Preview.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);

		///////////MortalityReport	
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mortality Report']")).click();
		Thread.sleep(1000);
		DOD.click();
		Thread.sleep(1000);
		Today.click();
		Thread.sleep(1000);
		mortalitySummary.click();
		Thread.sleep(1000);
		mortalitySummary.sendKeys("Testing Needs\r\n"
				+ "Actionable Insights, Tips, & Tutorials delivered in your Inbox");
		Thread.sleep(1000);
		ICD.click();
		Thread.sleep(1000);
		ICD.sendKeys("normal pressure hydrocephalus" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'normal pressure hydrocephalus')]")).click();
		Thread.sleep(1000);
		A.sendKeys("Feature file – Contains code written in Gherkin (plain English text)");
		Thread.sleep(1000);
		B.sendKeys("Step definition file – Contains the actual code written by the developer");
		Thread.sleep(1000);
		C.sendKeys("Cucumber is used to execute automated acceptance tests written in the “Gherkin” language.");
		Thread.sleep(1000);

		mortalityRemarks.click();
		Thread.sleep(1000);
		mortalityRemarks.sendKeys("mortalityAdd");
		Thread.sleep(1000);
		mortalityAdd.click();
		Thread.sleep(1000);
		ICDcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Part 2']")).click();
		Thread.sleep(1000);
		ICD.click();
		Thread.sleep(1000);
		ICD.sendKeys("normal pressure hydrocephalus" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'normal pressure hydrocephalus')]")).click();
		Thread.sleep(1000);
		mortalityRemarks.click();
		Thread.sleep(1000);
		mortalityRemarks.sendKeys("mortalityAdd");
		Thread.sleep(1000);
		mortalityAdd.click();
		Thread.sleep(1000);
		Preview.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		log.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		Print.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);


		//////Discharge Instruction
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Discharge Instruction']")).click();
		Thread.sleep(1000);

		DOD1.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		Thread.sleep(1000);
		medication.click();
		Thread.sleep(1000);
		medication.sendKeys("The Cucumber framework is one of the BDD frameworks in the market. Cucumber is a testing framework that supports Behavior Driven Development (BDD). It is written in plain English text called Gherkin. It is defined as a scenario of inputs, actions and outcomes.13-Nov-2019");
		Thread.sleep(1000);
		Diet.click();
		Thread.sleep(1000);
		Diet.sendKeys("Both Cucumber and Selenium testing are important components of the web application testing process. Selenium is used for automating the testing across various browsers, whereas Cucumber is an automation tool for behavior-driven development.30-Nov-2021\r\n"
				+ "");
		Thread.sleep(1000);
		Woundcare.click();
		Thread.sleep(1000);
		Woundcare.sendKeys("Back in 2015, Gartner claimed that behavior-driven development (BDD) drove “agility” and increased “collaboration.” Fast forward to today, and we’re seeing a surge of frameworks and tools that employ BDD to make development and testing more coherent than ever. The Cucumber testing tool is one such framework whose goal is to help unify the development, testing, and documentation of feature");
		Thread.sleep(1000);
		Others.click();
		Thread.sleep(1000);
		Others.sendKeys("Introduction\r\n"
				+ "\r\n"
				+ "What is Cucumber Framework\r\n"
				+ "\r\n"
				+ "Advantages of Cucumber Framework\r\n"
				+ "\r\n"
				+ "Disadvantages of Cucumber Framework\r\n"
				+ "\r\n"
				+ "Conclusion");
		Thread.sleep(1000);
		Preview.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		log.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		Print.click();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);




















	}

}
