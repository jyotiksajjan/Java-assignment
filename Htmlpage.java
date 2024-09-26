package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Htmlpage {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.get("file:///C:/Users/gkaly/OneDrive/Documents/learningHTML1%20-%20Copy.html");
		ch.findElement(By.id("1")).sendKeys("Jyoti");
		ch.findElement(By.name("say hello")).sendKeys("jyoti sajjan");
		ch.findElement(By.name("password")).sendKeys("Jyoti@123");
		ch.findElement(By.name("fname")).sendKeys("Jyoti");
		//ch.findElement(By.xpath("//input[@name='lname']")).sendKeys("Sajjan");
		//ch.findElement(By.xpath("//input[@value='Submit']")).click();
		ch.findElement(By.xpath("(//input[@id='121'])[2]")).click();
		//ch.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
        ch.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		WebElement relegion=ch.findElement(By.id("Relegion"));
		Select ss=new Select(relegion);
		ss.selectByVisibleText("Hindu");
		ch.findElement(By.xpath("(//input[@value='Sign up'])")).click();

	}

}
