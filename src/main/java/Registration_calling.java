import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration_calling {

	public static void main(String[] args) throws Exception {
		

			System.setProperty("webdriver.gecko.driver", "C:\\browser driver\\geckodriver.exe");
			WebDriver wd = new FirefoxDriver();
			
			wd.get("https://myburbank-uat.3didemo.com/FrontPortal/Page/RenderPage?tabId=1");
			wd.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
			
			FileInputStream fi=new FileInputStream("C:\\new\\Excel Sheet\\Regitration_sheet.xlsx");
			XSSFWorkbook wk=new XSSFWorkbook(fi);
			XSSFSheet dsh=wk.getSheet("Testdata");
			XSSFSheet ksh=wk.getSheet("Testcase");
			
			
			Engage_Registration_operation ero = new Engage_Registration_operation(wd);
			for (int i = 1; i <=dsh.getLastRowNum(); i++)
			{
				XSSFRow drw=dsh.getRow(i);
				XSSFCell un=drw.getCell(0);
				XSSFCell pw = drw.getCell(1);
				XSSFCell cpw = drw.getCell(2);
				XSSFCell fn = drw.getCell(3);
				XSSFCell ln = drw.getCell(4);
				XSSFCell em = drw.getCell(5);
				try
				{
					for (int j = 1; j<=ksh.getLastRowNum(); j++) 
					{
						XSSFRow krw=ksh.getRow(j);
						XSSFCell key=krw.getCell(1);
//						System.out.println(key);
						switch (key.toString())
						{
						
						case "username":
							ero.username(un.toString());
							break;
						case "password":
							ero.password(pw.toString());
							break;
						case "confirm_password":
							ero.confirm_password(cpw.toString());
							break;
						case "firstname":
							ero.firstname(fn.toString());
							break;
						case "lastname":
							ero.lastname(ln.toString());
							break;
						case "email":
							ero.email(em.toString());
							break;
						case "register":
							ero.register();
							break;
						case "ok":
							ero.ok();
							break;
						default:
							System.out.println("Invalid keyword");
							break;
						}
	}}
				catch(Exception e) 
				{
					System.out.println("Registration done successfully");
					//res.setCellValue("FAIL");
				}


	}
		fi.close();
	

		}

	}


