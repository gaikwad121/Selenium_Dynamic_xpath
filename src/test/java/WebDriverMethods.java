import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

WebDriver driver;

@Test
void Methods() {
WebDriverManager.chromiumdriver().setup();
 driver=new ChromeDriver();
//driver.get("https://www.demo.guru99.com/");
 driver.get("https://demo.guru99.com/test/login.html");
driver.manage().window().maximize();
//driver.findElement(By.name("emailid")).sendKeys("jg.jyotigaikwad121@gmail.com");
//driver.findElement(By.cssSelector("*[name=\"btnLogin\"]")).click();
//with valid UserID and Valid Password
driver.findElement(By.cssSelector("#email")).sendKeys("jg.jyotigaikwad121@gmail.com");
driver.findElement(By.cssSelector("#passwd")).sendKeys("Jyoti@123");
driver.findElement(By.id("SubmitLogin")).click();
//String page=driver.getTitle();
//System.out.println(page);
// Verify Title of the page
String ActualTitle="Successfully Logged in...";
String ExpectedTitle=driver.getTitle();
if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
	System.out.println("Title of the home page is verified");
}
else {
	System.out.println("Title of the home page is not correct");
}
}
@Test
void day3() {
	WebDriverManager.chromiumdriver().setup();
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/login.html");
driver.findElement(By.cssSelector("#email")).sendKeys("jg.jyo121@gmail.com");
driver.findElement(By.cssSelector("#passwd")).sendKeys("Jyoti@123");
driver.findElement(By.id("SubmitLogin")).click();	
}
}
