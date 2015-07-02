package DocuTrackerPac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class iSDACustomReportFilters {
	
static WebDriver driver=new FirefoxDriver();
    

	public  void Login() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
		Thread.sleep(5000);
		iSDACustomReportFilters.repeat1();
	}
	
	public static void repeat1() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom 
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkExec_0']")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/div/div/div/span[1]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[1]/div/div/div/div/span[2]/label/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
		Thread.sleep(13000);
	}
	public static void repeatfdr() throws InterruptedException, AWTException
	{
		driver.findElement(By.xpath(".//*[@id='FilterTree' and @value='Filter Questions']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		Thread.sleep(5000);
		for(int i=0;i<15;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		 Thread.sleep(1000);
		Random randomGenerator = new Random();
		  boolean i = true;
		  while(i)
		  {
		   int r = randomGenerator.nextInt(10000);
		   System.out.println("Generated : " + r);
		   i=false;  
		  Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("Filter"+r);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Submit' and @value='Save']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='mybutton' and @value='Click here to create excel report']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[@id=' downloadReport1' and @class='buttonDownLoadReport']")).click();
		Thread.sleep(3000);
		Robot rbt1=new Robot();
		rbt1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[contains(.,'Return to Home')]")).click();
		Thread.sleep(2000);
		iSDACustomReportFilters.repeat1();
	}
	}

	public static void ISDACR()  throws InterruptedException, AWTException
	{
		iSDACustomReportFilters ic=new iSDACustomReportFilters();
		ic.Login();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();
		System.out.println("All include");
			/////////12/////////
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFNI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSNI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr(); 
		System.out.println("12");
		////////////////124///////////////
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSNI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();   
		System.out.println("124");
		///////////////////////134/////////////////////
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPNI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();   
		System.out.println("134");
		/////////////////////////(2+3+4)////////////
		driver.findElement(By.xpath(".//*[@id='CENI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();
		System.out.println("2+3+4");
/////////////////////////(1+2+3)////////////
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFNI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();  
		System.out.println("1+2+3");
/////////////////////////(1+3)////////////
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPNI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFNI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();  
		System.out.println("1+3"); 
/////////////////////////(1+4)////////////
		driver.findElement(By.xpath(".//*[@id='CEI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPNI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSNI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr(); 
		System.out.println("1+4");
/////////////////////////(2+3) ////////////
		driver.findElement(By.xpath(".//*[@id='CENI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFNI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSI' and @name='Identify']")).click();
		Thread.sleep(1000);
		iSDACustomReportFilters.repeatfdr();  
		System.out.println("2+3");
///////////////////////// (2+4) ////////////
		driver.findElement(By.xpath(".//*[@id='CENI' and @name='Client']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='CPI' and @name='counterparty']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='RFI' and @name='Renegotiate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='IDSNI' and @name='Identify']")).click();
		Thread.sleep(1000);
		System.out.println("2+4");
		
	}
}

	
