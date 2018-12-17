package SeleniumProject;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@SuppressWarnings("unused")

public class NewTest {
	@Test
public void Test1()  throws Exception{
		// Your Chrome Driver Path
  		System.setProperty("webdriver.chrome.driver","C:\\Users\\Leyla GELEN\\Desktop\\chromedriver_win32\\chromedriver.exe"); 
		// Create new option
  		ChromeOptions optionsA = new ChromeOptions();
		// Microphone and Camera access
  		optionsA.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "start-maximized","use-fake-ui-for-media-stream"));
		// Create New Chrome Driver 
  		WebDriver driver = new ChromeDriver(optionsA);

  		driver.manage().window().maximize();
  		driver.get("https://www.google.com.tr/");
  		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
  
}
	@Test
public void Test2()  throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Leyla GELEN\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions optionsB = new ChromeOptions();
		  optionsB.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "start-maximized","use-fake-ui-for-media-stream"));
		  WebDriver driver1 = new ChromeDriver(optionsB);

		  driver1.manage().window().maximize();
		  driver1.get("https://www.facebook.com/");
		  //driver1.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		  
}
	@Test
public void Test3()  throws Exception{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Leyla GELEN\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions optionsC = new ChromeOptions();
		  optionsC.addArguments(Arrays.asList("disable-infobars", "ignore-certificate-errors", "start-maximized","use-fake-ui-for-media-stream"));
		  WebDriver driver2 = new ChromeDriver(optionsC);

		  driver2.manage().window().maximize();
		  driver2.get("https://www.twitter.com/");
		  //driver2.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		  
}
}
