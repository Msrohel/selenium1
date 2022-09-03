package Day1.openbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ResistrationPage {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement inputFied = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input"));
		inputFied.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		inputFied.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		inputFied.sendKeys(Keys.TAB, Keys.chord(Keys.CONTROL,"v"));
		
		WebElement skilldropdown = driver.findElement(By.id("Skills"));
		Select selectoption = new Select(skilldropdown);
		System.out.println("Is the Drop Down MultiSelect: "+selectoption.isMultiple());
		WebElement selectSkill = selectoption.getFirstSelectedOption();
		
		String optionname = selectSkill.getText();
		System.out.println("Already Selected option Name: "+optionname);
		
		List<WebElement> optionlist = selectoption.getOptions();
		System.out.println("Option count is: "+optionlist.size());
		for(int i=0; i<optionlist.size(); i++) {
		System.out.println("Options "+i+" :" +optionlist.get(i).getText());
			
			}
		
		
	}

}
