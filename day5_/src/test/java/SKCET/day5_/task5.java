package SKCET.day5_;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {
	 public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver;
		   ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(co);
		   
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.name("q")).sendKeys("Apple",Keys.ENTER);
		   System.out.println(driver.getWindowHandle());
		   System.out.println(driver.getTitle());
		   
		   driver.switchTo().newWindow(WindowType.TAB);
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
		   System.out.println(driver.getWindowHandle());
		   System.out.println(driver.getTitle());
		    
		   driver.switchTo().newWindow(WindowType.TAB);
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
		   driver.findElement(By.name("q")).sendKeys("Cucumber",Keys.ENTER);
		   System.out.println(driver.getWindowHandle());
		   System.out.println(driver.getTitle());
		   Set<String> s=driver.getWindowHandles();
		   System.out.println("Number of windows opened:"+s.size());
	 }
}
