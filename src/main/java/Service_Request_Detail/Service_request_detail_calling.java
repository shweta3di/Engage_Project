package Service_Request_Detail;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Service_request_detail_calling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\browser driver\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://myburbank-uat.3didemo.com/FrontPortal/Page/RenderPage?tabId=7");
		FileInputStream fi=new FileInputStream("C:\\new\\Excel Sheet\\Regitration_sheet.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fi);
		XSSFSheet dsh=wk.getSheet("srcdata");
		XSSFSheet ksh=wk.getSheet("srccase");
		
		
		Service_request_Detail_operation src = new Service_request_Detail_operation(wd);
		for (int i = 1; i <=dsh.getLastRowNum(); i++)
		{
			XSSFRow drw=dsh.getRow(i);
			XSSFCell un=drw.getCell(0);
			XSSFCell pw = drw.getCell(1);
			
			try
			{
				for (int j = 1; j<=ksh.getLastRowNum(); j++) 
				{
					XSSFRow krw=ksh.getRow(j);
					XSSFCell key=krw.getCell(1);
//					System.out.println(key);
					switch (key.toString())
					{
					case "login":
						src.login();
						break;
					case "username":
						src.username(un.toString());
						break;
					case "password":
						src.password(pw.toString());
						break;
					case "login_button":
						src.login_button();
						break;
					default:
						System.out.println("Invalid keyword");
						break;
	}

}}
			catch(Exception e) 
			{
			//	System.out.println("Login not done successfully");
				//res.setCellValue("FAIL");
			}


}
	fi.close();


	}

}
