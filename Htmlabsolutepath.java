package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlabsolutepath {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("file:///C:/Users/gkaly/OneDrive/Documents/learningHTML1%20-%20Copy.html");
		ch.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Jyoti");
		ch.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Jyoti Sajjan");
		ch.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("jyoti@123");
		ch.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("Jyoti");
		ch.findElement(By.xpath("((/html/body/form)[1]/input)[2]")).sendKeys("Sajjan");
		ch.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		ch.findElement(By.xpath("(/html/body/input)[5]")).click();
		ch.findElement(By.xpath("(/html/body/input)[6]")).click();
		

	}

}
