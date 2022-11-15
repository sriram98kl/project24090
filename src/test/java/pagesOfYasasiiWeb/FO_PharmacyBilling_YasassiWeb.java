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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_PharmacyBilling_YasassiWeb  extends PageFactoryInitYasasiiWeb{
	public FO_PharmacyBilling_YasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;

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

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='ER']")
	public WebElement ER;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement patientSelect1;

	//    /html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    //input[@id='chiefcomplainttext']
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;


	@FindBy(xpath = "//div[@class='btn-pharmacy-search def-search']//i[@class='ki ki-favourite-fill']")
	public WebElement uncheckStar;

	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSelect;

	@FindBy(xpath = "//app-cpoe-pharmacy-prescription//ki-select-control[@id='routeid']//input[1]")
	public WebElement Route;

	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;

	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement DoseLevel;

	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement Doseunit;

	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement reason;


	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement toggle;

	@FindBy(xpath = "//span[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;

	@FindBy(xpath = "//span[normalize-space()='OP Panel']")
	public WebElement opPanel;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharloc;

	@FindBy(xpath = "//input[@id='callerid']")
	public WebElement callerID;

	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
	public WebElement pharlocOK;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;

	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
	public WebElement counterSearchicon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement patientSearch2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicineCheck;

	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement medicineSaveconfirm;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement confirmOK;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement status;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck1;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement holdbillSave;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement BILLsave;

	@FindBy(xpath = "//div[normalize-space()='Dispensing']")
	public WebElement dispensing;


	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement dispensed;

	@FindBy(xpath = "//label[@class='check-container ']//span[@class='checkmark']")
	public WebElement checkMedicine;

	@FindBy(xpath = "//div[@class='pat-name']")
	public WebElement PATientselect;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[2]/div[2]/div[1]/span[1]/i[1]")
	public WebElement counterIcon2;


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

	@FindBy(xpath = "//tr[@class='ng-untouched ng-dirty ng-valid ng-star-inserted']//span[@class='checkmark']")
	public WebElement checkbox;

	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement Amount1;

	@FindBy(xpath = "//i[@class='ki ki-doctor-fill']")
	public WebElement referal;

	@FindBy(xpath = "//ki-select-control[@placeholder='Referral Hospital']//input[@id='undefined']")
	public WebElement hos;

	@FindBy(xpath = "//ki-select-control[@placeholder='Referral Provider']//input[@id='undefined']")
	public WebElement prov;

	@FindBy(xpath = "//input[@id='referralprovider']")
	public WebElement ProviderName;

	@FindBy(xpath = "//input[@id='referralhospital']")
	public WebElement refhos;

	@FindBy(xpath = "//i[contains(@class,'ki ki-doctor-fill')]")
	public WebElement outsiderref;

	@FindBy(xpath = "//input[@id='recommeddose']")
	public WebElement Recomdose;


	@FindBy(xpath = "//i[@title='Substitute Medicine']")
	public WebElement Substitute;

	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement ItemName;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement Duration;

	@FindBy(xpath = "//div[normalize-space()='Remove Substitute Order']")
	public WebElement Removesubs;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement Threeedot;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger1;

	@FindBy(xpath = "//li[3]//a[1]//span[1]")
	public WebElement Pharmacy;

	@FindBy(xpath = "//span[normalize-space()='Recommend Dose(EMR)']")
	public WebElement recommendedDose;

	@FindBy(xpath = "//input[@id='sortby']")
	public WebElement Sortby;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search;

	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement mindose;

	@FindBy(xpath = "//input[@id='routeid']")
	public WebElement Route1;

	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form1;

	@FindBy(xpath = "//input[@id='duration']")
	public WebElement Duration1;

	@FindBy(xpath = "//button[normalize-space()='Brand Priority']")
	public WebElement brandPriority;

	@FindBy(xpath = "//input[@id='brandid']")
	public WebElement Brandname;

	@FindBy(xpath = "//button[@type='button']//i[@class='ki ki-plus']")
	public WebElement BrandAdd;


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

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//label[@title='Add']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;


	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement print;

	@FindBy(xpath = "//i[@title='Cancel Confirm']")
	public WebElement cancelconfirm;

	
    @FindBy(xpath = "//i[@title='Lock/Unlock']")
	public WebElement lock;

    @FindBy(xpath = "//input[@id='qtynew']")
   	public WebElement QTY;
	
	
    @FindBy(xpath = "//div[@class='form-group zero-bottom ki-dropdown']//input[@id='undefined']")
   	public WebElement DispenseStatus;
	
    @FindBy(xpath = "//span[@class='checkmark']")
   	public WebElement Dispensedcheckbox;
  
    @FindBy(xpath = "//button[@id='billholdsave']")
   	public WebElement cancelDispensed;
	
	
	
  
	
	
	
	
	
	


	public void patReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER) throws InterruptedException, IOException {


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
		HSSFSheet FOFullRegTest=wb.getSheetAt(46);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(12).setCellValue(mrno);	
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
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click(); 

		Thread.sleep(1000);
		referal.click();
		Thread.sleep(1000);
		hos.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='outsider hospital']")).click();
		Thread.sleep(1000);
		prov.click();
		Thread.sleep(1000);
		///  outsiderref.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='sreeja']")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(2000);
	}


	public void pharmacybill(String MRNO , String PROVIDER , String CHEIFCOMPLAINT , String MEDICINE,String id, String docpassword , String Site) throws InterruptedException, AWTException {




		Thread.sleep(2000);
		Service.click();	
		Thread.sleep(1000);
		AddnewService.click();
		Thread.sleep(1000);
		category.click();
		driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
		servicename.click();
		Thread.sleep(1000);
		servicename.sendKeys("General Advance");
		driver.findElement(By.xpath("//li[normalize-space()='General Advance']")).click();
		Thread.sleep(1000);
		Amount.clear();
		Thread.sleep(1000);
		Amount.sendKeys("5000");
		Thread.sleep(1000);
		Amount.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		//		////////logout

		username.click();
		Thread.sleep(1000);
		logout.click();
		Thread.sleep(2000);
		logoutConfirm.click();

		////////login
		Thread.sleep(5000);
		userid.click();
		userid.sendKeys(id);    
		Thread.sleep(1000);
		password.click();
		password.sendKeys(docpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);


/*		Hamberger1.click();
		Thread.sleep(1000);
		Pharmacy.click();
		Thread.sleep(1000);
		recommendedDose.click();
		Thread.sleep(1000);
		Sortby.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Generic']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		Search.sendKeys("paracetamol" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='result-name'][normalize-space()='Paracetamol']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='search-results']//div[1]//div[1]//div[1]//div[1]//div[2]//label[1]//i[1]")).click();
		Thread.sleep(1000);

		mindose.sendKeys("650");
		Thread.sleep(1000);
		Doseunit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mg']")).click();
		Thread.sleep(1000);
		Route1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Oral']")).click();
		Thread.sleep(1000);
		Form1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Tablet']")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		Duration1.click();
		Thread.sleep(1000);
		Duration1.sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		brandPriority.click();
		Thread.sleep(1000);
		Brandname.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Calpol 500Mg Tab']")).click();
		Thread.sleep(1000);
		BrandAdd.click();
		Thread.sleep(1000);
		Brandname.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolo 500Mg Tab']")).click();
		Thread.sleep(1000);
		BrandAdd.click();
		Thread.sleep(1000);
		Brandname.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolopar 650 Tab']")).click();
		Thread.sleep(1000);
		BrandAdd.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/label[1]/i[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/label[1]/i[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);

*/


		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']"));

//		System.out.println(dynamicElement.size());
//		if(dynamicElement.size() !=0)
//		{	Thread.sleep(1000);
//			UParrow.click();
//			Thread.sleep(2000);
//			lock.click();
//			Thread.sleep(1000);
//		}
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys(CHEIFCOMPLAINT);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Diagnosis and Plan')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		//				List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']"));
		//				
		//				if(dynamicElement.size() !=0)
		//				{
		//					driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']")).click();
		//				}
		//				else {
		//					System.out.println("sri");
		//				}
		//				  Thread.sleep(800); 

		cpoePharmacy.click();
		Thread.sleep(1000);
		uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys(MEDICINE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Paracetamol']")).click();
		//medicineSelect.click();
		Recomdose.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Paracetamol - 650 Mg')]")).click();
		Thread.sleep(1000);
		/*	Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		Duration.click();
		Thread.sleep(1000);
		Duration.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END); */

		//diagnosis checkbox	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'G91.2')]//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(1000);
		EMRsave.click();

		////////logout
		Thread.sleep(3000);
		username.click();//span[@class='user-name']
		Thread.sleep(1000);
		logout1.click(); 
		Thread.sleep(1000);
		logoutConfirm.click();

		///login
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		Thread.sleep(1000);
		password.click();
		password.sendKeys("kameda321");
		site.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		toggle.click();
		Thread.sleep(1000);
		Pharmacypanel.click();
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(1000);
		pharloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Main Pharmacy']")).click();
		Thread.sleep(1000);
		//	callerID.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='2nd Level Pharmacy-Caller 1']")).click();
		pharlocOK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		counterSearch.click();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);
		Substitute.click();
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolo 650Mg Tab']")).click();
		Thread.sleep(1000);
