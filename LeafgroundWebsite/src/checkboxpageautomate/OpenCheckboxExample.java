package checkboxpageautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCheckboxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/checkbox.html");
		Thread.sleep(2000);

		//1. Select the languages that you know?
		WebElement Language1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		Language1.click();
		Thread.sleep(2000);
		WebElement Language2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[2]"));
		Language2.click();

		//2. Confirm Selenium is checked
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		Boolean value=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input")).isEnabled();
		System.out.println(value);

		//3. DeSelect only checked
		WebElement deselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		deselect.click();

		//4. Confirm Selenium is checked
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		Boolean value1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]")).isSelected();
		System.out.println(value1);

		//5. Select all below checkboxes
		WebElement Option1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		Option1.click();
		Thread.sleep(2000);
		WebElement Option2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		Option2.click();
		Thread.sleep(2000);
		WebElement Option3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		Option3.click();
		Thread.sleep(2000);
		WebElement Option4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		Option4.click();
		Thread.sleep(2000);
		WebElement Option5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		Option5.click();
		Thread.sleep(2000);
		WebElement Option6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		Option6.click();
		Thread.sleep(2000);

		driver.quit();

	}

}
