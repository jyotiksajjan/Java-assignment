package seleniumpractice;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeandquitbrowser {
		ChromeDriver driver;
		public void launch()
		{
			driver=new ChromeDriver();
		}
		public void quit()
		{
			driver.quit();
		}
		
	}

