package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CheckboxusingTestNG {
	WebDriver driver=new ChromeDriver();
	long StartTime;
	long EndTime;

	@BeforeSuite
	public void launchbrowser() throws InterruptedException
	{
		StartTime=System.currentTimeMillis();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("http://leafground.com/pages/checkbox.html");

	}
	@Test(priority=1)
	public void languages() throws InterruptedException
	{
		//1. Select the languages that you know?
		WebElement Language1=driver.findElement(By.xpath("	//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		Language1.click();
		Thread.sleep(1000);
		WebElement Language2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[2]"));
		Language2.click();
	}
	@Test(priority=2)
	public void confirm() throws InterruptedException
	{
		//2. Confirm Selenium is checked
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		Boolean value=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input")).isEnabled();
		System.out.println(value);
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void deselect()
	{
		//3. DeSelect only checked
		WebElement deselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		deselect.click();
	}

	@Test(priority=4)
	public void selenium() throws InterruptedException
	{
		//4. DeSelect only checked-Not Selected field
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		Boolean value1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]")).isSelected();
		System.out.println(value1);
		Thread.sleep(1000);
	}

	@Test(priority=5)
	public void alloptions() throws InterruptedException
	{
		//5. Select all below checkboxes
		WebElement Option1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		Option1.click();
		Thread.sleep(1000);
		WebElement Option2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		Option2.click();
		Thread.sleep(1000);
		WebElement Option3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		Option3.click();
		Thread.sleep(1000);
		WebElement Option4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		Option4.click();
		Thread.sleep(1000);
		WebElement Option5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		Option5.click();
		Thread.sleep(1000);
		WebElement Option6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		Option6.click();
		Thread.sleep(1000);
	}

	@AfterSuite
	public void closebrowser()
	{
		EndTime=System.currentTimeMillis();
		long totaltime=EndTime-StartTime;
		System.out.println("Total Time Taken " +totaltime);
		driver.close();
	}

}

