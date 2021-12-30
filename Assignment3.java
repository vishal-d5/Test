package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();

		driver.get("http://zero.webappsecurity.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("signin_button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		driver.findElement(By.id("user_remember_me")).click();
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		  
		  driver.findElement(By.id("details-button")).click();
		  
		  Thread.sleep(2000);
			 
			 driver.findElement(By.id("proceed-link")).click();
			 
			 Thread.sleep(2000);
		
		driver.findElement(By.linkText("Pay Bills")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Purchase Foreign Currency")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("purchase_cash")).click();
		
		Thread.sleep(2000);
		
		Alert alt= driver.switchTo().alert();
		String alertmsg=alt.getText();
		System.out.println(alertmsg);
		
		alt.accept();
		
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		
//Select sel= new Select (driver.findElement(By.xpath("//a[@data-toggle='dropdown']")));
//sel.selectByVisibleText("Logout");

Thread.sleep(2000);



		
		//************************************************
		
		
		
		/*
		 * driver.navigate().to("https://www.naukri.com/"); Thread.sleep(10000);
		 * 
		 * Alert alt2= driver.switchTo().alert();
		 * 
		 * String alertmsg2= alt2.getText(); System.out.println(alertmsg2);
		 * 
		 * alt2.dismiss();
		 */
		
		
	driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
	
	Thread.sleep(5000);
	
 driver.findElement(By.xpath("//button[contains(text(),'Try it']")).click();
	
	Alert alt2= driver.switchTo().alert();
	
	String alertmsg2= alt2.getText();
	
   System.out.println(alertmsg2);
     
    alt2.dismiss();
     
     
     

	 // driver.navigate().to("https://www.naukri.com/");
	 
	// Thread.sleep(10000);
	 
	// driver.findElement(By.xpath("Services")).click();
	 
		
		
		
		
		
		

		driver.close();

		driver.quit();

	}

}
