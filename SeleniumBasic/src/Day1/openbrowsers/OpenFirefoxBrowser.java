package Day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Accelaration\\Workspace\\SeleniumBasic\\Excutables\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("http://www.google.com");
	}

}
