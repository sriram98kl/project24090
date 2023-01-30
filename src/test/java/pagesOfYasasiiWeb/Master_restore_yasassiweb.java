package pagesOfYasasiiWeb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Master_restore_yasassiweb  extends PageFactoryInitYasasiiWeb {

	public Master_restore_yasassiweb(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	public WebElement  Service;
	
	
	@FindBy(xpath = "//span[normalize-space()='Site Mapping']")
	public WebElement SiteMapping;
	
	
	@FindBy(xpath="//span[normalize-space()='Category Master']")
	public WebElement categorymaster;
	
	@FindBy(xpath="(//span[normalize-space()='Service Master'])[1]")
	public WebElement  ServiceMaster;
	
	
	
	
	
	

	
	
	public void restore() throws InterruptedException {
		
	
//		Thread.sleep(1500);
//		Hamberger.click();
//		Thread.sleep(400);
//		Master.click();
//		Thread.sleep(400);
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",Service );
//		Thread.sleep(400);
//		Service.click();
//		Thread.sleep(400);
//		SiteMapping.click();
		

	/////Category master
		
		
	/*	Thread.sleep(500);
		Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		categorymaster.click();
		*/
		
////Service master		
		
		Thread.sleep(1500);
		Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(800);
		Service.click();
		Thread.sleep(800);
		ServiceMaster.click();	 
		Thread.sleep(800);
		
			
}}
