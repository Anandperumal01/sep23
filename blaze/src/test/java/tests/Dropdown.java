package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();      
		driver.get("https://demo.borland.com/gmopost/");
		String ExpectedTittle = "Welcome to Green Mountain Outpost";

		String ActualTittle = driver.getTitle();
		System.out.println("Actual Tittle value is===>" + ActualTittle);

		if (ExpectedTittle.equalsIgnoreCase(ActualTittle)) {
			System.out.println("GMO Home page is loaded sucessfully");

		} else {
			System.out.println("GMO Home page is not loaded successfully");
		}

		WebElement btnEnterGMOOnline = driver.findElement(By.name("bSubmit"));
		btnEnterGMOOnline.click();

		WebElement txtQtyTents = driver.findElement(By.name("QTY_TENTS"));
		txtQtyTents.clear();
		txtQtyTents.sendKeys("5");

		WebElement txtQtyGlasses = driver.findElement(By.name("QTY_GLASSES"));
		txtQtyGlasses.clear();
		txtQtyGlasses.sendKeys("7");

		WebElement btnPlaceAnOrder = driver.findElement(By.name("bSubmit"));
		btnPlaceAnOrder.click();

		WebElement btnProceedwithOrder = driver.findElement(By.name("bSubmit"));
		btnProceedwithOrder.click();

		WebElement chkshipSameAsBill = driver.findElement(By.name("shipSameAsBill"));
		chkshipSameAsBill.click();
		
		// Drop down
		// Approach 1--> Sendkeys
		WebElement dpCreditcard=driver.findElement(By.name("CardType"));
		//dpCreditcard.sendKeys("Visa");
		
		// Approach 2---> Select---> by index
		Select dpcc=new Select(dpCreditcard);
	//	dpcc.selectByIndex(1);
		
		// Approach 3---> Select---> by value----0
		//dpcc.selectByValue("AMEX");
		
		// Approach 4---> select ---> by visible text---1
		dpcc.selectByVisibleText(" MasterCard ");
		
		
		

	}

}
