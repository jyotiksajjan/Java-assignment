package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchamazonwithTagnamelocator {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	/* driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.tagName("textarea"));
		search.sendKeys("india");
		search.sendKeys(Keys.ENTER);*/
		driver.get("https://amazon.in");
	WebElement search=driver.findElement(By.tagName("input"));
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
		
		}

}
