package Engage_BB_Env.Engage_BB_Env;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Service_Request_Detail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\browser driver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		//wd.get("https://myburbank-uat.3didemo.com/FrontPortal/Page/RenderPage?tabId=8&searchParameter=caseId=213");
		wd.get("https://myburbank-uat.3didemo.com/FrontPortal/Page/RenderPage?tabId=7");
		wd.findElement(By.cssSelector(".Login-Registe:nth-child(2) > .nav-link")).click();
		wd.findElement(By.xpath("//form[@id='formLogin']/div/div/input")).sendKeys("pw.manager@3diemail.com");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Burbank@1234");
		wd.findElement(By.cssSelector("#btnLogin")).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js1 = (JavascriptExecutor)wd;
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		Actions action = new Actions(wd);
		WebElement search = wd.findElement(By.xpath("//input[@id='CustomSearch']"));
		search.click();
		action.moveToElement(search).build().perform();
		search.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		search.sendKeys("PR-210715-00340");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		
		WebElement link = wd.findElement(By.xpath("//ul[@id='CustomSearch_listbox']/li/a/div"));
		action.moveToElement(link).build().perform();
		link.click();
		
		System.out.println("Match record found selected");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//JavascriptExecutor js1 = (JavascriptExecutor)wd;
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement grid = wd.findElement(By.xpath("//a[@id='grid-tab']/i"));
		grid.click();
		action.moveToElement(grid).build().perform();
		grid.click();
		System.out.println("Grid is selected");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement view = wd.findElement(By.xpath("//button[@onclick=\"location.href='/FrontPortal/Page/RenderPage?tabId=8&searchParameter=caseId=552'\"]"));
		view.click();
		
		System.out.println("Click on View button");
		System.out.println("Redirect on Case Detail page.");
		//wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement subscribe = wd.findElement(By.xpath("//button[@id='btnSubscribe']"));
		action.moveToElement(subscribe).build().perform();
		subscribe.click();
		System.out.println("click on subscribe");
		}
		catch(Exception e)
		{
			WebElement unsubscribe = wd.findElement(By.xpath("//button[@id='btnUnsubscribe']/i"));
			unsubscribe.click();
		System.out.println("Click on Unsubscribe");	
		}
		try
		{
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement fav = wd.findElement(By.xpath("//button[@id='btnFavourite']"));
		action.moveToElement(fav).build().perform();
		fav.click();
		}
		catch(Exception e) {
			
			WebElement unfavorite = wd.findElement(By.xpath("//button[@id='btnUnFavourite']/i"));
			unfavorite.click();
			System.out.println("Click on Unfavorite");
		}
		
		try {
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement address_edit = wd.findElement(By.xpath("//div[@id='divOverviewDtls']/ul/li/label[2]/a/span"));
		action.moveToElement(address_edit).build().perform();
		address_edit.click();
		System.out.println("Change Service Location Address");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement change_address = wd.findElement(By.xpath("//input[@id='txtSearchSRLocation']"));
		action.moveToElement(change_address).build().perform();
		change_address.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		change_address.sendKeys("2301 West Alameda Avenue, Burbank, CA 91506, US");
		action.moveToElement(change_address).build().perform();
		change_address.click();
		//wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		change_address.sendKeys(Keys.ARROW_DOWN);
		change_address.sendKeys(Keys.TAB);
		change_address.click();
		System.out.println("Change address added");
		wd.findElement(By.xpath("//button[@id='verifySRLocation']")).click();
		System.out.println("Location verify");
		}
		catch(Exception e)
		{
			System.out.println("Not change address");
			
		
		WebElement verify_link = wd.findElement(By.linkText("2301 W Alameda Ave"));
		action.moveToElement(verify_link).build().perform();
		verify_link.click();}
		
		
		
		try {
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement submit_button = wd.findElement(By.xpath("//button[@id='btnEditSRLoc']"));
		action.moveToElement(submit_button).build().perform();
		submit_button.click();
		System.out.println("Click on Submit button");}
		catch(Exception e) {
			System.out.println("Not able to click on Submit button");
		}
		try 
		{
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		WebElement ok_btn = wd.findElement(By.xpath("//button[contains(.,'Ok')]"));
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		action.moveToElement(ok_btn).build().perform();
		ok_btn.click();
		System.out.println("Click on Ok button");}
		catch(Exception e)
		{
			
			System.out.println("Not able to click on OK button");
		}
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		WebElement case_detail = wd.findElement(By.xpath("//div[@id='demoID']/div/div/div/span"));
		case_detail.click();
		WebElement case_detail_edit = wd.findElement(By.xpath("//span[@id='btnEditCaseDetails']/span"));
		case_detail_edit.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		WebElement case_detail1 = wd.findElement(By.xpath("//span[@id='btnEditCaseDetails']/span"));
		case_detail1.click();
		
	}

}
	