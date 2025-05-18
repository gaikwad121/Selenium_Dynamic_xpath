import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Script {
	 String data1="//*[@class=\"dataTable\"]//tbody//tr[1]//td";
	  String sign_Up="//div[@id='reg_form_box']/child::div[11]/button";
	  String URL="https://money.rediff.com/gainers/bse/daily/groupa";
	  String URL2="https://www.facebook.com/r.php?entry_point=login";
	  String First_Name="//button[@id='u_0_n_Vp']/parent::*/parent::*/child::div[1]/div/div[1]";
	  String Pass="//input[@name=\"reg_email__\"]/following::div[9]";
	  String Mob_No="//input[@data-type=\"password\"]/preceding::input[2]";
	  String Sir_Name="//input[@class=\"_8esa\" and @value=\"1\"]/ancestor::div[2]/div[1]/div/div[2]";
	  String google_Search="//div[@class=\\\"FPdoLc lJ9FBc\\\"]//input[@name=\\\"btnK\\\"]/parent::*/parent::*/parent::*/div/div[1]/div[2]";
	 String Todays_Link="//*[@class='nav-fill']//*[@data-csa-c-slot-id='nav_cs_0']";
	 String Hello_Sign_In="//*[@id=\"twotabsearchtextbox\"]/following::*//span[text()='Hello, sign in']";
	 String URL3="https://www.amazon.com/";
	 String Registry="//div[@class=\"nav-div\"]/descendant::a[text()='Registry']";
	 String Iphone16="//span[.='Apple iPhone 13, 128GB, (PRODUCT)RED - Unlocked (Renewed)']";
	 String Iphone16_2="//span[.='Apple iPhone 13, 128GB, (PRODUCT)RED - Unlocked (Renewed)']/parent::*/parent::*/parent::*/following-sibling::div[@class=\"puisg-row\"]/div[1]/descendant::span[2]";
    String Samnsang="//span[.='Galaxy S24 Ultra Cell Phone, 256GB AI Smartphone, Unlocked Android, 200MP, 100x Zoom Cameras, Fast Processor, Long Battery Life, Edge-to-Edge Display, S Pen, US Version, 2024, Titanium Gray']/parent::h2/parent::a/parent::div/following-sibling::div/descendant::span[@class=\"a-price-whole\"]";
	 String Iphone13="//*[.='Apple iPhone 13, 128GB, (PRODUCT)RED - Unlocked (Renewed)']/parent::h2/parent::a/parent::div/following-sibling::div/descendant::span[6]";
	String Flipcart="https://www.flipkart.com/";
	String App_Iphone_14="//div[.='Apple iPhone 14 (Midnight, 512 GB)']/parent::div/parent::div/descendant::div[@class=\"Nx9bqj _4b5DiR\"]";
	String App_iphone_14_Pro="//div[.='Apple iPhone 14 Pro (Deep Purple, 1 TB)']/parent::div/parent::div/descendant::div[@class=\"Nx9bqj _4b5DiR\"]";
	WebDriver driver;
  @Test
  public void f() {
	 
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	  List<WebElement> el=driver.findElements(By.xpath(data1));
	  for(WebElement e:el) {
		  System.out.print(e.getText());
	  }
	  System.out.println();

  List<WebElement> li=driver.findElements(By.xpath("//th[@class='firstcol']/following::th"));
  for(WebElement list:li) {
	  System.out.println(list.getText());
  }
  // SelfNode
  WebElement selfText=driver.findElement(By.xpath("//a[contains(.,'Titagarh Rail ')]/self::a"));
  System.out.println(selfText.getText());
  //ParentNode
  WebElement parentNode=driver.findElement(By.xpath("//a[contains(.,'Medplus Health Serv')]/parent::td"));
  System.out.println(parentNode.getText());
  }
  @Test
  void Test2() {

  //1) Find the sign-up button from the registration from in the FaceBook application
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(URL2);
	  driver.manage().window().maximize();
  WebElement sign_up=driver.findElement(By.xpath(sign_Up));
  System.out.println(sign_up.getText());
 sign_up.click();

  }
@Test
void Test3() {
	//2) Locate FirstName field from, signUp buton in facebook
	 WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(URL2);
	  driver.manage().window().maximize();
	  WebElement txt3=driver.findElement(By.xpath(First_Name));
	  System.out.println(txt3.getText());
}
@Test
void Test4() {
	//3) Identify the password from Mobile number field in Facebook
	WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(URL2);
	  driver.manage().window().maximize();
	 WebElement txt4=driver.findElement(By.xpath(Pass));
	//s  WebElement txt4=driver.findElement(By.xpath("//input[@name='reg_email__']/following::input[2]"));
	  System.out.println(txt4.getText());
}
@Test
void Test5() {
	//4) Locate the mobile number from password field
	 WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(URL2);
	  driver.manage().window().maximize();
	  WebElement txt5=driver.findElement(By.xpath(Mob_No));
	  System.out.println(txt5.getText());
}
@Test
void Test6() {
	//5) Locate sirName from female radio button in facebook
	WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get(URL2);
	  driver.manage().window().maximize();
	  WebElement txt6=driver.findElement(By.xpath(Sir_Name));
	  System.out.println(txt6.getText());
}
@Test

void Test7() {
//	6) Identify the search text box from the Google search button present in the Google search home page
	WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement txt6=driver.findElement(By.xpath(google_Search));
	System.out.println(txt6.getText());
	  // txt6.click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	  js.executeScript(
			    "arguments[0].value = 'Hello, World!';" +
			    "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
			    txt6);

}
@Test
void Test8() throws InterruptedException {
	// 7) Identify the Today's Deal link from the amazon search text box present int the amazon home page
	WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();

	  driver.get(URL3);
	  driver.manage().window().maximize();
	  WebElement txt8=driver.findElement(By.xpath(Todays_Link));
	System.out.println(txt8.getText());
	txt8.click();
}
@Test
void Test9() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();
	  Thread.sleep(2000);

	  driver.get(URL3);
	  driver.manage().window().maximize();
	  WebElement txt8=driver.findElement(By.xpath(Hello_Sign_In));
	System.out.println(txt8.getText());
	txt8.click();
}
@Test
void Test10() {
	WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();

	  driver.get(URL3);
	  driver.manage().window().maximize();
	  WebElement txt8=driver.findElement(By.xpath(Registry));
	System.out.println(txt8.getText());
	txt8.click();	
}
@Test
void Test11() {
	WebDriverManager.edgedriver().setup();
	  driver= new EdgeDriver();

	  driver.get("https://www.flipkart.com/search?q=iphone+14&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_5_5_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_5_5_na_na_na&as-pos=5&as-type=RECENT&suggestionId=iphone+14&requestId=483205ee-1d05-4476-bc8a-6a0c1a5e6ee7&as-searchtext=iphone%2014");
	  driver.manage().window().maximize();
	//  driver.findElement(By.xpath("")).sendKeys("I");
	 // WebElement txt8=driver.findElement(By.xpath("//div[.='Apple iPhone 14 (Starlight, 128 GB)']/parent::div/parent::div/descendant::div[@class=\"Nx9bqj _4b5DiR\"]"));
	//System.out.println(txt8.getText());
	//WebElement txt10=driver.findElement(By.xpath(App_Iphone_14));
	//System.out.println(txt10.getText());
	  WebElement txt11=driver.findElement(By.xpath(App_iphone_14_Pro));
	  System.out.println(txt11.getText());
}
}












