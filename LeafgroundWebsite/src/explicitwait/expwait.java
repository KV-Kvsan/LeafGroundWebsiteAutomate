package explicitwait;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://www.leafground.com/pages/TextChange.html");
		WebDriverWait wait = new WebDriverWait(driver,4);
		Thread.sleep(2000);
		driver.close();
	}

}
