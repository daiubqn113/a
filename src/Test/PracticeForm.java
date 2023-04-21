package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.TestBase;

public class PracticeForm {
	public static void TestTC1() {
		TestBase testB = new TestBase();
		testB.openWebBrowser();
		// Nhập text
		String inputFirstName = "Cao Trần";
		String inputLastName = "Đại";
		String inputEmail = "abc@gmai.com";
		String inputAge = "18";
		String inputSalary = "100000";
		String inputDepartment = "Kỹ thuật";
		
		//Các bước thực hiện
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(inputFirstName); 
		testB.dr.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(inputLastName);
		testB.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(inputEmail);
		testB.dr.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys(inputAge);
		testB.dr.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys(inputSalary);
		testB.dr.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys(inputDepartment);
		
		
		WebElement submit = testB.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
//		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		
		submit.click();	
		
//		--------- Test Case ---------
		
//		String actualFirstName = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")).getText();
//		System.out.println(actualFirstName.equals(inputFirstName) ? "TC1 - Pass : First Name"
//				: "TC1 - Fail");
//		
//		String actualLastName = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[2]")).getText();
//		System.out.println(actualLastName.equals(inputLastName) ? "TC1 - Pass : Last Name"
//				: "TC1 - Fail");
//		
//		String actualAge = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[3]")).getText();
//		System.out.println(actualAge.equals(inputAge) ? "TC1 - Pass : Age"
//				: "TC1 - Fail");
//		
//		String actualEmail = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[4]")).getText();
//		System.out.println(actualEmail.equals(inputEmail) ? "TC1 - Pass : Email"
//				: "TC1 - Fail");
//		
//		String actualSalary = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[5]")).getText();
//		System.out.println(actualSalary.equals(inputSalary) ? "TC1 - Pass : Salary"
//				: "TC1 - Fail");
//		
//		String actualDepartment = testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[6]")).getText();
//		System.out.println(actualDepartment.equals(inputDepartment) ? "TC1 - Pass : Department"
//				: "TC1 - Fail");
	}
}
