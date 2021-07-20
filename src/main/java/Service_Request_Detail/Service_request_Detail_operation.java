package Service_Request_Detail;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Service_request_Detail_operation {
WebDriver wd;

	public Service_request_Detail_operation (WebDriver wd)
	{
		this.wd= wd;
	}
	
	By login = By.cssSelector(".Login-Registe:nth-child(2) > .nav-link");
	By username = By.xpath("//form[@id='formLogin']/div/div/input");
	By password = By.xpath("//input[@id='password']");
	By login_button = By.cssSelector("#btnLogin");
	
	public void login()
	{
		wd.findElement(login).click();
	}
	public void username(String un) 
	{
		wd.findElement(username).sendKeys(un);
	}
	public void password(String pw) {
		wd.findElement(password).sendKeys(pw);
		}
	public void login_button(){
		
		wd.findElement(login_button).click();
	}
	
	
}
