package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeTestPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		
		
		//driver.findElementByClassName("btn btn-primary").click();
		//driver.findElementByLinkText("Login").click();
		driver.findElementByXPath("/html/body/div/div[2]/div/div/div/form/button").click();
		
		
		
		System.out.println("Current page: "+driver.getTitle() );
		System.out.println("current url: "+driver.getCurrentUrl());
		
		driver.findElementByLinkText("Log Out").click();
		
Thread.sleep(5000);
	}

}
