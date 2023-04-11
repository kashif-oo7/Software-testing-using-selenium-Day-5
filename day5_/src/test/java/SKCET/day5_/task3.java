package SKCET.day5_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	 public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver;
		   ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(co);
		   driver.get("https://demo.guru99.com/test/delete_customer.php");
		   WebElement custid=driver.findElement(By.name("cusid"));
		   custid.sendKeys("401");
		   WebElement submit=driver.findElement(By.name("submit"));
		   submit.click();
		   Thread.sleep(3000);
		   
		   driver.switchTo().alert().dismiss();
		   custid.clear();
		   custid.sendKeys("402");
		   submit.click();
		   Alert alertm=driver.switchTo().alert();
		   alertm.accept();
		  String str=alertm.getText();
		  System.out.print(str);
		   
		   
	 }
}
