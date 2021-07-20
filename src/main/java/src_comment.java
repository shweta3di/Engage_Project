import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class src_comment {

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
		Thread.sleep(3000);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		WebElement comment = wd.findElement(By.xpath("//span[contains(.,'Comments')]"));
		comment.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement add_comment = wd.findElement(By.xpath("//button[@id='btnAddComment']"));
		add_comment.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement comment_txt = wd.findElement(By.xpath("//textarea[@id='CommentText']"));
		comment_txt.sendKeys("Test");
		WebElement submit = wd.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement ok_button = wd.findElement(By.xpath("//button[@id='btnClose']"));
			ok_button.click();
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			js1.executeScript("window.scrollBy, (600,1000)");
			Thread.sleep(3000);
		WebElement	delete = wd.findElement(By.xpath("//div[@id='tblCaseComment']/table/tbody/tr/td[6]/a/span"));
		delete.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js1.executeScript("window.scrollBy, (600,1000)");
		Thread.sleep(3000);
		WebElement yes_button = wd.findElement(By.xpath("//button[@id='btnYes']"));
		yes_button.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement success_ok_button = wd.findElement(By.xpath("//button[@id='btnClose']"));
		success_ok_button.click();
		
		
		
		
	}

}
