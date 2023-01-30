package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class dental_yasassiWeb  extends PageFactoryInitYasasiiWeb{
	public dental_yasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	public WebElement  Service;

	@FindBy(xpath="(//span[normalize-space()='Service Master'])[1]")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="//input[@id='name']")
	public WebElement  serviceName;
	
	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Site Mapping']")
	public WebElement SiteMap;

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
	public WebElement Code;
	
	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement AllowedSite;
	
	@FindBy(xpath="//input[@id='mappingsearchkey']")
	public WebElement Basedon;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement SearchType;
	
	@FindBy(xpath="//span[@id='searchservice']//i[@class='ki ki-search']")
	public WebElement Search;
	
	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement doubleright;
	
	@FindBy(xpath="//a[normalize-space()='Map Details']")
	public WebElement mapall;
	
	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement ExecutionCategory;
	
	
	@FindBy(xpath="//span[normalize-space()='Category Master']")
	public WebElement categorymaster;
	@FindBy(xpath="//input[@id='parentinvcategoryid']")
	public WebElement parentcategory;
	@FindBy(xpath="//li[normalize-space()='Procedure']")
	public WebElement selectprocedure;
	@FindBy(xpath="//input[@id='name']")
	public WebElement entername;
	@FindBy(xpath="//button[@id='categorymastersave']")
	public WebElement subcategorysave;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;
	
	
	public void categrymaster(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription) throws InterruptedException, AWTException
	{

		parentcategory.click();
		Thread.sleep(800);
		parentcategory.sendKeys(BaseCategory);
		Thread.sleep(1000);
		selectprocedure.click();
		Thread.sleep(1000);
		entername.sendKeys(SubCategory);
		Thread.sleep(1000);
		subcategorysave.click();
		Thread.sleep(500);
		entername.clear();
		Thread.sleep(500);
	}
	
	
	
	
public void master(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription) throws InterruptedException, AWTException{
		
		
//		Thread.sleep(500);
//		Hamberger.click();
//		Thread.sleep(400);
//		Master.click();
//		Thread.sleep(400);
		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",Service );
//		Thread.sleep(400);
//		Service.click();
//		Thread.sleep(400);
//		ServiceMaster.click();
//		Thread.sleep(400);
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
	

List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));
	
	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
	}

	  else {
		  System.out.println("sri");
		  
	  }
//	  Thread.sleep(800); 
		categoryMaster.clear();
		Thread.sleep(400);
		categoryMaster.click();
		Thread.sleep(400);
		categoryMaster.sendKeys(BaseCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+BaseCategory+"']")).click();
	//	driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		//li[normalize-space()='Laboratory']
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.click();
		Thread.sleep(400);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
		Thread.sleep(400);
		serviceName.clear();
		Thread.sleep(400);
		serviceName.click();
		Thread.sleep(400);
		serviceName.sendKeys(ServiceName);
		Thread.sleep(400);
/*		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+codeType +"']")).click();
		Thread.sleep(400);
		Code.clear();
		Thread.sleep(400);
		Code.sendKeys(code);
		Thread.sleep(400);
		Add.click();  */
		Thread.sleep(400);
		Description.click();
		Thread.sleep(400);
		Description.clear();
		Thread.sleep(400);
		Description.sendKeys(ServiceDescription);
		Thread.sleep(400);
		
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		SiteMap.click();
		Thread.sleep(400);
		ServiceCheck.click();
	    Thread.sleep(400);
		MoveRight.click();
		Thread.sleep(400);
		 Triangle.click();
		Thread.sleep(400);
		//internalLab.click();
		Thread.sleep(400);
		//driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
		Thread.sleep(400);
		Executioncategory.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
		Thread.sleep(400);       
		driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
		Thread.sleep(1000); 
		
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		
//		Thread.sleep(400);
//		Hamberger.click();
//       Thread.sleep(1000);
//    	modules.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		
	}
 
	public void  serviceMapping(String sitename) throws InterruptedException {
		
		
		
		
		Thread.sleep(1000);
		AllowedSite.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+sitename+"']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1500);
		Basedon.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[normalize-space()='Base Category']")).click();
		Thread.sleep(1000);
		SearchType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Procedure']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(2200);
		doubleright.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='btn-sel-unsel ng-star-inserted']")).click();
		Thread.sleep(1000);
		mapall.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		ExecutionCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='sitemappingsave']")).click();
		Thread.sleep(1000);
	//	AllowedSite.click();
		//Thread.sleep(1000);
	//	driver.findElement(By.xpath("//span[@title='"+sitename+"']")).click();
		Thread.sleep(1000);
		
	}
			
	public void edit(String codeType , String code,String ServiceName) throws InterruptedException {
		
		Thread.sleep(400);
		search.clear();
		Thread.sleep(400);
		search.sendKeys(ServiceName , Keys.ENTER);
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[@title='"+ServiceName+"']")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		//driver.findElement(By.xpath("//span[@id='common_edit_icon_2']//i[@class='ki ki-pencil']")).click();
		Thread.sleep(800);
		
		
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//a//i[@class='ki ki-trash']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//a//i[@class='ki ki-trash']")).click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(400);
		}
		
		else
		{
			System.out.println(ServiceName);                        
		}

		Thread.sleep(400);
		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+codeType +"']")).click();
		Thread.sleep(400);
		Code.clear();
		Thread.sleep(400);
		Code.sendKeys(code);
		Thread.sleep(400);
		Add.click();
		Thread.sleep(400);

		driver.findElement(By.xpath("//button[@id='servicemasterupdate']")).click();
		
		Thread.sleep(1200);

		
		
		
	}
	

}
