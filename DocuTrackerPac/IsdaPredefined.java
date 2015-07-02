package DocuTrackerPac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



	public class IsdaPredefined {		

		static String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net/";
		static WebDriver driver=new FirefoxDriver();
		
		public static void createisdaPredefined() throws Exception {
				
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("keerthyadmin");
			driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
			driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
			driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
			Thread.sleep(8000);
			IsdaPredefined prdrep=new IsdaPredefined();
			prdrep.RepeatCode();
			
			}
		public void RepeatCode() throws Exception
		{
			//==================Reports====================================
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();
			System.out.println(" Clicking On Reports");
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/a")).click();
			System.out.println(" Clicking On Predefined Reports");
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/ul/li[1]/a")).click();
			System.out.println("Selecting ISDA");
			Thread.sleep(5000);           
			driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td/a")).click();
			System.out.println(" Clicking On Alpha");
			Thread.sleep(3000);
			System.out.println("navigating to ISDA Provisions");
			Thread.sleep(5000);
					}
		public void repeat2() throws InterruptedException, AWTException
		{
	 		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
	 		System.out.println("GO Button Clicked");
	 		Thread.sleep(10000);
	 		
	 		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li[2]/ul/li[1]/div/div/div/div/span[2]/label/span[1]")).click();
	 		System.out.println("Select All Agreements Selected");
	 		Thread.sleep(5000);
	 		
	 		
	 		driver.findElement(By.xpath(".//*[@id='btnSubmitAG']")).click();
	 		System.out.println("Save Button clicked");
	 		Thread.sleep(15000);
	 		
	 		
	 		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
	 		System.out.println("Click the Excel Report Button General PB Agreement");
	 		Thread.sleep(10000);
	 		
	 		
	 		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
	 		System.out.println("Download Report Button Clicked General PB Agreement");
	 		Thread.sleep(15000);
	 		
	 		
		}
		public void keypersonAgree() throws Exception
		{
			System.out.println("Selecting Client Entity Key Person Provisions ");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridSavedReports_linkbutton_2']")).click();
			Thread.sleep(10000);
			System.out.println("Selecting Agreements");
			//Select AgreementStyle
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementStyle']"))).selectByVisibleText("All types");
			Thread.sleep(4000);                    
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("All Client Entities");
			Thread.sleep(4000);
		}
		public void kpce() throws InterruptedException
		{
			System.out.println("Selecting Counterparty Key Person Provision");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridSavedReports_linkbutton_3']")).click();
			Thread.sleep(10000);
			System.out.println("Selecting Agreements");
			//Select AgreementStyle
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementStyle']"))).selectByVisibleText("All types");
			Thread.sleep(4000);                    
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("All Client Entities");
			Thread.sleep(4000);
		}
		public static void ISDAPREDEFINEDReport() throws Exception
		{
			IsdaPredefined.createisdaPredefined(); 
			
			IsdaPredefined isdapre=new IsdaPredefined();
			isdapre.keypersonAgree();
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
	 		System.out.println("IDS include");
	 		Thread.sleep(3000);
	 		
			IsdaPredefined isdaprerep=new IsdaPredefined();
			isdaprerep.repeat2();
						
			Robot rbt=new Robot();
			rbt.keyPress(KeyEvent.VK_DOWN);
			
			Thread.sleep(4000);
			Robot rbt1=new Robot();
			rbt1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);	
			
	 		
	 		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
	 	  	Thread.sleep(8000);
	 	  	
	 	  	IsdaPredefined prdrep=new IsdaPredefined();
			prdrep.RepeatCode();
	
		       //=======================IDS  do not include==================================================
		         	
			    Thread.sleep(4000);
				IsdaPredefined isdapre1=new IsdaPredefined();
				isdapre1.keypersonAgree();
				
				driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		 		System.out.println("IDS  do not include");
		 		
		 		IsdaPredefined isdaprerep123=new IsdaPredefined();
				isdaprerep123.repeat2(); 
		 				 		
				Thread.sleep(4000);
				Robot rbt121=new Robot();
				rbt121.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(5000);

		 		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
		 	  	Thread.sleep(5000);
		 	  	
				IsdaPredefined prdrepdids=new IsdaPredefined();
				prdrepdids.RepeatCode();
				
				/////////////////////////kpce////////////////////
				
				IsdaPredefined isdapre123=new IsdaPredefined();
				isdapre123.kpce();
				driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		 		System.out.println("IDS include");
		 		Thread.sleep(3000);
		 		
				IsdaPredefined isdapr12erep=new IsdaPredefined();
				isdapr12erep.repeat2();
				
				
				Thread.sleep(3000);
				Robot rbt14=new Robot();
				rbt14.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(5000);	
				
		 		
		 		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
		 	  	Thread.sleep(4000);
		 	  	
		 	  	IsdaPredefined prdrep45=new IsdaPredefined();
				prdrep45.RepeatCode();
		
			       //=======================IDS  do not include==================================================
			         	
				    Thread.sleep(4000);
					IsdaPredefined isdape1=new IsdaPredefined();
					isdape1.kpce();
					
					driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
			 		System.out.println("IDS  do not include");
			 		
			 		IsdaPredefined isdaprerep12=new IsdaPredefined();
					isdaprerep12.repeat2(); 
			 				 		
					Thread.sleep(3000);
					Robot rbt21=new Robot();
					rbt21.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(4000);

			 		driver.findElement(By.xpath(".//*[@id='rhome']")).click();
			 	  	Thread.sleep(5000);
			 	  	
					IsdaPredefined prdepdids=new IsdaPredefined();
					prdepdids.RepeatCode();
		}}
								
				
		