package Class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) {
		
		
		//Making connection to the driver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //opening the browser by calling the constructor of ChromeDriver class and upcasting.
		WebDriver driver=new ChromeDriver();
        
		driver.get("https://www.google.com");
					
		String url=driver.getCurrentUrl();
		System.out.println(url);
          
        System.out.println( driver.getTitle());
        
	}

}
