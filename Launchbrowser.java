package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();   //Launch the Browser
		
		driver.get("https://www.google.com/");    //Load the url
		
		driver.manage().window().maximize();   //Maximize the window
	driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver",Keys.ENTER);   //using findelement search the Selenium WebBrowser
		
		//driver.close();   //Close the Window*/

	}

}