//		QTY.clear();
//		Thread.sleep(1000);
//		QTY.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

		//medicineCheck.click();	
		Thread.sleep(2000);
		medicineSaveconfirm.click();
		Thread.sleep(2000);
		confirmOK.click(); 
		Thread.sleep(2000);
		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);
		medicineCheck1.click();
		Thread.sleep(1000);
		
		
		
			
		//Substitute.click();
	//	driver.findElement(By.xpath("//label[@id='addNewOrder']//i[@class='ki ki-plus']")).click();
	// stockREservation.click();
		
		
		//////prescriptuion print and cancelconfirm
		
		print.click();
		Thread.sleep(4000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		cancelconfirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Pending']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		
		Thread.sleep(1000);
		Substitute.click();
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolo 650Mg Tab']")).click();
		Thread.sleep(1000);
//		QTY.clear();
//		Thread.sleep(1000);
//		QTY.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

	////subsrtitute cancel
		Threeedot.click();
		Thread.sleep(1000);
		Removesubs.click();
		Thread.sleep(1000);
		Substitute.click();
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolo 650Mg Tab']")).click();
		Thread.sleep(1000);
//		QTY.clear();
//		Thread.sleep(1000);
//		QTY.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		
		
		
		medicineCheck1.click();	
		Thread.sleep(2000);
		medicineSaveconfirm.click();
		Thread.sleep(2000);
		confirmOK.click(); 
		Thread.sleep(2000);
		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		medicineCheck1.click();
		Thread.sleep(1000);
		holdbillSave.click();
		Thread.sleep(2000);
		confirmOK.click();
		Thread.sleep(1000);
		status.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[normalize-space()='Stock Reservation']")).click();
		// driver.findElement(By.xpath("//li[normalize-space()='Bill Hold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Wallet);
		Thread.sleep(1000);
		String amnt =driver.findElement(By.xpath("//label[@class='pay-style']")).getText();
		Thread.sleep(1000);
		System.out.println(amnt);
	
	/*converting decimal string to whole number*/
		
		String[] decimalSplit = amnt.split("\\.");
		System.out.println("Decimal Number: " + amnt);
		System.out.println("Whole Number: " + decimalSplit[0]);
		System.out.println("Decimal Part: " + decimalSplit[1]);
		Thread.sleep(1000);
		
		Wallet.click();
		Thread.sleep(1000);
		checkbox.click();
		Thread.sleep(1000);
		Amount1.click();
		Thread.sleep(1000);
		
		for (int i = 0; i <6; i++) {
			Amount1.sendKeys(Keys.DELETE);
		}
		
		Thread.sleep(1000);
	    Amount1.sendKeys( decimalSplit[0]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);


		BILLsave.click();
		Thread.sleep(2000);
		confirmOK.click();
		Thread.sleep(1000);
		dispensing.click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		counterIcon2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		checkMedicine.click();
		Thread.sleep(1000);
		dispensed.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);
		
		
	////dispense cancel	
		DispenseStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dispensed']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		counterIcon2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Dispensedcheckbox.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa pointer fa-chevron-right ng-star-inserted']")).click();
		Thread.sleep(1000);
		cancelDispensed.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);
		
		
		DispenseStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Reported']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		counterIcon2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-wrapper ng-star-inserted']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		dispensed.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);
		Thread.sleep(1000);


	}








}
