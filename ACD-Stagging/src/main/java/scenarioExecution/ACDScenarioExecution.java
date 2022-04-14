package scenarioExecution;


import java.net.MalformedURLException;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import acd.ACDTestScript;
import pages.MyAcheck.CreateInvite.*;
import utilities.Baseclass;

public class ACDScenarioExecution extends Baseclass{
	
	@Test(priority = 1)
	public void ACDscript(ITestContext ctx) throws MalformedURLException, InterruptedException {
		ACDTestScript acd=new ACDTestScript();
		Thread.sleep(10000);
		
		//<----------------------------ACD- Method---------------->
		acd.startTest();
		acd.basicDetail(ctx);
		acd.addReport(ctx);
		acd.docUpload(ctx);
		acd.FileInfo(ctx);
		acd.Actions(ctx);
		acd.ACDQuicklinks();
		acd.SearchRequest();
		acd.OfflineReports();
		acd.FileAdjud_FCRA();
		Thread.sleep(5000);
		
	}
	
  @Test (priority = 2,groups = {"MyAcheck"})  
  public void myAcheckCreateInvite(ITestContext ctx) throws InterruptedException {
	  
	  Acheckloginpage acheckloginpage=new Acheckloginpage();
	  Createinvitationpage createinvitationpage=new Createinvitationpage();
		Devdirectloginpage devdirectloginpage=new Devdirectloginpage();
		Mainpage mainpage=new Mainpage();
		Acheckapplicationpage acheckapplicationpage =new Acheckapplicationpage();
  Thread.sleep(10000);
  //<----------------------------MyAcheck-Create Invite- Method---------------->
	  acheckloginpage.login();
	  mainpage.clickMyACheck();
	  mainpage.clickCreateInvitation();
	  createinvitationpage.clickAlacarte();
	  createinvitationpage.clickEducationVerification();
	  createinvitationpage.fillApplicantInformation();
	  //createinvitationpage.fillBillingCode();
	  createinvitationpage.sendInvitation();
	  devdirectloginpage.login();
	  acheckapplicationpage.startApplication();
	  acheckapplicationpage.personalInformation();
	  acheckapplicationpage.education();
	  acheckapplicationpage.auditReview();
	  //acheckapplicationpage.consumerReport();
	  //acheckapplicationpage.investigativeConsumerReport();
	  //acheckapplicationpage.stateNotice();
	  //acheckapplicationpage.consumerReportAuth();
	 // acheckapplicationpage.summaryOfRights();
	  acheckapplicationpage.esign(ctx);
	  System.out.println("-->MyAcheck-Create Invite- Method is Executed Successfully");
	  Thread.sleep(10000);
	}


}
