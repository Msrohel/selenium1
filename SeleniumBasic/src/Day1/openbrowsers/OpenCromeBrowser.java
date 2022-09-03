package Day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Accelaration\\Workspace\\SeleniumBasic\\Excutables\\chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("http://www.google.com");
	}

}
