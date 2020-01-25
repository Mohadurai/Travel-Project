package org.project;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AirlineProject  extends BaseClass 
{


	@BeforeClass
	public static void beforeClass()
	{
		Date date = new  Date();		
		System.out.println("Start Time:" +date);
		
		browesr();
		geturl("https://www.hkexpress.com/en-hk/");
	}
	
	
    @Before
	public void before() throws Throwable
	{
    	path("/html/body/div/div/div/div/div/button");
    	webelement.click();
    	
    	Thread.sleep(5000);
    	Screenshot("Openpage.png");
    	
	}
    @Test
	public void test() throws Throwable
	{
    	path("//*[@id=\"outboundDepartureStation_mc\"]");
    	txtsend("Hong Kong");
		
		path("//a[@id='HKG']");
		webelement.click();
		Thread.sleep(5000);
		
		path("//*[@id='outboundArrivalStation_mc']");
		txtsend("tokyo");
		
		path("//a[@id='TYO']");
		webelement.click();
	
		
		
		path("//*[@id=\"tab-panel\"]/ibe-tab/flight-search/div/div/form/div/div[2]/div/div[2]/div/ibe-datepicker/ngb-datepicker/div[1]/ngb-datepicker-navigation/div[2]/button");
		webelement.click();
		
		
		path("//*[@id=\"tab-panel\"]/ibe-tab/flight-search/div/div/form/div/div[2]/div/div[2]/div/ibe-datepicker/ngb-datepicker/div[1]/ngb-datepicker-navigation/div[2]/button");
		webelement.click();
		
		path("//input[@id='departureDateInput']");
		txtsend("");
		path("(//span[@class='custom-day ng-star-inserted'])[56]");	
		webelement.click();
		
		path("(//button[@class='ui-input'])[3]");	
		webelement.click();
		
		path("//button[@id='triptype-0']");	
		webelement.click();
		
		path("//button[@class='button btn-action']");	
		webelement.click();
		
		Screenshot("AirlineSeclet.png");
		
		Thread.sleep(20010);
		
		path("//button[@class='ng-tns-c0-0 price-rate price-discounted ng-star-inserted']");
		script(webelement);
		
		path("(//button[@class='button btn-secondary'])[3]");
		script(webelement);
		
		Screenshot("text.png");
		
		Thread.sleep(12000);
		
		path("//button[@class='button btn-action']");
		script(webelement);
		Thread.sleep(12000);
		path("//input[@id='lastName0']");
		txtsend("Mohan");
		
		Thread.sleep(12000);
		path("//input[@id='firstName0']");
		txtsend("Dass");
		
		Screenshot("Namedetails.png");
		
		//path("//*[@id=\"fares_flight\"]/div/div[2]/div[3]/flight-fare/div[3]/button");	
		//webelement.click();
		
		
		//dd
		path("(//button[@class='ui-input'])[3]");
		script(webelement);
		
		path("//button[@id='dateDay-1']");
		script(webelement);
		
		//mm
		path("(//button[@class='ui-input'])[4]");
		script(webelement);
    	
		path("//button[@id='dateMonth-0']");
		script(webelement);
		
		
		
		//yy
		path("(//button[@class='ui-input'])[5]");
		script(webelement);
    	
		path("//button[@id='dateYear-18']");
		script(webelement);
		
		Screenshot("Month.png");
		
		path("//button[@class='button btn-action']");
		script(webelement);
		Thread.sleep(12000);
		
		
		//add
		path("//button[@class='button btn-action']");
		script(webelement);
		Thread.sleep(12000);
				
		//Seat 
		path("(//button[@class='seat upfront'])[2]");
		script(webelement);
		Thread.sleep(12000);
		path("//button[@class='button btn-action']");
		script(webelement);
		Thread.sleep(10000);
		
		Screenshot("Seat.png");
		
		//Contact details
		path("//input[@name='lastName']");
		txtsend("Mohan");
	
		
	
		Screenshot("text.png");
		path("//input[@name='firstName']");
		txtsend("Dass");
		
		path("(//button[@class='ui-input'])[1]");
		script(webelement);
		
		path("//button[@id='countrySelect-2']");
		script(webelement);
		
		
		//Mobile
		path("(//button[@class='ui-input'])[2]");
		script(webelement);
		
		path("//a[text()='Japan (81)']");
		script(webelement);
		
		path("//input[@name='mobileNumber']");
		txtsend("5231234");
		
		Screenshot("text.png");
		path("//input[@name='email']");
		txtsend("Durai@gmail.com");
		
		path("//input[@name='confirmEmail']");
		txtsend("Durai@gmail.com");
		
		path("//input[@name='sms']");
		script(webelement);
		
		
		Screenshot("Finish.png");
		
		
			}
    
	@After
   public  void after()  
   {
		Date date = new  Date();		
		System.out.println("End time:" +date);

   }
    @AfterClass
   public static void afterClass()
   {
	
    	quit();
}
}

