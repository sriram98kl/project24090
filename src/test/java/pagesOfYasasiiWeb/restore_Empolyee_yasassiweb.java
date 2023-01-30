package pagesOfYasasiiWeb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class restore_Empolyee_yasassiweb  extends  PageFactoryInitYasasiiWeb {
	public restore_Empolyee_yasassiweb(WebDriver driver) {
		super(driver);
	} 
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-user-privilege-fill']")
	public WebElement Security;
	
	@FindBy(xpath = "//span[normalize-space()='User Creation']")
	public WebElement UserCreation;


	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="//a[@title='To create speciality creation']//span[contains(text(),'Speciality Creation')]")
	public WebElement  SpecialityCreation;

	@FindBy(xpath="//input[@id='lookupvaluespeciality']")
	public WebElement  speciality;

	@FindBy(xpath="//span[normalize-space()='Department Creation']")
	public WebElement  DepartmentCreation;

	@FindBy(xpath="//a[@title='To create designation']//span[contains(text(),'Designation Creation')]")
	public WebElement  DesignationCreation;
	

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	public WebElement  Service;

	@FindBy(xpath="(//span[normalize-space()='Service Master'])[1]")
	public WebElement  ServiceMaster;
	

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement masters;
	
	@FindBy(xpath = "//span[normalize-space()='Site Creation']")
	public WebElement SiteCreation;
	
	
	
	public void restre() throws InterruptedException	{
	
		
	///user or employee creation	
		
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);
		Security.click();	
		Thread.sleep(500);
		UserCreation.click();
		Thread.sleep(500); 
		
		
		
	////speciality creation	
		
		/*  	Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",SpecialityCreation );
		Thread.sleep(400);
		SpecialityCreation.click();
		Thread.sleep(400);   */
		
		
	////department creation	
		
		/*     Hamberger.click();
			Thread.sleep(400);
			Master.click();
			Thread.sleep(400);
			DepartmentCreation.click();
			Thread.sleep(400); */
		
	
		///designation creation
			
	/*	     Hamberger.click();
			Thread.sleep(400);
			Master.click();
			Thread.sleep(400);
			DesignationCreation.click();
			Thread.sleep(400);  */
		
		
		
		
		////service master
		
/*		Thread.sleep(1500);
		Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(400);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(400);
		
		
		*/
		
	
	/////site creation	
		
/*		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(500);
		masters.click();
    	Thread.sleep(500);
		SiteCreation.click();
		Thread.sleep(500); */
		
		
				

}
	
}
