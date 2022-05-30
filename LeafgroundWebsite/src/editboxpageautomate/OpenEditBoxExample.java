package editboxpageautomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEditBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/Edit.html");
		Thread.sleep(2000);

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

		//print an Get default text entered Label
		WebElement def=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/label"));
		String deftext=def.getText();
		System.out.println(deftext);

		//Print an default text entered
		WebElement Default=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String Text=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).getAttribute("value");
		System.out.println(Text);
		Thread.sleep(2000);

		//Print the clear Text
		WebElement Clear=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		Clear.clear();
		Thread.sleep(1000);

		//Confirm that edit field is disabled Label
		WebElement confirm=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/label"));
		String editfield=confirm.getText();
		System.out.println(editfield);

		//Confirm that edit field is disabled
		WebElement disabled=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean value=disabled.isEnabled();
		System.out.println(value);
		driver.close();
	}
}