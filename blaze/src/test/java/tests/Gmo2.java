package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.borland.com/gmopost/");
		String ExpectedTittle="Welcome to Green Mountain Outpost";
		
		String ActualTittle=driver.getTitle();
		System.out.println("Actual Tittle value is===>"+ActualTittle);
		
		if(ExpectedTittle.equalsIgnoreCase(ActualTittle)) {
			System.out.println("GMO Home page is loaded sucessfully");
			
		}else {
			System.out.println("GMO Home page is not loaded successfully");
		}
		
		WebElement btnEnterGMOOnline=driver.findElement(By.name("bSubmit"));
		btnEnterGMOOnline.click();
		
      // driver.findElement(By.name("bSubmit")).click();
		
		WebElement txtQtyTents=driver.findElement(By.name("QTY_TENTS"));
		txtQtyTents.clear();
		txtQtyTents.sendKeys("5");
      //driver.findElement(By.name("QTY_TENTS")).clear();      
      // driver.findElement(By.name("QTY_TENTS")).sendKeys("5");
		
		WebElement txtQtyGlasses=driver.findElement(By.name("QTY_GLASSES"));
		txtQtyGlasses.clear();
		txtQtyGlasses.sendKeys("7");
       
     //  driver.findElement(By.name("QTY_GLASSES")).clear();
     //  driver.findElement(By.name("QTY_GLASSES")).sendKeys("7");
       
		WebElement btnPlaceAnOrder=driver.findElement(By.name("bSubmit"));
		btnPlaceAnOrder.click();
      // driver.findElement(By.name("bSubmit")).click();
		
       
	       
		WebElement btnProceedwithOrder=driver.findElement(By.name("bSubmit"));
		btnProceedwithOrder.click();
     //  driver.findElement(By.name("bSubmit")).click();
		
		
	      
		WebElement chkshipSameAsBill=driver.findElement(By.name("shipSameAsBill"));
		chkshipSameAsBill.click();
       
    //   driver.findElement(By.name("shipSameAsBill")).click();
       
      
	//	WebElement chkshipSameAsBill=driver.findElement(By.);
       

	}

}
