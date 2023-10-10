package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=61666692631&hvpone=&hvptwo=&hvadid=610714031665&hvpos=&hvnetw=g&hvrand=15747892241034448842&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300138&hvtargid=kwd-304880464215&hydadcr=14450_2316420");
		
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());
		
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}

	}

}
