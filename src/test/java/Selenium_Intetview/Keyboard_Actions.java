package Selenium_Intetview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
        WebElement inputField = driver.findElement(By.xpath("//div[@class='_2SmNnR']//input")); 
        inputField.click();
        
        Actions actions = new Actions(driver);
        actions.sendKeys("Iphone").perform();
        actions.sendKeys(Keys.ENTER).perform(); 
        

	}

}
