package Engage_BB_Env.Engage_BB_Env;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Service_Request_Intake {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\browser driver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		wd.get("https://myburbank-uat.3didemo.com/FrontPortal/Page/RenderPage?tabId=1");
		wd.findElement(By.xpath("//a[contains(text(),'Create Service Request')]")).click();
		WebElement po = wd.findElement(By.xpath("//div[@id='frontPortalBody']/section/div/div/div/div/div/div/div/div/div/span/span/span"));
		boolean selectstate = po.isSelected();
		//po.click();
		if(selectstate == false)
		{
			po.click();
		}
		JavascriptExecutor js = (JavascriptExecutor)wd;
		WebElement select_sr=wd.findElement(By.xpath("//div[3]/ul/li[3]/div/div"));
		js.executeScript("arguments[0].click();", select_sr);
		System.out.println("Service Request Type selected");
		//wd.findElement(By.xpath("//div/div/div/div/input")).click();
		//wd.findElement(By.xpath("//input[@id='Controls_0__ChildControls_0__0__Value']")).sendKeys("234");
		
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js1 = (JavascriptExecutor)wd;
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		Actions action = new Actions(wd);
		WebElement address = wd.findElement(By.xpath("//input[@name = 'Controls[0].ChildControls[0][0].Value']"));
		//address.click();
		action.moveToElement(address).build().perform();
		address.click();
		System.out.println("Enter Address");
		address.sendKeys("125 East Palm Avenue, Burbank, CA 91502, US");
		action.moveToElement(address).build().perform();
		address.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		address.sendKeys(Keys.ARROW_DOWN);
		address.sendKeys(Keys.TAB);
		address.click();
		System.out.println("select address");
		wd.findElement(By.xpath("//button[@id='verifySRLocation']")).click();
		System.out.println("Verify location");
		try
		{
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			JavascriptExecutor js11 = (JavascriptExecutor)wd;
			js11.executeScript("window.scrollBy, (600,1000)");
			Thread.sleep(3000);
		Actions action1 = new Actions(wd);
		//action1.moveToElement(continue_current_request).build().perform();
		WebElement continue_current_request = wd.findElement(By.xpath("//button[@id='btnContinueServiceRequest']"));
		
		action1.moveToElement(continue_current_request).build().perform();
		continue_current_request.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//continue_current_request.sendKeys(Keys.ENTER);
		continue_current_request.sendKeys(Keys.TAB);
		continue_current_request.click();
		System.out.println("Click on Continue button");
		}
		catch(Exception e)
		{
			System.out.println("Continue the serviec request");
		}
		
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		wd.findElement(By.name("Controls[2].Value")).click();
		wd.findElement(By.xpath("//option[@value='Sidewalk']")).click();
		System.out.println("select Problem Location");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js11 = (JavascriptExecutor)wd;
		js11.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//textarea[@id='Controls_3__CaseComment_Comment']")).sendKeys("Test");
		System.out.println("Enter comment");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js111 = (JavascriptExecutor)wd;
		js111.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@id='btnSave']")).click();
	}

}
