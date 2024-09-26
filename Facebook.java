package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		Set<String> parentandchildid=driver.getWindowHandles();
		System.out.println(parentandchildid);
		Iterator<String>it1=parentandchildid.iterator();
		String parentid=it1.next();
		String childid=it1.next();
		driver.switchTo().window(childid);
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jyoti");
		 driver.findElement(By.name("lastname")).sendKeys("Sajjan");
		 driver.findElement(By.id("u_b_d_ZI")).sendKeys("jk@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("jk@123");
		WebElement date= driver.findElement(By.name("birthday_day"));
		Select select=new Select(date);
		select.selectByValue("1");
		WebElement Month=driver.findElement(By.id("month"));
		Select ss=new Select(Month);
		ss.selectByIndex(4);
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ss1=new Select(year);
		ss1.selectByVisibleText("1995");
		driver.findElement(By.linkText("Female")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		 /*              driver.findElement(By.id("email")).sendKeys("6363146971");
		                                                                         driver.findElement(By.id("pass")).sendKeys("Kalyan@143");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Create new account")).click();*/

	}

}
