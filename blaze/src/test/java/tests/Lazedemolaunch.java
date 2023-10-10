package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lazedemolaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String actualTittle=driver.getTitle();
		String ExpectedTittle="Google1";
		
		System.out.println("Actual tittle===>"+actualTittle);
		if(ExpectedTittle.equals(actualTittle)) {
			System.out.println("Google page loaded successfully");
		}else {
			System.out.println("Google page not loaded success fully");
		}
		driver.close();
		

	}

}
