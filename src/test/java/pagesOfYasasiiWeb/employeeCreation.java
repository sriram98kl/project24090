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

public class employeeCreation  extends  PageFactoryInitYasasiiWeb {
	public employeeCreation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-user-privilege-fill']")
	public WebElement Security;
	//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-user-privilege-fill']
	@FindBy(xpath = "//span[normalize-space()='User Creation']")
	public WebElement UserCreation;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='gender']")
	public WebElement gender;
	
	@FindBy(xpath = "//input[@id='phoneno']")
	public WebElement phoneno;
	
	@FindBy(xpath = "//input[@id='empid']")
	public WebElement EmployeeId;
	
	@FindBy(xpath = "//ki-calendar[@id='doj']//input[@type='text']")
	public WebElement Doj;
	
	@FindBy(xpath = "//input[@id='usertypeid']")
	public WebElement usertype;
	
	@FindBy(xpath = "//input[@id='deptname']")
	public WebElement department;
	
	@FindBy(xpath = "//input[@id='designation']")
	public WebElement designation;
	
	@FindBy(xpath = "//input[@id='site']")
	public WebElement Allowedsite;
	
	@FindBy(xpath = "//input[@id='userprofileid']")
	public WebElement UserProfile;
	
	@FindBy(xpath = "//button[@title='Add to grid']//i[@class='ki ki-plus']")
	public WebElement add;
	
	@FindBy(xpath = "//span[normalize-space()='User Credentials']")
	public WebElement Usercredential;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@id='cpassword']")
	public WebElement confirmpassword;
	
	@FindBy(xpath = "//span[normalize-space()='User Information']")
	public WebElement UserInformation;
	
	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement DOb;
	
	
	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement contactInformation;
	
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement Email;
	
	@FindBy(xpath = "//input[@id='phonenocode']")
	public WebElement Phonecode;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[4]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement modules;
	
	@FindBy(xpath = "//input[@id='defaultmodule']")
	public WebElement defaultmodule;
	
	@FindBy(xpath = "//input[@id='regno']")
	public WebElement regnumber;
	
	@FindBy(xpath = "//button[@id='multiselect_user_speciality']")
	public WebElement Speciality;
	
	@FindBy(xpath = "//input[@id='defaultspeciality']")
	public WebElement DefaultSpeacility;
	
	@FindBy(xpath = "//button[normalize-space()='Login Restriction']")
	public WebElement loginrestriction;
	
	@FindBy(xpath = "//a[@role='menuitem']")
	public WebElement Selectall;
	
	
	
	
	
	public void empcreation(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country) throws AWTException, InterruptedException {
			
		
		
		
		Thread.sleep(2000);
//		Hamberger.click();
//		Thread.sleep(500);
//		//driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
//		Thread.sleep(500);
//		Security.click();	
//		Thread.sleep(500);
//		UserCreation.click();
//		Thread.sleep(500);
		
		firstName.clear();
		Thread.sleep(500);
		firstName.sendKeys(FirstName);
		Thread.sleep(500);
		middleName.clear();
	    Thread.sleep(500);
     	middleName.sendKeys(MiddleName);
	    Thread.sleep(500);
		lastname.clear();
		Thread.sleep(500);
		lastname.sendKeys(LastName);
		Thread.sleep(500);
		gender.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Gender+"')])[1]")).click();
		Thread.sleep(500);
		
		Phonecode.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+Country+"']")).click();
		Thread.sleep(500);
		
		
		phoneno.clear();
		Thread.sleep(500);
		phoneno.sendKeys(PhoneNumber);
		Thread.sleep(500);
		EmployeeId.clear();
		Thread.sleep(500);
		EmployeeId.sendKeys(userId);
		Thread.sleep(500);
		
		DOb.clear();
		Thread.sleep(500);
		Robot t=new Robot();
	
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		/*	t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		
		Thread.sleep(500);*/
		DOb.sendKeys(DOB);
		Thread.sleep(1000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		/*		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);  
		Thread.sleep(500);     */
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", contactInformation);
		Thread.sleep(500);
		contactInformation.click();
		Thread.sleep(500);
		Email.clear();
		Thread.sleep(500);
		Email.sendKeys(emailid);
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", Usercredential);
		Thread.sleep(500);
		Usercredential.click();
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", UserInformation);
		Thread.sleep(500);
		UserInformation.click();
		Thread.sleep(500);
		Doj.clear();
		Thread.sleep(500);
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
	
		Thread.sleep(500);
		Doj.sendKeys(DOJ);
		Thread.sleep(1000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		
		usertype.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+UserType+"']")).click();
		Thread.sleep(500);
		department.clear();
		Thread.sleep(500);
		department.sendKeys(Department);
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
		Thread.sleep(500);
		designation.clear();
		Thread.sleep(500);
		designation.sendKeys(Designation);
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Designation+"']")).click();
		Thread.sleep(500);
		Allowedsite.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+allowedSites+"']")).click();
		Thread.sleep(500);
		UserProfile.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Userprofile+"']")).click();
		
		
		////Encounter Creation
		
		if(encounterCreation.equals("1")) {
			Thread.sleep(500);
			driver .findElement(By.xpath("//label[normalize-space()='Encounter Creation Allowed']//span[@class='checkmark']")).click();
			
			
			Thread.sleep(500);
			Speciality.click();
			Thread.sleep(500);
			driver .findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
			Thread.sleep(500);
			DefaultSpeacility.click();
			Thread.sleep(500);
			driver .findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(500);
			
			
			
			
			
				}
		
		else {
			Thread.sleep(500);
			System.out.println("sri");
		}
		
		
		
		Thread.sleep(500);
		add.click();
		Thread.sleep(500);
		
		
		js.executeScript("arguments[0].scrollIntoView();", loginrestriction);
		Thread.sleep(500);
		
		
	/////////modules selection	
		
		
		modules.click();
		Thread.sleep(500);
		Selectall.click();	
		Thread.sleep(500);
		Selectall.click();	
		
		if(modules1.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules1+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules1+"']")).click();
			
		}
		
		if(modules2.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules2+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules2+"']")).click();
			
		}
		
		
		if(modules3.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules3+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules3+"']")).click();
			
		}
		
		if(modules4.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules4+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules4+"']")).click();
			
		}	
		
		if(modules5.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules5+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules5+"']")).click();
			
		}
		
		if(modules6.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules6+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules6+"']")).click();
			
		}
		
		
		if(modules7.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules7+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules7+"']")).click();
			
		}
		
		if(modules8.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}
		
		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules8+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules8+"']")).click();
			
		}
		Thread.sleep(500);
		
		
		defaultmodule.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+deafultmodule+"']")).click();
		Thread.sleep(500);
		regnumber.click();
		Thread.sleep(500);
		regnumber.sendKeys(RegistrationNO);
		Thread.sleep(500);
		
		js.executeScript("arguments[0].scrollIntoView();", Usercredential);
		Usercredential.click();
		Thread.sleep(500);
		Password.clear();
		Thread.sleep(500);
		Password.sendKeys(Passsword);
		Thread.sleep(500);
		confirmpassword.clear();
		Thread.sleep(500);
		confirmpassword.sendKeys(Passsword);
		Thread.sleep(500);
		driver .findElement(By.xpath("//button[@id='save']")).click();
		Thread.sleep(1000);
	//	Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
