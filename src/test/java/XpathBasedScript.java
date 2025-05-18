import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathBasedScript {
WebDriver driver;
	@Test
	void test() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://money.rediff.com/gainers/bse/daily/group");
	 driver.manage().window().maximize();
List<WebElement> textEle=	 driver.findElements(By.xpath("//*[contains(@class,\"dataTable\")]//tr//th"));
for(WebElement li:textEle) {
	 System.out.println(li.getText());
	 WebElement text2=driver.findElement(By.xpath("//a[contains(.,'Ksolves India')]/self::a"));
	 System.out.println(text2.getText());
}	
	}
	@Test
	void Test2() {
		 driver=new ChromeDriver();
		 driver.get("https://money.rediff.com/gainers/bse/daily/group");
		 driver.manage().window().maximize();
	String t=driver.findElement(By.xpath("//a[contains(.,'Integrated Therm')]/ancestor::tr")).getText();
	System.out.println(t);
	}
	@AfterTest 
	void TearDown() {
		driver.quit();
	}
}
