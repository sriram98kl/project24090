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



public class MastersServiceYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public MastersServiceYasasiiWeb(WebDriver driver) {
		super(driver);
	}











	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement   hamberger;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement   Master;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	public WebElement   Service;

	@FindBy(xpath="//span[normalize-space()='Service Master']")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="//input[@id='name']")
	public WebElement  serviceName;

	@FindBy(xpath="//label[normalize-space()='Profile/Panel/Package']//span[@class='checkmark']")
	public WebElement  profileCheck;

	@FindBy(xpath="//label[normalize-space()='POC']//span[@class='checkmark']")
	public WebElement  pOC;

	@FindBy(xpath="//input[@id='agefrom']")
	public WebElement  Agefrom;

	@FindBy(xpath="//input[@id='agefromunitid']")
	public WebElement  AgefromUnit;

	@FindBy(xpath="//input[@id='ageto']")
	public WebElement  Ageto;

	@FindBy(xpath="//input[@id='agetounitid']")
	public WebElement  AgetoUnit;

	@FindBy(xpath="//label[contains(text(),'Display in EMR')]")
	public WebElement  DisplayEmr;

	@FindBy(xpath="//input[@id='codetype']")
	public WebElement Codetype;

	@FindBy(xpath="//input[@id='tempcode']")
	public WebElement coDE;

	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement CPTAdd;

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

	@FindBy(xpath="//input[@id='specimenidser']")
	public WebElement specimen;

	@FindBy(xpath="//input[@id='containeridser']")
	public WebElement container;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/app-specimen[1]/div[1]/form[1]/div[4]/div[1]/button[1]/i[1]")
	public WebElement specimenAdd;

	@FindBy(xpath="//input[@id='resulttypeid']")
	public WebElement resultType;

	@FindBy(xpath="//input[@id='unitser']")
	public WebElement resultUnit;


	@FindBy(xpath="//input[@id='rangemode']")
	public WebElement rangemode;

	@FindBy(xpath="//input[@id='agefromrange']")
	public WebElement Agefromrange;

	@FindBy(xpath="//input[@id='agefromunitidrange']")
	public WebElement Agefromrangeunit;

	@FindBy(xpath="//input[@id='agetorange']")
	public WebElement AgetorangeAge;

	@FindBy(xpath="//input[@id='agetounitidrange']")
	public WebElement Agetorangeunit;

	@FindBy(xpath="//input[@id='comparisonoperatorid']")
	public WebElement comparison;

	@FindBy(xpath="//input[@id='value']")
	public WebElement minvalue;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[4]/div[1]/div[2]/div[1]/div[1]/app-normalcritical[1]/div[1]/form[1]/div[4]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement maxvalue;

	@FindBy(xpath="//div[@class='col-md-2 ta-r rtl-right']//i[@class='ki ki-plus']")
	public WebElement resultadd;

	@FindBy(xpath="//button[@id='servicemastersave']")
	public WebElement ServiceMasterSave;

	@FindBy(xpath="//label[normalize-space()='Modules']")
	public WebElement Modules;

	@FindBy(xpath="//span[normalize-space()='Profile']")
	public WebElement profile;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[8]/div[1]/div[2]/div[1]/app-profile[1]/div[1]/form[1]/div[1]/div[1]")
	public WebElement profileBaseCat;

	@FindBy(xpath="//input[@id='invmastsubserviceprof']")
	public WebElement profileServiceName;

	@FindBy(xpath="//div[@class='col-md-1 ta-r rtl-right col-3']//i[@class='ki ki-plus']")
	public WebElement profileAdd;

	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;

	@FindBy(xpath="//label[normalize-space()='String Values']//span[@class='checkmark']")
	public WebElement StringValues;


	@FindBy(xpath="//input[@id='stringvalue']")
	public WebElement possibleString;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;

	@FindBy(xpath="//textarea[@id='descriptionrange']")
	public WebElement discriptionRange;

	@FindBy(xpath="//span[normalize-space()='Result Interpretation']")
	public WebElement ResultInterpretation;

	@FindBy(xpath="//span[normalize-space()='Authorization Rule']")
	public WebElement Authrule;



	//span[normalize-space()='Authorization Rule']






	public void LaboratoryService(String BaseCategory,String SubCategory,String ServiceName,String Profile ,String POC,String AgeFrom ,String AgeFromUnit,String AgeTo , String AgeToUnit , String DisplayInEmr ,String InternalLab, String ExecutionCategory  ,String ResultType , String ResultUnit , String Specimen ,String Container,String RangeMode1 ,String RangeMode2 , String NormalAgeFrom,String NormalAgeFromUnit,String NormalAgeTo,String NormalAgeToUnit,String Comparision,String CriticalAgeFrom,String CriticalAgeFromUnit,String CriticalAgeTo,String CriticalAgeToUnit,String NormalMin ,String NormalMax, String CriticalMin ,String CiticalMax , String subtest1,String subtest2,String subtest3,String subtest4, String subtest5, String subtest6, String subtest7, String subtest8, String subtest9, String subtest10, String subtest11, String subtest12, String subtest13, String subtest14, String ServiceDescription,String possibleResult,String PossibleResult1,String PossibleResult2,  String CodeType , String CodeType1  , String CODE , String CODE1) throws InterruptedException, AWTException{


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}

		else {
			System.out.println("sri");

		}

		if(Profile.equals("Yes")) {
			Thread.sleep(400);






			JavascriptExecutor js= (JavascriptExecutor) driver;
			Thread.sleep(1000);

			/*	hamberger.click();
		    		Thread.sleep(400);
		         	Master.click();
		    		Thread.sleep(400);

		    		//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);

		    		js.executeScript("arguments[0].scrollIntoView();",Service );
		    		Thread.sleep(400);
		    		Service.click();
		    		Thread.sleep(400);
		    		ServiceMaster.click();   */
			Thread.sleep(400);
			categoryMaster.click();
			Thread.sleep(400);
			categoryMaster.sendKeys(BaseCategory);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
			Thread.sleep(400);
			//li[normalize-space()='Laboratory']
			Subcategory.click();
			Thread.sleep(400);
			Subcategory.sendKeys(SubCategory);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
			Thread.sleep(400);
			serviceName.click();
			Thread.sleep(400);
			serviceName.sendKeys(ServiceName);
			Thread.sleep(400);

			if(Profile.equals("Yes")) {
				Thread.sleep(400);
				profileCheck.click();
				Thread.sleep(400);
			}

			else if(Profile.equals("No")) {
				Thread.sleep(400);
				System.out.println("NO profile information");
			}


			if(POC.equals("Yes")) {
				Thread.sleep(400);
				pOC.click();

			}

			else if(POC.equals("No")) {
				Thread.sleep(400);
				System.out.println("NO pOC information");
			}
			Thread.sleep(400);
			Agefrom.clear();
			Thread.sleep(400);
			Agefrom.sendKeys(AgeFrom);
			Thread.sleep(400);

			if(AgeFromUnit.equals("Day(s)")) {
				Thread.sleep(400);
				AgefromUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
				Thread.sleep(400);

			}

			else if(AgeFromUnit.equals("Month(s)")) {

				AgefromUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
			}

			else if(AgeFromUnit.equals("Year(s)")) {
				Thread.sleep(400);
				AgefromUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
			}

			Thread.sleep(400);

			Ageto.clear();
			Thread.sleep(400);
			Ageto.sendKeys(AgeTo);
			Thread.sleep(400);

			if(AgeToUnit.equals("Day(s)")) {

				Thread.sleep(400);
				AgetoUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click();
				Thread.sleep(400);

			}

			else if(AgeToUnit.equals("Month(s)")) {
				Thread.sleep(400);
				AgetoUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click();
				Thread.sleep(400);
			}

			else if(AgeToUnit.equals("Year(s)")) {
				Thread.sleep(400);
				AgetoUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click();
			}


			////////////      

			if(DisplayInEmr.equals("No")) {
				Thread.sleep(400);
				DisplayEmr.click();

			}
			else if(DisplayInEmr.equals("Yes")) {
				Thread.sleep(400);
				act.moveToElement(DisplayEmr).build().perform();

			}

			///code1	
			Thread.sleep(400);
			Codetype.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+CodeType+"')]")).click();
			Thread.sleep(400);
			coDE.clear();
			Thread.sleep(400);
			coDE.sendKeys(CODE);
			Thread.sleep(400);
			CPTAdd.click();
			Thread.sleep(400);

			/////code2

			Thread.sleep(400);
			Codetype.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+CodeType1+"')]")).click();
			Thread.sleep(400);
			coDE.clear();
			Thread.sleep(400);
			coDE.sendKeys(CODE1);
			Thread.sleep(400);
			CPTAdd.click();
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
			internalLab.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
			Thread.sleep(400);
			Executioncategory.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+ExecutionCategory+"')]")).click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
			Thread.sleep(400);




			js.executeScript("arguments[0].scrollIntoView();", profile);
			//profileBaseCat.click();




			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest1);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest1+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest2);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest2+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest3);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest3+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest4);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest4+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest5);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest5+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest6);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest6+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest7);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest7+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest8);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest8+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest9);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest9+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest10);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest10+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest11);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest11+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest12);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest12+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest13);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest13+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			profileServiceName.clear();
			Thread.sleep(400);
			profileServiceName.sendKeys(subtest14);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+subtest14+"']")).click();
			Thread.sleep(400);
			profileAdd.click();
			Thread.sleep(400);
			ServiceMasterSave.click();
			Thread.sleep(2000);



			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);




			//		    			hamberger.click();
			//		    			Thread.sleep(1000);
			//		    			Modules.click();
			//		    			Thread.sleep(1000);
			//		    		
			//		    			driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		}	



		//   public void normalService(String BaseCategory,String SubCategory,String ServiceName,String Profile ,String POC,String AgeFrom ,String AgeFromUnit,String AgeTo , String AgeToUnit , String DisplayInEmr , String CodeType, String CodeType1 , String CODE  ,String CODE1 ,String InternalLab, String ExecutionCategory  ,String ResultType , String ResultUnit , String Specimen ,String Container,String RangeMode1 ,String RangeMode2 , String NormalAgeFrom,String NormalAgeFromUnit,String NormalAgeTo,String NormalAgeToUnit,String Comparision,String NormalMin ,String NormalMax,String CriticalAgeFrom,String CriticalAgeFromUnit,String CriticalAgeTo,String CriticalAgeToUnit, String CriticalMin ,String CiticalMax , String subtest1,String subtest2,String subtest3,String subtest4, String subtest5, String subtest6, String subtest7, String subtest8, String subtest9, String subtest10, String subtest11, String subtest12, String subtest13, String subtest14, String ServiceDescription,String possibleResult,String PossibleResult1,String PossibleResult2) throws InterruptedException {	


		if(Profile.equals("No")) {



			Thread.sleep(1000);
			/*	hamberger.click();
		Thread.sleep(400);
     	Master.click();
		Thread.sleep(400);

		//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(400);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(400);
		categoryMaster.click(); */
			Thread.sleep(400);
			JavascriptExecutor js= (JavascriptExecutor) driver;
			categoryMaster.clear();
			Thread.sleep(400);
			categoryMaster.sendKeys(BaseCategory);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
			Thread.sleep(400);
			//li[normalize-space()='Laboratory']
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
			serviceName.sendKeys(ServiceName);
			Thread.sleep(400);


			if(Profile.equals("Yes")) {
				Thread.sleep(400);
				profileCheck.click();
				Thread.sleep(400);

			}

			else if(Profile.equals("No")) {
				Thread.sleep(400);
				System.out.println("NO profile information");
			}


			if(POC.equals("Yes")) {
				Thread.sleep(400);
				pOC.click();

			}

			else if(POC.equals("No")) {
				Thread.sleep(400);
				System.out.println("NO pOC information");
			}

			Thread.sleep(400);
			Agefrom.clear();
			Thread.sleep(400);
			Agefrom.sendKeys(AgeFrom);
			Thread.sleep(400);

			if(AgeFromUnit.equals("Day(s)")) {
				Thread.sleep(400);
				AgefromUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
				Thread.sleep(400);

			}

			else if(AgeFromUnit.equals("Month(s)")) {

				AgefromUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
			}

			else if(AgeFromUnit.equals("Year(s)")) {
				Thread.sleep(400);
				AgefromUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
			}

			Thread.sleep(400);

			Ageto.clear();
			Thread.sleep(400);
			Ageto.sendKeys(AgeTo);
			Thread.sleep(400);

			if(AgeToUnit.equals("Day(s)")) {

				Thread.sleep(400);
				AgetoUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click();
				Thread.sleep(400);

			}

			else if(AgeToUnit.equals("Month(s)")) {
				Thread.sleep(400);
				AgetoUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click();
				Thread.sleep(400);
			}

			else if(AgeToUnit.equals("Year(s)")) {
				Thread.sleep(400);
				AgetoUnit.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click();
			}


			////////////      

			if(DisplayInEmr.equals("No")) {
				Thread.sleep(400);
				DisplayEmr.click();

			}
			else if(DisplayInEmr.equals("Yes")) {
				Thread.sleep(400);
				act.moveToElement(DisplayEmr).build().perform();

			}

			/////codde1
			Thread.sleep(400);
			Description.clear();
			Thread.sleep(400);
			Description.sendKeys(ServiceDescription);
			Thread.sleep(400);
			Codetype.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+CodeType+"')]")).click();
			Thread.sleep(400);
			coDE.clear();
			Thread.sleep(400);
			coDE.sendKeys(CODE);
			Thread.sleep(400);
			CPTAdd.click();
			Thread.sleep(400);

			/////code2

			Codetype.click();
			Thread.sleep(400);
			System.out.println(CodeType1);
			driver.findElement(By.xpath("//li[contains(text(),'"+CodeType1+"')]")).click();
			Thread.sleep(400);
			coDE.clear();
			Thread.sleep(400);
			coDE.sendKeys(CODE1);
			Thread.sleep(400);
			CPTAdd.click();
			Thread.sleep(400);

			js.executeScript("arguments[0].scrollIntoView();",SiteMap );
			Thread.sleep(400);
			SiteMap.click();
			Thread.sleep(400);
			ServiceCheck.click();
			Thread.sleep(400);
			MoveRight.click();
			Thread.sleep(400);
			Triangle.click();
			Thread.sleep(400);
			internalLab.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
			Thread.sleep(400);
			Executioncategory.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+ExecutionCategory+"')]")).click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
			Thread.sleep(400);



			/////Specimen

			js.executeScript("arguments[0].scrollIntoView();", specimen);



			//if(ServiceName.contains("Bicarbonate (PEPC Method)")) {
			Thread.sleep(400);
			specimen.clear();
			Thread.sleep(400);
			specimen.sendKeys(Specimen);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
			Thread.sleep(400);
			container.click();
			Thread.sleep(400);
			container.sendKeys(Container);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
			Thread.sleep(400);
			specimenAdd.click();
			Thread.sleep(300);






			//	}

			/*		else if(ServiceName.contains("Chloride (ISE Indirect)")) {
			Thread.sleep(400);
			specimen.clear();
			Thread.sleep(400);
			specimen.sendKeys(Specimen);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
			Thread.sleep(400);
			container.click();
			Thread.sleep(400);
			container.sendKeys(Container);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
			Thread.sleep(2000);
			specimenAdd.click();
			Thread.sleep(2000);
		}

		else if(ServiceName.contains("Potassium (ISE Indirect)")) {
			Thread.sleep(400);
			specimen.clear();
			Thread.sleep(400);
			specimen.sendKeys(Specimen);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
			Thread.sleep(400);
			container.click();
			Thread.sleep(400);
			container.sendKeys(Container);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
			Thread.sleep(2000);
			specimenAdd.click();
			Thread.sleep(2000);

		}

		else if(ServiceName.contains("Sodium (ISE Indirect)")) {
			Thread.sleep(400);
			specimen.clear();
			Thread.sleep(400);
			specimen.sendKeys(Specimen);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
			Thread.sleep(400);
			container.click();
			Thread.sleep(400);
			container.sendKeys(Container);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
			Thread.sleep(2000);
			specimenAdd.click();
			Thread.sleep(400);



		} */

			js.executeScript("arguments[0].scrollIntoView();", resultType);
			Thread.sleep(400);
			resultType.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+ResultType+"')]")).click();
			Thread.sleep(400);
			resultUnit.click();
			Thread.sleep(400);
			resultUnit.sendKeys(ResultUnit);
			Thread.sleep(1200);
			driver.findElement(By.xpath("//li[contains(text(),'"+ResultUnit+"')]")).click();
			Thread.sleep(400);


			if(possibleResult.equals("No")) {
				Thread.sleep(400);
				System.out.println("no possible result");
				Thread.sleep(400);
				driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
				Thread.sleep(1000);
			}
			else if(possibleResult.equals("Yes")) {
				Thread.sleep(400);
				StringValues.click();
				Thread.sleep(400);
				possibleString.clear();
				Thread.sleep(400);
				possibleString.sendKeys(PossibleResult1);
				Thread.sleep(400);
				driver.findElement(By.xpath("//div[@class='col-md-2 ta-c']//i[@class='ki ki-plus']")).click();
				Thread.sleep(400);
				possibleString.clear();
				Thread.sleep(400);
				possibleString.sendKeys(PossibleResult2);
				Thread.sleep(400);
				driver.findElement(By.xpath("//div[@class='col-md-2 ta-c']//i[@class='ki ki-plus']")).click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
				Thread.sleep(2000);


				t.keyPress(KeyEvent.VK_ESCAPE);
				Thread.sleep(400);
				t.keyRelease(KeyEvent.VK_ESCAPE);
			}
		}


	}

	public void resultmode(String ServiceName,String RangeMode ,String male ,String female , String others,String AgeFrom ,String FromUnit , String AgeTo ,String AgeToUnit , String Comparision,String Min ,String Max,String panel,String Description) throws InterruptedException {	

		/////////////////resultmode
		//		Thread.sleep(400);
		//		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
		//
		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
		//		Thread.sleep(400);
		//		System.out.println(dynamicElement.size());
		//		if(dynamicElement.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//
		//		}




		hamberger.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		Thread.sleep(1000);

		hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(600);

		//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(400);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(1000);

		if(panel.equals("No")) {

			Thread.sleep(400);
			search.clear();
			Thread.sleep(400);
			search.sendKeys(ServiceName , Keys.ENTER);
			Thread.sleep(400);
			driver.findElement(By.xpath("//div[@title='"+ServiceName+"']")).click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
			//driver.findElement(By.xpath("//span[@id='common_edit_icon_2']//i[@class='ki ki-pencil']")).click();
			//driver.findElement(By.xpath("//span[@id='common_edit_icon_10']//i[@class='ki ki-pencil']")).click();

			Thread.sleep(1000);

			/*		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']"));
			Thread.sleep(400);
			System.out.println(dynamicElement.size());	
			if(dynamicElement.size() !=0)

			{
				driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
				Thread.sleep(400);

			}

			else {


				System.out.println("sri");
			}

			 */
			//	JavascriptExecutor js= (JavascriptExecutor) driver;
			//	js.executeScript("arguments[0].scrollIntoView();", Authrule);
			//	Thread.sleep(500);
			//	Authrule.click();
			//	Thread.sleep(500);

			js.executeScript("arguments[0].scrollIntoView();", ResultInterpretation);
			Thread.sleep(1000);
			ResultInterpretation.click();

			///----normal
			Thread.sleep(400);
			rangemode.click();
			Thread.sleep(400);
			rangemode.sendKeys(RangeMode);
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+RangeMode+"')]")).click();
			Thread.sleep(400);


			if(male.equals("Yes")) {
				Thread.sleep(400);
				System.out.println( ServiceName +" is not for male");
				Thread.sleep(400);

			}

			else if(male.equals("No")) {
				Thread.sleep(400);
				driver.findElement(By.xpath("//ki-checkbox-control[@id='isgendermalerange']//span[@class='checkmark']")).click();
				Thread.sleep(400);

			}

			if(female.equals("Yes")) {
				Thread.sleep(400);
				System.out.println( ServiceName +" is not for female");
				Thread.sleep(400);

			}

			else if(female.equals("No")) {
				Thread.sleep(400);
				driver.findElement(By.xpath("//ki-checkbox-control[@id='isgenderfemalerange']//span[@class='checkmark']")).click();
				Thread.sleep(400);

			}


			if(others.equals("Yes")) {
				Thread.sleep(400);
				System.out.println( ServiceName +" is not for others");
				Thread.sleep(400);

			}

			else if(others.equals("No")) {
				Thread.sleep(400);
				driver.findElement(By.xpath("//ki-checkbox-control[@id='isgenderothersrange']//span[@class='checkmark']")).click();
				Thread.sleep(400);

			}

			Agefromrange.clear();
			Thread.sleep(400);
			Agefromrange.sendKeys(AgeFrom);
			Thread.sleep(400);
			Agefromrangeunit.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+FromUnit+"')]")).click();
			Thread.sleep(400);
			AgetorangeAge.clear();
			Thread.sleep(400);
			AgetorangeAge.sendKeys(AgeTo);
			Thread.sleep(400);
			Agetorangeunit.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//li[contains(text(),'"+AgeToUnit+"')]")).click(); 
			Thread.sleep(400);
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(400);

			if(Comparision.equals("No")) {	

				System.out.println("string type");

			}


			else {


				comparison.click();
				Thread.sleep(400);
				driver.findElement(By.xpath("//li[contains(text(),'"+Comparision+"')]")).click(); 
				Thread.sleep(400);
				minvalue.clear();
				Thread.sleep(400);
				minvalue.sendKeys(Min);
				Thread.sleep(400);

				if(Comparision.equals("Range")) {

					Thread.sleep(1000);
					maxvalue.clear();
					Thread.sleep(400);
					maxvalue.sendKeys(Max);
					Thread.sleep(400);
				}

				else{
					Thread.sleep(400);
					System.out.println("not in range");
					Thread.sleep(400);

				}


			}

			js.executeScript("arguments[0].scrollIntoView();", discriptionRange);
			Thread.sleep(800);
			discriptionRange.click();
			Thread.sleep(400);
			discriptionRange.sendKeys(Description);
			Thread.sleep(400);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
			Thread.sleep(400);

			js.executeScript("arguments[0].scrollIntoView();", resultadd);
			Thread.sleep(400);
			resultadd.click();
			Thread.sleep(400);
			js.executeScript("arguments[0].scrollIntoView();",ResultInterpretation);
			Thread.sleep(400);
			ResultInterpretation.click();
			Thread.sleep(500);

			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//button[@id='servicemasterupdate']")));
			Thread.sleep(500);

			driver.findElement(By.xpath("//button[@id='servicemasterupdate']")).click();
			Thread.sleep(1000);

			/////////PCTS OK	

			/*		Thread.sleep(1000);
			List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']"));
			Thread.sleep(400);
			System.out.println(dynamicElement1.size());	
			if(dynamicElement1.size() !=0)

			{
				driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
				Thread.sleep(400);

			}

			else {


				System.out.println("sri");
			}
			Thread.sleep(400); */


		}

		if(panel.equals("Yes")) {

			System.out.println("panel service");

			/*		Thread.sleep(400);
			search.clear();
			Thread.sleep(400);
			search.sendKeys(ServiceName);
			Thread.sleep(400);
			driver.findElement(By.xpath("//div[@title='"+ServiceName+"']")).click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
			Thread.sleep(400);

			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", rangemode);

			Thread.sleep(400);
		//	resultadd.click();
			Thread.sleep(400);
			driver.findElement(By.xpath("//button[@id='servicemasterupdate']")).click();
			Thread.sleep(1000);

			 */















			///---critical
			/*	Thread.sleep(400);
		rangemode.click();
		Thread.sleep(400);
		rangemode.sendKeys(RangeMode2);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+RangeMode2+"')]")).click();
		Thread.sleep(400);
		Agefromrange.clear();
		Thread.sleep(400);
		Agefromrange.sendKeys(CriticalAgeFrom);
		Thread.sleep(400);
		Agefromrangeunit.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+CriticalAgeFromUnit+"')]")).click();
		Thread.sleep(400);
		AgetorangeAge.clear();
		Thread.sleep(400);
		AgetorangeAge.sendKeys(CriticalAgeTo);
		Thread.sleep(400);
		Agetorangeunit.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+CriticalAgeToUnit+"')]")).click(); 
		Thread.sleep(400);
		comparison.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+Comparision+"')]")).click(); 
		Thread.sleep(400);
		minvalue.clear();
		Thread.sleep(400);
		minvalue.sendKeys(CriticalMin);
		Thread.sleep(400);
		maxvalue.clear();
		Thread.sleep(400);
		maxvalue.sendKeys(CiticalMax);
		Thread.sleep(400);
		resultadd.click();
		Thread.sleep(400);
		ServiceMasterSave.click();
		Thread.sleep(2000);

		hamberger.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();


			 */

			//////////////////////////////////////////////////////////////////////////////////////////////  

		}


	}

	public void codeEdit(String ServiceName,String CodeType1 , String CODE1) throws InterruptedException {

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

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(400);
		Codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+CodeType1+"')]")).click();
		Thread.sleep(400);
		coDE.clear();
		Thread.sleep(400);
		coDE.sendKeys(CODE1);
		Thread.sleep(400);
		CPTAdd.click();
		Thread.sleep(400);

		driver.findElement(By.xpath("//button[@id='servicemasterupdate']")).click();

		Thread.sleep(1200);

	}      

	
	public void ServiceEdit(String ServiceName,String ServiceDescription) throws InterruptedException {
		
		

		Thread.sleep(400);
		search.clear();
		Thread.sleep(400);
		search.sendKeys(ServiceName , Keys.ENTER);
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[@title='"+ServiceName+"']")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
	Thread.sleep(800);
		

	Thread.sleep(400);
	Description.clear();
	Thread.sleep(400);
	Description.sendKeys(ServiceDescription);
	Thread.sleep(400);
		
	Thread.sleep(400);

	driver.findElement(By.xpath("//button[@id='servicemasterupdate']")).click();

	Thread.sleep(1200);
		
		
		
	}
	
	
	
	
	
}      


























