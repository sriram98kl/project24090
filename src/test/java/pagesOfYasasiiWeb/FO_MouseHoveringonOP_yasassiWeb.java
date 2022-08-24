package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_MouseHoveringonOP_yasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public FO_MouseHoveringonOP_yasassiWeb (WebDriver driver) {
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
	
	@FindBy(xpath = "//i[@title='Add']")
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
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement OKhowDidYouKnow;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;
	
	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement ProviderNmae;
	
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	
	@FindBy(xpath = "//label[contains(text(),'Allow Visitor')]")
	public WebElement ElementAllowVisitor;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement RoomCategory;
	
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNumber;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement ADVpayYes;
	
	@FindBy(xpath = "//div[@class='panel-body card-block card-body']")
	public WebElement Category;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement serviceName;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement AddAmount;
	
	@FindBy(xpath = "//label[@class='pay-style']")
	public WebElement ElementTotalAmount;
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement SaveBILLING;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement TransactionOK;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")//input[@id='EncBillingproviders']
	public WebElement encProvider;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;
	
	@FindBy(xpath = "//div[@class='card scroll']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//i[1]")
	public WebElement deleteconfee;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yesDelete;
	
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement saveBill;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement ENCprvdrName;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess1;
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
	
	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
	public WebElement billing;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement NewService;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement serviceName1;
	
	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;
	
	@FindBy(xpath = "//span[@class='pay-style']")
	public WebElement Totalpay;
	
	@FindBy(xpath = "//i[@class='fa fa-chevron-up arrow myicon down']")
	public WebElement Expand;
	
	@FindBy(xpath = "//div[@class='icon-inline']//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement iIcon;
	
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement ServiceBill;
	
	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement billok;
	
	@FindBy(xpath = "//input[@id='IdentifyingDocs']")
	public WebElement idDocs;
	
	public void PatientReg( String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ) throws InterruptedException {
		
		
		
		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'" +TITLE + "')]")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Organisation.sendKeys(ORGANISATION);
		driver.findElement(By.xpath("//li[normalize-space()='"+ORGANISATION+"']")).click();
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
		Thread.sleep(1000);
		aadharNo.sendKeys( AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);
	//	Insurance.click();
		///Thread.sleep(1000);
	//	Inscorp.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Company[Corp]']")).click();
	//	PlanName.click();
		//driver.findElement(By.xpath("//li[normalize-space()='BH Scheme']")).click();
		//Thread.sleep(1000);
	//	insAdd.click();
	Thread.sleep(1000);

	List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
	
	if(dynamicElement.size() !=0)
	{
		
	}
	
	else
	{
		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
	}
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(1000);
		SaveSuccess.click();
		
}
	public void Encounter(String PROVIDER) throws InterruptedException {
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		ENCprvdrName.click();
		ENCprvdrName.sendKeys(PROVIDER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		//deleteconfee.click();
	
		//yesDelete.click();
		Thread.sleep(1000);
		saveBill.click();
		Thread.sleep(1000);
		SaveSuccess1.click();
		
		
	}
	
	
	
	
	public void admit(String PROVIDER , String SERVICE) throws InterruptedException {
		Thread.sleep(2000);
		ADT.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1000);
		ProviderNmae.click();
		Thread.sleep(1000);
		ProviderNmae.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER+ "')]")).click();
		Priority.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ElementAllowVisitor);
		Thread.sleep(2000);
		 RoomCategory.click();
		 Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
	    Thread.sleep(1000);
	    RoomType.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//*[contains(text(),'Super Deluxe')])")).click();
	    Thread.sleep(1000);
	    BedNumber.click();
	    Thread.sleep(1000);

     driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
	    Thread.sleep(1000);
	    ADTSave.click();
	    Thread.sleep(1000);
		ADVpayYes.click();
		Thread.sleep(2000);
		//Category.click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
		///serviceName.click();
		//serviceName.sendKeys("%");
		//Thread.sleep(1000);
		//serviceName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Amount.click();
		Amount.sendKeys("50000");
		Thread.sleep(1000);
		AddAmount.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", ElementTotalAmount);
		Thread.sleep(2000);
		SaveBILLING.click();
		Thread.sleep(5000);
		TransactionOK.click();
		
		Thread.sleep(2000);
		billing.click();
		Thread.sleep(1000);
		Service.click();//span[normalize-space()='Service']
		Thread.sleep(1000);
		NewService.click();
		Thread.sleep(1000);
		serviceName1.click();
		serviceName1.sendKeys(SERVICE);
		driver.findElement(By.xpath("//*[contains(text(),'" +SERVICE+ "')]")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Totalpay);
		Thread.sleep(3000);
		Expand.click();
		Thread.sleep(5000);
	 act.moveToElement(iIcon).build().perform();
	 Thread.sleep(1000);
	 ServiceBill.click();
	 Thread.sleep(2000);
	 billok.click();
	 Thread.sleep(1000);
	 
		
		
		
	}
	
}