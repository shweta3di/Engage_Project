import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class src_case_detail {

	public static void main(String[] args) throws Exception {
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
	//	wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search = wd.findElement(By.xpath("//input[@id='CustomSearch']"));
		//search.click();
		action.moveToElement(search).build().perform();
		search.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		search.sendKeys("PR-210715-00340");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		
		WebElement link = wd.findElement(By.xpath("//ul[@id='CustomSearch_listbox']/li/a/div"));
		//Thread.sleep(3000);
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
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement case_detail = wd.findElement(By.cssSelector("#btnEditCaseDetails > span"));
		//action.moveToElement(case_detail).build().perform();
		case_detail.click();
		System.out.println("Click on Case Edit");
		
		
		Thread.sleep(3000);
		WebElement case_detail1 = wd.findElement(By.cssSelector("#btnEditCaseDetails > span"));
		Thread.sleep(3000);
		action.moveToElement(case_detail1).build().perform();
		case_detail1.click();
		
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		Select problem_location = new Select(wd.findElement(By.xpath("//option[@value='Gutter']")));
		problem_location.selectByValue("Crosswalk");
		
	}}