import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

class WebLocatorTest {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\Desktop\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		Dimension dimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);
		
		driver.get("http://localhost/research-form/form1.html");
		System.out.println(browser+" is running");
		System.out.println("" + driver.getTitle());
		
		Thread.sleep(4000);
		driver.close();
		System.out.println("Finish !!!");
		
	}

}
