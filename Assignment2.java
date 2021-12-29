package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();

		driver.get("http://zero.webappsecurity.com/");
		
		driver.findElement(By.id("signin_button")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//strong[contains(text(),'Feedback')]")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("name")).sendKeys("Vishal Deshpande");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("#email")).sendKeys("Vishal@gmail.com");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[placeholder='Subject']")).sendKeys("NA");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("textarea")).sendKeys("NA");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.cssSelector(".btn")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[type=submit]")).click();
		 
		 Thread.sleep(2000);
		 
		  //driver.findElement(By.xpath("//button[@id='signin_button']")).click();
		  
		 // Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("user_password")).sendKeys("password");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.tagName("i")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("user_remember_me")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.linkText("Forgot your password ?")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.navigate().back();
		  
          driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("user_password")).sendKeys("password");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("submit")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("details-button")).click();
		  
		  Thread.sleep(2000);
			 
			 driver.findElement(By.id("proceed-link")).click();
			 
			 Thread.sleep(2000);
		  
		  driver.findElement(By.partialLinkText("Bills")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.linkText("Add New Payee")).click();
		  Thread.sleep(2000);
		  
		   driver.findElement(By.cssSelector("#np_new_payee_name.span4")).sendKeys("vishal");
		  
		   Thread.sleep(2000);
		  
		  
		  driver.findElement(By.cssSelector("textarea[required='required']")).sendKeys("Pune");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("np_new_payee_account")).sendKeys("saving");

		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@name='details']")).sendKeys("google Pay");
		  Thread.sleep(2000);
		  
		   driver.findElement(By.cssSelector("input#add_new_payee")).click();
		   Thread.sleep(2000);
		driver.close();

		driver.quit();
	}

}
