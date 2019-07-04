package first1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium browser\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 String baseurl ="https://connect.maveric-systems.com/index.php/site/login";
		driver.get(baseurl);
		
		Thread.sleep(2000);
		System.out.println("chiti");
		driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys("raghavilathaa");
	    driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys("raghavi2696");
	    driver.findElement(By.xpath("//input[@name='yt0']")).click();
		Thread.sleep(2000);
		

		Actions actions =new Actions(driver);
		WebElement mainMenu = driver.findElement(By.linkText("Timecard"));
		actions.moveToElement(mainMenu).build().perform();
		Thread.sleep(4000);

		
		WebElement subMenu = driver.findElement(By.linkText("Add Timecard"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		
		//driver.findElement(By.xpath("//input[@id='submitweekly']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("submitweekly")).click();
		/*
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		WebElement Element =driver.findElement(By.id("submitweekly"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		*/
}

	
}