package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.borland.com/gmopost/online-catalog.htm");
		
		String val=driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[1]/td[1]")).getText();
		
		System.out.println("the value of the output is"+val);
		
		List<WebElement> rowlist=driver.findElements(By.xpath("html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[1]"));
		
		int rowcount=rowlist.size();
		
		System.out.println("the value of the rowcount is"+rowcount);
		
	    List<WebElement> collist=driver.findElements(By.xpath("html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[1]/td"));
		
		int colcount=collist.size();
		
		System.out.println("the value of the colcount is"+colcount);
		
		// How we will get the webtable values of the first column:
		
		String start="html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[";
		String end="]/td[1]";
		
		for(int i=2;i<=rowcount;i++) {
			
			String text=driver.findElement(By.xpath(start+i+end)).getText();
			System.out.println(text);
		}
		
		System.out.println("===================================");
		
		// How we will get the webtable values of the first row:
		
		String startr="html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[2]/td[";
		String endr="]";
		
		for(int j=1; j<=colcount; j++) {
			
			String text=driver.findElement(By.xpath(startr+j+endr)).getText();
			System.out.println(text);
			
		}
		
		System.out.println("==========Before priniting full web table=========================");
		
		
		// How we will get the full web table values
		
		String startf="html/body/form/table/tbody/tr[2]/td/div/center/table/tbody/tr[";
		String middlef="]/td[";
		String endf="]";
		
		for(int x=2; x<=rowcount; x++) {
			
			for(int y=1; y<=colcount; y++) {
				
				String text=driver.findElement(By.xpath(startf+x+middlef+y+endf)).getText();
				System.out.print(text+"||");
				
			}
			
			System.out.println();
			
		}
		
		
		

	}

}
