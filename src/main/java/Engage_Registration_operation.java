import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Engage_Registration_operation {

WebDriver wd;
	
	public Engage_Registration_operation (WebDriver wd)
	{
		this.wd= wd;
	}
	By username = By.xpath("//input[@id='UserName']");
	By password = By.xpath("//input[@id='HashPassword']");
	By confirm_password	= By.xpath("//input[@id='ConfirmPassword']");
	By firstname = By.xpath("//input[@id='FirstName']");
	By lastname = By.cssSelector("#LastName");
	By email = By.xpath("//input[@id='Email']");
	By register = By.xpath("//button[@id='btnRegister']");
	By ok = By.id("btnpopupok");
	public void username(String un)
	{
		wd.findElement(username).sendKeys(un);
	}
	public void password(String pw)
	{
		wd.findElement(password).sendKeys(pw);
	}
	public void confirm_password(String cpw)
	{
		wd.findElement(confirm_password).sendKeys(cpw);
	}
	public void firstname(String fn)
	{
		wd.findElement(firstname).sendKeys(fn);
	}
	public void lastname(String ln)
	{
		wd.findElement(lastname).sendKeys(ln);
	}
	public void email(String em)
	{
		wd.findElement(email).sendKeys(em);
	}
	public void register()
	{
		wd.findElement(register).click();
	}
	public void ok()
	{
	wd.findElement(ok).click();
	}

}
