package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EditboxusingTestNG
{
	WebDriver driver=new ChromeDriver();
	long StartTime;
	long EndTime;

	@BeforeSuite
	public void launchbrowser() throws InterruptedException
	{
		StartTime=System.currentTimeMillis();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void Email() throws InterruptedException
	{	

		//Print an email Label
		WebElement mailLabel=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/label"));
		String Label=mailLabel.getText();
		System.out.println(Label);

		//Print an mail id
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		String mail=driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(mail);
		Thread.sleep(2000);

	}
	@Test(priority=2)
	public void Append() throws InterruptedException
	{	

		//Print an Append a text and press keyboard tab label
		WebElement App=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label"));
		String Append=App.getText();
		System.out.println(Append);

		//Print an Append Text
		WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("LeafGround");
		String text=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).getAttribute("value");
		System.out.println(text);
		Thread.sleep(2000);
	}

	@Test(priority=3)
	public void DefaultText()
	{
		//print an Get default text entered Label
		WebElement def=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/label"));
		String deftext=def.getText();
		System.out.println(deftext);

		//Print an default text entered
		WebElement Default=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String Text=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).getAttribute("value");
		System.out.println(Text);

	}

	@Test(priority=4)
	public void clear()
	{
		//Print the clear Text
		WebElement Clear=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		Clear.clear();
	}

	@Test(priority=5)
	public void confirmbox() throws InterruptedException
	{
		//Confirm that edit field is disabled Label
		WebElement confirm=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/label"));
		String editfield=confirm.getText();
		System.out.println(editfield);

		//Confirm that edit field is disabled
		WebElement disabled=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean value=disabled.isEnabled();
		System.out.println(value);
		Thread.sleep(2000);
	}

	@AfterSuite
	public void closebrowser() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		EndTime=System.currentTimeMillis();
		long totaltime=EndTime-StartTime;
		System.out.println("Total Time Taken " +totaltime);
		driver.close();

	}
}