//		Thread.sleep(500);
//		Hamberger.click();
	//	driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		Thread.sleep(500);
		
		
		
		
	}		
		
		public void restore() throws InterruptedException, AWTException {
				
			Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		Thread.sleep(500);  
		
		
		}	
		
		
		
		
		public void editemployess(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country) throws InterruptedException, AWTException {
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Search...']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Search...']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(userId , Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@title='Edit']//i[@class='ki ki-pencil']")).click();
			Thread.sleep(1000);
			firstName.clear();
			Thread.sleep(500);
			firstName.sendKeys(FirstName);
			Thread.sleep(500);
			middleName.clear();
		    Thread.sleep(500);
	     	middleName.sendKeys(MiddleName);
		    Thread.sleep(500);
			lastname.clear();
			Thread.sleep(500);
			lastname.sendKeys(LastName);
			Thread.sleep(500);
			gender.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//*[contains(text(),'"+Gender+"')])[1]")).click();
			Thread.sleep(500);
			
		
			
			DOb.clear();
			Thread.sleep(500);
			Robot t=new Robot();
		
			t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			/*	t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			
			Thread.sleep(500);*/
			DOb.sendKeys(DOB);
			Thread.sleep(1000);

			t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			/*		t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(500);
			t.keyRelease(KeyEvent.VK_ESCAPE);  
			Thread.sleep(500);     */
			
			
			
			driver.findElement(By.xpath("//button[@id='update']")).click();
			
			Thread.sleep(2000);
			
			
			
			
			
		}

		}

