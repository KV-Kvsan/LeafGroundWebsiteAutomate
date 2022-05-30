package alertpageautomate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(3000);
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,450)", "");
		Thread.sleep(2000);
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		Thread.sleep(3000);

		//1. Alert Box
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);

		//2.Confirm Box
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		Alert confirm=driver.switchTo().alert();
		Thread.sleep(2000);
		confirm.dismiss();
		Thread.sleep(2000);

		//3. Prompt Box
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Keerthi");
		Thread.sleep(2000);
		prompt.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
