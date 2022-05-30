package radiobuttonsautomate;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Dimension dim = new Dimension(800,600);
		//Resize current window to the set dimension
		driver.manage().window().setSize(dim);
		driver.get("http://leafground.com/");
		Thread.sleep(2000);
		driver.get("http://www.leafground.com/pages/radio.html");
		Thread.sleep(2000);

		//1. Are you enjoying the classes
		driver.findElementByXPath("//*[@id=\"yes\"]").click();
		Thread.sleep(2000);

		//2. Find default selected radio button
		WebElement deft=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]");
		Boolean def=deft.isEnabled();
		System.out.println("Yeah it is "+def);
		Thread.sleep(2000);
		
		//2.1. Find unselected radio button
		WebElement uns=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]");
		Boolean unselected=uns.isSelected();
		System.out.println("Yeah it is "+unselected);
		Thread.sleep(2000);
		
		//3. Select your age group (Only if choice wasn't selected)
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]").click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
