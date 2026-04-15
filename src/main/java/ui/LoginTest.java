package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.id("login-button")).click();
		
String url = driver.getCurrentUrl();

if (url.contains("inventory")) {
	System.out.println("Log-In Successfully");
}
else{
	System.out.println("Log-In Failed");
	
	
	 String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
	    System.out.println("Error Message: " + errorMessage);
}
	}

}
