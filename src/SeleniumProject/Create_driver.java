package SeleniumProject;

//import java.util.Arrays;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_driver {
	public static void main(String[] args) throws Exception {	
		// Your ChromeDriver Path
		System.setProperty("webdriver.chrome.driver","hromedriver.exe");
		  
				// Create New Option
				ChromeOptions optionsC = new ChromeOptions();
				//optionsC.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "start-maximized","use-fake-ui-for-media-stream"));
				// Create New Driver
				WebDriver driver = new ChromeDriver(optionsC);
				driver.manage().window().maximize();
		        driver.get("https://www.google.com/");
		        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES); 
		        
	}
}
