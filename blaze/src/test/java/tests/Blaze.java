package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/login");
		String ExpectedTittle="BlazeDemo";
		
		String ActualTittle=driver.getTitle();
		System.out.println("Actual Tittle value is===>"+ActualTittle);
		
		if(ExpectedTittle.equalsIgnoreCase(ActualTittle)) {
			System.out.println("blaze demo page is loaded sucessfully");
			
		}else {
			System.out.println("blaze demo page is not loaded successfully");
		}
		
		// Enter the email address
		driver.findElement(By.name("email")).sendKeys("Tester1@gmail.com");
		// Enter the password
		driver.findElement(By.name("password")).sendKeys("Welcome");
		// Click the login button
		driver.findElement(By.className("btn btn-primary")).click();
		

	}

}
