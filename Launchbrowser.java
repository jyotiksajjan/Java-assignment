package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		ChromeDriver ch=new ChromeDriver();
		ch.manage().window().maximize();
		ch.get("https://www.amazon.in");
		String titleofpage=ch.getTitle();
		System.out.println(titleofpage);
		String parentid=ch.getWindowHandle();
		System.out.println(parentid);
		Set<String> parentandchidid=ch.getWindowHandles();
		System.out.println(parentandchidid);
		
		

	}

}
