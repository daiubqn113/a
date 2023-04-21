package Common;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public ChromeDriver dr;
	public void openWebBrowser() {
		System.setProperty("Webdriver.Chrome.Driver", "E:\\AutomationTest\\Autotest\\JavaBasic.02\\Test_QA\\src\\Driver\\chromedriver.exe");
		 dr = new ChromeDriver();
		dr.get("https://demoqa.com");
//		dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Tony dai"); 
//		dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abc@gmai.com");
//		dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("UBQN");
//		dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("UBQN 01");
//		dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Tony dai");
		
		
//		WebElement submit = testB.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
//		((JavascriptException) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
//		submit.click();
//		dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click(); 
//		WebElement nhap = dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
//		nhap.click();
//		WebElement nhap01 = dr.findElement(By.xpath("//*[@id=\"item-0\"]"));
//		nhap01.click();
//		((JavascriptException)dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)")
	}
	
	public void inputYear(String year) {
		WebElement dropBox = dr.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select years = new Select(dropBox);
		years.selectByValue(year);
	}
	
	public void inputMonth(String month) {
		WebElement dropBox = dr.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select M = new Select(dropBox);
		M.selectByValue(month);
	}
	
	public void inputDay(String day) {
		// Tìm danh sách các ngày đang hiển thị
		List<WebElement> visibleDay = dr.findElements(By.xpath(""));
		//Dùng foreach duyệt qua từng phần tử trong list
		for (WebElement e : visibleDay) {
			//Lấy đầy đủ các ngày cần tìm
			String valueOfClass = e.getAttribute("class");
			if((valueOfClass.contains(day)) && (valueOfClass.contains("outside-month"))){
				e.click();
			}
		}
	}
}
