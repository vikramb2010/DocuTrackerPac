package DocuTrackerPac;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class NewTest {
 
/*	 @Test
public void createISDAWorkflowTest() throws InterruptedException, AWTException{
	  ISDAworkflow.CreateISDAWorkflow();
	  }

	  @Test
	  public static void PBWorkflowTest() throws InterruptedException, AWTException {
			
		  PBworkflowTest.CreatPBTestWorkflow();
		}
	  @Test
	  public static void ISDABENCHMARKsingleReportTest() throws InterruptedException, AWTException {
	  	 Helper.ISDABENCHMARKsingleReportTest();
	  }
	  
	  	
	 
	@Test
	 public void LoginAppTest() throws InterruptedException
	 {
		  Helper.loginapp("maniadmin", "123456","http://73f03a3c373340a596d220e47e539824.cloudapp.net");
	 }
	  

  	@Test
  	public void ISDACopytemplateTest() throws InterruptedException{
  		  Helper.ISDAcopytemplate();
  		  }
	

	  @Test
	  public void PBCopytemplateTest() throws InterruptedException{
	  	  Helper.PBcopytemplate();
	  	  }
	    
  @Test(priority = 0)
  public void SearchAgreementTest(){
	  Helper.searchagreement();
	  }
	  
 
  @Test
	  public static void PBCustomReportFiltersTest() throws InterruptedException, AWTException {
	 pbCustomReportFilters.CreatPBCustomReportFilters();
		}


	@Test
	 public static void PBPredefinedReportTest() throws Exception{
		PBPredefined.createPbPredefined();
		}

	@Test
	 public static void ISDAPredefinedReportTest() {
		 ISDAPredefined.CreatISDAPredefinedReport();
		}
 	
   @Test
	  public void ArchiveTest() throws InterruptedException{
	    Helper.ClientArchive();
	  }
  	  @Test
public static void ISDACustomReportTest() throws InterruptedException, AWTException {
	 CustomReport.ISDACustomReportTset("bfgnvsrej");
	}
 
	

	/*@Test
	 public static void ISDACustomReportFiltersTest() throws Exception {
		 iSDACustomReportFilters.ISDACR();
		}
	 
	@Test
	  public static void ISDADRAFTCustomReportTest() throws InterruptedException, AWTException {
		 CustomReport.ISDADraftCustomReportTset("cbgbdgaryb");
		}
	 @Test
	  public static void PBCustomReportTest() throws InterruptedException, AWTException {
		CustomReport.PBCustomReportTset("vbbbggserre");
		}
	 
	 
	@Test
	 public static void ISDAPredefinedReportTest() throws Exception{
		IsdaPredefined.ISDAPREDEFINEDReport();
		}  */
                                                 
	@Test
	  public static void CreateISDADraft() throws InterruptedException, AWTException {
		  Create_ISDADraftAgreement.CreateISDADraft();
	  }
  }

