package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SpeacialityCreation extends PageFactoryInitYasasiiWeb{
	public SpeacialityCreation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="//a[@title='To create speciality creation']//span[contains(text(),'Speciality Creation')]")
	public WebElement  SpecialityCreation;

	@FindBy(xpath="//input[@id='lookupvaluespeciality']")
	public WebElement  speciality;

	@FindBy(xpath="//span[normalize-space()='Department Creation']")
	public WebElement  DepartmentCreation;

	@FindBy(xpath="//input[@id='lookupvalue']")
	public WebElement  department;

	@FindBy(xpath="//input[@id='field1']")
	public WebElement  DeptmentType;
	
	
	
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-department-master-landing[1]/app-department-master[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement SpecialitySelect;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement MoveRight;

	@FindBy(xpath="//i[@class='fa fa-exclamation-triangle red']")
	public WebElement Triangle;

	@FindBy(xpath="//input[@id='internallabid']")
	public WebElement internalLab;

	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement Executioncategory;
	
	@FindBy(xpath="//label[normalize-space()='Modules']")
	public WebElement modules;
	
	@FindBy(xpath="//input[@id='codetype']")
	public WebElement codetype;
	
	@FindBy(xpath="//input[@id='tempcode']")
	public WebElement code;
	
	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;
	
	@FindBy(xpath = "//input[@id='lookupvalue']")
	public WebElement designation;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	public void master(String Speciality,String DepartmenT,String deptype , String SpecialityAlmeswak) throws InterruptedException, AWTException{
		
		Thread.sleep(1500);
	/*	Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",SpecialityCreation );
		Thread.sleep(400);
		SpecialityCreation.click();
		Thread.sleep(400); */
		
		
		/////speacility creation
		
		/*		speciality.clear();
		Thread.sleep(400);
		speciality.sendKeys(Speciality);
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@id='specsave']")).click();
		Thread.sleep(1000);   
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);   */
		
		///department creation
		
		
	/*    Hamberger.click();
		Thread.sleep(400);
		DepartmentCreation.click();
		Thread.sleep(400); */
		
		Thread.sleep(400);
		department.clear();
		Thread.sleep(400);
		department.click();
		Thread.sleep(400);
		department.sendKeys(DepartmenT);
		Thread.sleep(400);
		DeptmentType.click();
	    Thread.sleep(400);
       	driver.findElement(By.xpath("//li[normalize-space()='"+deptype+"']")).click();
		Thread.sleep(400);
		SpecialitySelect.click();
		Thread.sleep(400);
		
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//span[@title='"+Speciality+"']"));
		
		System.out.println(dynamicElement);
		
		if(dynamicElement.size() !=0)
		{
			Thread.sleep(400);
			driver.findElement(By.xpath("//span[@title='"+Speciality+"']")).click();
		}
		
		else
		{
			System.out.println("Speciality name" + Speciality);
		}

		
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@id='deptsave']")).click();
		Thread.sleep(1000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);


		
	
	}
	
	public void designationCreation(String Designation) throws InterruptedException, AWTException {
		
		Thread.sleep(500);
		designation.clear();
		Thread.sleep(500);
		designation.sendKeys(Designation);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='desigsave']")).click(); 
		Thread.sleep(1000);
		Thread.sleep(1000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		
		
		
	}
		
		
		public void restore() throws InterruptedException {
		
		
		Hamberger.click();
		Thread.sleep(500);
		modules.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click(); 
		Thread.sleep(500);
		
		
	}

}
