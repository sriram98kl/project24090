package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class sitecreationAmeswak_pages extends PageFactoryInitYasasiiWeb {

	public sitecreationAmeswak_pages(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement masters;
	
	@FindBy(xpath = "//span[normalize-space()='Site Creation']")
	public WebElement SiteCreation;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement Sitename;
	
	@FindBy(xpath = "//ki-select-control[@formcontrolname='parenthospitalid']//input[@id='undefined']")
	public WebElement Parentsite;
	
	@FindBy(xpath = "//input[@id='displayname']")
	public WebElement DisplayName;
	
	@FindBy(xpath = "//input[@id='mappingcode']")
	public WebElement Mappingcode;
	
	@FindBy(xpath = "//textarea[@id='alternativeaddress']")
	public WebElement Adddress;
	
	@FindBy(xpath = "//input[@id='homeCountry']")
	public WebElement countryname;
	
	
	@FindBy(xpath = "//input[@id='homeState']")
	public WebElement state;
	
	@FindBy(xpath = "//input[@id='homeCity']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='registrationno']")
	public WebElement Registrationnumber;
	
	@FindBy(xpath = "//ki-select-control[@placeholder='Region']//input[@id='undefined']")
	public WebElement region;
	

	@FindBy(xpath = "//input[@id='medicallicense']")
	public WebElement MedicalLicence;
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement Phone;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-hospital-site[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Department;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-hospital-site[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement departmentEnter;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-hospital-site[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/span[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Speciality;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search;
	
	@FindBy(xpath = "//input[@id='site']")
	public WebElement AllowedSite;
	
	@FindBy(xpath = "//input[@id='userprofileid']")
	public WebElement userProfile;
	
	
public void sitecreation(String sitename , String ParentSite ,String mappingCode , String Address , String Country ,String State ,String City,String Region, String RegistrationNumber ,String MedicalLicense,String PhoneNumber,String department ) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(500);
		masters.click();
    	Thread.sleep(500);
		SiteCreation.click();  
		Thread.sleep(500);
		Sitename.clear();
		Thread.sleep(500);
		Sitename.sendKeys(sitename);
		Thread.sleep(500);
		Parentsite.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+ParentSite+"']")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("(//*[contains(text(),'"+ENCdoc+"')])")).click();
		DisplayName.clear();
		Thread.sleep(500);
		DisplayName.sendKeys(sitename);
		Thread.sleep(500);
		Mappingcode.clear();
		Thread.sleep(500);
		Mappingcode.sendKeys(mappingCode);
		Thread.sleep(500);
		Adddress.clear();
		Thread.sleep(500);
		Adddress.sendKeys(Address);
		Thread.sleep(500);
		countryname.clear();
		Thread.sleep(500);
		countryname.sendKeys(Country);
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+Country+"']")).click();
		Thread.sleep(500);
		state.clear();
		Thread.sleep(500);
		state.sendKeys(State);
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+State+"']")).click();
		Thread.sleep(500);
		
		city.clear();
		Thread.sleep(500);
		city.sendKeys(City);
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+City+"']")).click();
		Thread.sleep(500);
		Registrationnumber.clear();
		Thread.sleep(500);
		Registrationnumber.sendKeys(RegistrationNumber);
		Thread.sleep(500);
		region.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+Region+"']")).click();
		Thread.sleep(500);

JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", MedicalLicence);
		MedicalLicence.clear();
		Thread.sleep(500);
		MedicalLicence.sendKeys(MedicalLicense);
		Thread.sleep(500);
		
		Department.click();
		Thread.sleep(500);
		departmentEnter.click();
		Thread.sleep(500);
		departmentEnter.sendKeys(department);
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@title='"+department+"']")).click();
		Thread.sleep(500);
		Speciality.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(500);
		Phone.click();
		Thread.sleep(500);
		Phone.clear();
		Thread.sleep(500);
		Phone.sendKeys(PhoneNumber);
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
	
		
	
		
}
		
		public void restore() throws InterruptedException, AWTException {
			
			Robot t = new Robot();
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyPress(KeyEvent.VK_ESCAPE);
	         t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		Thread.sleep(500);
			
	}
	
	
	public void sitemappingUser(String sitename) throws InterruptedException {
		
		Thread.sleep(1000);
		Search.clear();
		Thread.sleep(500);
		Search.sendKeys("Admin" , Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@title='Mr Administrator']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(500);
		AllowedSite.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+sitename+"']")).click();
		Thread.sleep(500);
		userProfile.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Administrator']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@title='Add to grid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='update']//i[@class='ki ki-upload']")).click();
		Thread.sleep(1000);
		
		}
		
		

		

}
