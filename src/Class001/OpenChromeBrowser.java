package Class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// go ahead and open chrome browser
		
		//Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		//System.out.println(driver.getCurrentUrl());
		
		String actualurl=driver.getCurrentUrl();
		
		String expecteUrl="https://www.facebook.com/";
		
		if(actualurl.equalsIgnoreCase(expecteUrl)) {
			String title=driver.getTitle();
		    System.out.println(title);
		}else {
			System.out.println("Wrong Url is returned");
		}
		
		
		
		//driver.close();

	}

}
