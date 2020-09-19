package Week2.day1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) throws InterruptedException 
	{
		//second create the webdriverManager and import it
		WebDriverManager.chromedriver().setup();
		
	
		
		// first create the chrome drive
              ChromeDriver driver=new ChromeDriver();
              
         	 // to max the windows
              driver.manage().window().maximize();
              
             
         
        // third enter the url
              driver.get("http://leaftaps.com/opentaps/control/main");
              
              //get the username
              
               	WebElement username = driver.findElementById("username");
               	username.sendKeys("demosalesmanager");
               	driver.findElementById("password").sendKeys("crmsfa"); 
               	driver.findElementByClassName("decorativeSubmit").click();
               	
               	//using linktag locator we can move to next page
               	
               	driver.findElementByLinkText("CRM/SFA").click();
               	
               	// click Lead to move to Lead page
               	
             	driver.findElementByLinkText("Leads").click();
               	
               	// click lead create page to enter the value
            	driver.findElementByLinkText("Create Lead").click();
            	
            	// create Leads
            	// value of company Name
            WebElement company= driver.findElementById("createLeadForm_companyName");
           company.sendKeys("TestLeaf");
           driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
           driver.findElementById("createLeadForm_lastName").sendKeys("Avin");
           
           // create the dropdown value
           
           WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
           Select source= new Select(dropdown1);
           source.selectByVisibleText("Employee");
           
           // selecting second dropdown value using Select By Value 
           WebElement marketingcompain = driver.findElementById("createLeadForm_marketingCampaignId");
           Select dropdown =new Select(marketingcompain);
           dropdown.selectByValue("CATRQ_CAMPAIGNS");
           
           // selecting third dropdown by using Id locator and select the element using size 
           WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
           Select dropdown3=new Select(industry);
           
           List<WebElement> options = dropdown.getOptions();
           int size= options.size();
           dropdown3.selectByIndex(size-2);
           
           // select the value by using selectByValue 
           WebElement occupation = driver.findElementById("createLeadForm_ownershipEnumId");
           Select drowoccupation=new Select(occupation);
           
           drowoccupation.selectByValue("OWN_CCORP");
           
           //enter the country value as India using Visible Text
           WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
           Select dropcountry= new Select(country);
           dropcountry.selectByVisibleText("India");
           
           
           
           //create Lead Button
           driver.findElementByName("submitButton").click();
           System.out.println("the title of the page: "+driver.getTitle());
           System.out.println("the current url of the page: "+driver.getCurrentUrl());
         //  System.out.println("The page source coad: "+driver.getPageSource());
        //   Thread.sleep(8000);
           driver.close();
           
           
           
              
		
		}

}
