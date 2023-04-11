package SKCET.day5_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {
	 public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver;
		   ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(co);
		   driver.get("https://www.abhibus.com/bus-ticket-booking");
		   WebElement from=driver.findElement(By.name("source"));
		   from.sendKeys("chennai",Keys.ENTER);
		   WebElement to=driver.findElement(By.name("destination"));
		   to.sendKeys("coimbatore",Keys.ENTER);
		   WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("arguments[0].setAttribute('value','01/10/2020')",date);
		   
	 }
}
