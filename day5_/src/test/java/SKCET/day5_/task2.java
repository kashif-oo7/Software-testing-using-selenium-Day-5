package SKCET.day5_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	 public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver;
		   ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(co);
		   driver.get("https://jqueryui.com/droppable/");
		   driver.switchTo().frame(0);
		   WebElement source=driver.findElement(By.id("draggable"));
		   WebElement destination=driver.findElement(By.id("droppable"));
		   Actions action=new Actions(driver);
		   action.dragAndDrop(source,destination).build().perform();
	 }
}