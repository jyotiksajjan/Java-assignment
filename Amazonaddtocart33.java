package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonaddtocart33 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("shoes"+ Keys.ENTER);
	driver.findElement(By.xpath("(//span[.='EVA Lite Sport Shoes Running Shoe for Men- Blue'])[1]")).click();
	Set<String> parentandchildid=driver.getWindowHandles();
	Iterator <String> it=parentandchildid.iterator();
	String parentid=it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();


	}

}
