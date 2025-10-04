package classThree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// open Chrome Browser
		ChromeDriver Driver = new ChromeDriver();
		// browser maximize
		Driver.manage().window().maximize();
		// set the URL to the browser and navigate to the browser
		Driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=6C4EA087219EC52DCDBDA1C9C3DA1596");
		// Hard Assertion 
		WebElement AtmServices = Driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[1]"));
		String services = AtmServices.getText() ;
		System.out.println("Print the get String ");
		System.out.println(services);
		
		Driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();

		// registration
		 
		/*  Driver.findElement(By.id("customer.firstName")).sendKeys("Tasnia");
		  Driver.findElement(By.id("customer.lastName")).sendKeys("Khan");
		  Driver.findElement(By.id("customer.address.street")).sendKeys("Narsingdi");
		  Driver.findElement(By.id("customer.address.city")).sendKeys("Shibpur ");
		  Driver.findElement(By.id("customer.address.state")).sendKeys("Dhanua");
		  Driver.findElement(By.id("customer.address.zipCode")).sendKeys("1620");
		  Driver.findElement(By.id("customer.phoneNumber")).sendKeys("01680016606");
		  Driver.findElement(By.id("customer.ssn")).sendKeys("1234");
		  Driver.findElement(By.id("customer.username")).sendKeys("tasniaa");
		  Driver.findElement(By.id("customer.password")).sendKeys("tasniakhan1");
		  Driver.findElement(By.id("repeatedPassword")).sendKeys("tasniakhan1");
		  Driver.findElement(By.xpath(
		  "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		 */

		// logout
		  //Driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

		// login
		
		  Driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).
		  sendKeys("tasniaa");
		  Driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).
		  sendKeys("tasniakhan1");
		  Driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).
		  click();
		 

	    // Open NEW Account 
		  Driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
		//What type of account i would like to open   
		// Select Account Type dropdown
		WebElement accountTypeDropdown = Driver.findElement(By.id("type"));
		Select accountType = new Select(accountTypeDropdown);
		accountType.selectByVisibleText("SAVINGS"); // or CHECKING

		// Select From Account dropdown
		WebElement fromAccountDropdown = Driver.findElement(By.id("fromAccountId"));
		Select fromAccount = new Select(fromAccountDropdown);
		fromAccount.selectByIndex(0); // First select available account 

		// Click Open New Account button
		Driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input")).click();
         
		// Wait up to 10 seconds
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));

		// Heading text
		WebElement Accountopen = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//*[@id='openAccountResult']/h1")));
		String Account = Accountopen.getText();
		System.out.println("Heading: " + Account);

		// Message text
		WebElement messagematch = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//*[@id='openAccountResult']/p[1]")));
		String message = messagematch.getText();
		System.out.println("Message: " + message);
		// wait for 3 seconds
		Thread.sleep(3000);
	}

}
