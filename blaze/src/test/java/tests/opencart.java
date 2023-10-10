package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
       String ExpectedTittle="Account Login";
		
		String ActualTittle=driver.getTitle();
		System.out.println("Actual Tittle value is===>"+ActualTittle);
		
		if(ExpectedTittle.equalsIgnoreCase(ActualTittle)) {
			System.out.println("Open cart is loaded sucessfully");
			
		}else {
			System.out.println("Open cart  page is not loaded successfully");
		}
		
		// Enter the email address
		driver.findElement(By.name("email")).sendKeys("Tester1@gmail.com");
		// Enter the password
		driver.findElement(By.name("password")).sendKeys("Welcome");
		// Click the login button
		//driver.findElement(By.className("btn btn-primary")).click();
		
		//driver.findElement(by.)
		
		driver.close();

	}

}
