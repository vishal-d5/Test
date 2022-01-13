package SeleniumBasics;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();

		driver.get("http://zero.webappsecurity.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signin_button")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		driver.findElement(By.id("user_remember_me")).click();
		
		driver.findElement(By.name("submit")).click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		  
		  
		  driver.findElement(By.id("details-button")).click();
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 driver.findElement(By.id("proceed-link")).click();
			 
			 WebDriverWait wait = new WebDriverWait(driver,20);
			 
			  wait.until(ExpectedConditions.textToBe(By.className("board-header"), "Cash Accounts"));
			 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Pay Bills")).click();
		
		 WebDriverWait wait1= new WebDriverWait(driver, 20);
		 wait1.until(ExpectedConditions.textToBe(By.className("board-header"), "Make payments to your saved payees"));
		 
		
		
		
		
		driver.findElement(By.linkText("Purchase Foreign Currency")).click();
		
		WebDriverWait wait2= new WebDriverWait(driver, 20);
		 wait2.until(ExpectedConditions.textToBe(By.xpath("//h2[contains(text(),'Purchase foreign currency cash')]"), "Purchase foreign currency cash"));
		
		
		
		
		
		driver.findElement(By.id("purchase_cash")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Alert alt= driver.switchTo().alert();
		String alertmsg=alt.getText();
		System.out.println(alertmsg);
		
		alt.accept();
		
		
		
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		
     // Select sel= new Select (driver.findElement(By.xpath("//a[@id='logout_link']")));
      //sel.selectByVisibleText("Logout");

		driver.findElement(By.xpath("//li[3]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@id='logout_link']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
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
	
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
// driver.findElement(By.xpath("//button[contains(text(),'Try it']")).click();
	
	
	WebElement iframe= driver.findElement(By.id("iframeResult"));
	 
	driver.switchTo().frame(iframe);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	
	Alert alt2= driver.switchTo().alert();
	
	String alertmsg2= alt2.getText();
	
   System.out.println(alertmsg2);
     
    alt2.dismiss();
     
     
     

	// driver.navigate().to("https://www.naukri.com/");
	 
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	// driver.findElement(By.cssSelector(".bannerItemLink[href='https://w28.naukri.com/advertiser/bms_hits.php?banner=7305520']")).click();
	 
//.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	
    
    
    
    
    
    
    
    // String pHandle = driver.getWindowHandle();
	 
	// System.out.println(pHandle);
	 
	// Thread.sleep(2000);
	  //Set <String> handles= driver.getWindowHandles();
	  
	//  System.out.println(handles);
	  
	//  System.out.println(driver.getTitle());
	  
	//  driver.switchTo().frame(1);
	//  System.out.println(driver.getTitle());
	  
	 
	  //for (String)
	 
	// ArrayList <String>newtab= new ArrayList<String>(driver.getWindowHandles());
	 
	// driver.switchTo().window(newtab.get(1));
	// String newTitle=driver.getTitle();
	// System.out.println(newTitle);
	 
	// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 //	String heading =driver.findElement(By.xpath("//h1[@id='jobCountHeading']")).getText();
	 	
	 //	System.out.println(heading);
	// 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	
	 	
	 	// driver.switchTo().frame(0);
	 	// Thread.sleep(2000);
	 	 
	 
	    
	 
		
		
		
		
		
		

		driver.close();

		driver.quit();

	}

}
