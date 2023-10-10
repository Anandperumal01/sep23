package tests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("D:\\Sep23\\blaze\\src\\test\\resources\\properties\\Config.Properties");
		
		Properties p=new Properties();
		
		p.load(fr);
		
		
		
		FileReader or=new FileReader("D:\\Sep23\\blaze\\src\\test\\resources\\properties\\OR.Properties");
		
		Properties o=new Properties();
		
		o.load(or);
		System.out.println(p.getProperty("testurl"));
		
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("testurl")); // removed the hardcode value.. we externalize the value into the property files
		String ExpectedTittle="Welcome to Green Mountain Outpost";
		
		String ActualTittle=driver.getTitle();
		System.out.println("Actual Tittle value is===>"+ActualTittle);
		
		if(ExpectedTittle.equalsIgnoreCase(ActualTittle)) {
			System.out.println("GMO Home page is loaded sucessfully");
			
		}else {
			System.out.println("GMO Home page is not loaded successfully");
		}
		
       driver.findElement(By.name(o.getProperty("Home_page_btn_enter_emo_online"))).click();
       
       driver.findElement(By.name("QTY_TENTS")).clear();      
       driver.findElement(By.name("QTY_TENTS")).sendKeys("5");
       
       driver.findElement(By.name("QTY_GLASSES")).clear();
       driver.findElement(By.name("QTY_GLASSES")).sendKeys("7");
       
       
       driver.findElement(By.name("bSubmit")).click();
       
       driver.findElement(By.name("bSubmit")).click();
       
       driver.findElement(By.name("shipSameAsBill")).click();
       
      
       
       

	}

}
