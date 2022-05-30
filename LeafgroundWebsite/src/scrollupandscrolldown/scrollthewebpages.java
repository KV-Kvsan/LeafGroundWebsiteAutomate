package scrollupandscrolldown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollthewebpages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Chromedriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(3000);
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,450)", "");
		Thread.sleep(2000);
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-450)", "");
		Thread.sleep(5000);
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		executor.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		driver.close();

	}

}
