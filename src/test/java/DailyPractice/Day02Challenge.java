package DailyPractice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Day02Challenge {
  
  
	      public static List<String> getCarouselItems(WebDriver driver, String sectionName) {
	          List<String> itemTexts = new ArrayList<>();
	          Set<String> uniqueItems = new HashSet<>();

	          try {
	              // Find the section using the title
	              String sectionXpath = String.format("//h3[contains(text(),'%s')]/ancestor::section", sectionName);
	              WebElement section = driver.findElement(By.xpath(sectionXpath));

	              // Scroll to the section
	              ((ChromeDriver) driver).executeScript("arguments[0].scrollIntoView(true);", section);
	              Thread.sleep(2000);

	              boolean hasNext = true;

	              while (hasNext) {
	                  // Wait and fetch visible product names
	                  List<WebElement> items = section.findElements(By.xpath("//li[@class=\"MainCategories_categoryItem__wQPwu HeaderDesktop_scrimHandlerClass___eXRe\"]"));
	                  for (WebElement item : items) {
	                      String name = item.getText().trim();
	                      if (!name.isEmpty()) {
	                          uniqueItems.add(name);
	                      }
	                  }

	                  // Try clicking the next button
	                  try {
	                      WebElement nextButton = section.findElement(By.xpath("//*[@class=\"Icon_icon__5gfCh Icon_flipped__v2P33\"]"));
	                      if (nextButton.isDisplayed() && nextButton.isEnabled()) {
	                          nextButton.click();
	                          Thread.sleep(1500); // wait for carousel to update
	                      } else {
	                          hasNext = false;
	                      }
	                  } catch (Exception e) {
	                      hasNext = false; // Next button not found or no longer visible
	                  }
	              }

	          } catch (Exception e) {
	              System.out.println("Error: " + e.getMessage());
	          }

	          itemTexts.addAll(uniqueItems);
	          Collections.sort(itemTexts);
	          return itemTexts;
	      }
           @Test

	      public static void main() {
 WebDriverManager.chromedriver().setup();
	          ChromeOptions options = new ChromeOptions();
	          options.addArguments("--start-maximized");
	          WebDriver driver = new ChromeDriver(options);

	          try {
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	              driver.get("https://www.noon.com/uae-en/");

	              List<String> items = getCarouselItems(driver, "Recommended for you");
	              System.out.println("Carousel Items:");
	              for (String item : items) {
	                  System.out.println(item);
	              }

	          } finally {
	             // driver.quit();
	          }
	      }
	  }

  
