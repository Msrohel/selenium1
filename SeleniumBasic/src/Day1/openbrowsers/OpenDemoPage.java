package Day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDemoPage {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "actiTIME";
		
		System.out.println("Actual Title of Page: "+ActualTitle);
		System.out.println("Expected Title of Page: "+ExpectedTitle);
		System.out.println("Validation Of Title: "+ActualTitle.equals(ExpectedTitle));
		System.out.println("Length of the Title: "+ActualTitle.length());
		
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "demo.actitime.com";
		
		System.out.println("Actual Url: "+ActualUrl);
		System.out.println("Expected Url: "+ExpectedUrl);
		System.out.println("Validatin Of Url: "+ActualUrl.contains(ExpectedUrl));
		System.out.println("Length of Url: "+ActualUrl.length());
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		System.out.println("Length of Page Source: "+PageSource.length());
		
		
		
		//driver.close();
	}

}
