package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  String Xpath="//div[@class=\"font-bold text-4xl md:text-6xl text-center text-zinc-500\" or @rel=\"current_populatio\"]";
	  String Birth="//span[@class=\"rts-counter text-2xl font-bold\" or @rel=\"births_today\"]";
	  String Absolute="//span[@class=\"rts-counter text-2xl font-bold\" and @rel=\"absolute_growth\"]";
	  driver.get("https://www.worldometers.info/world-population/");
	  driver.manage().window().maximize();
	  int count=1;
	 // while(true) {
	//  List<WebElement> e=driver.findElements(By.xpath("//*[@class=\"font-bold text-4xl md:text-6xl text-center text-zinc-500\"]/span/span"));
	//  List<WebElement> e=driver.findElements(By.xpath("//span[@rel=\"current_population\"]/span"));
		 // List<WebElement> e=driver.findElements(By.xpath("//div[@class=\"font-bold text-4xl md:text-6xl text-center text-zinc-500\" or @rel=\"current_populatio\"]"));
	  while(count<=21) {
		  System.out.println(count+"sec");
	  if(count==21) 
		  break;
	  }
	  
	  List<WebElement> e=driver.findElements(By.xpath(Xpath));
	 
	  for(WebElement el:e) {
		  System.out.println(Xpath);
	  }
	  System.out.println();
	  
/*  List<WebElement> el1=driver.findElements(By.xpath(Birth));
  for(WebElement el2:el1)
	  System.out.println(el2.getText());
  
  //List<WebElement> el3=driver.findElements(By.xpath(Absolute));*/
}}