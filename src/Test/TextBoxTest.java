package Test;



import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Common.TestBase;

public class TextBoxTest {
	
	// TestCase Submit
	public static void TestTC1() {
		TestBase testB = new TestBase();
		testB.openWebBrowser();
		// Nhập text
		String inputName = "Tony dai";
		String inputEmail = "abc@gmai.com";
		String inputaddress = "UBQN";
		String inputAddr = "Tony dai";
		
		//Các bước thực hiện
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(inputName); 
		testB.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(inputEmail);
		testB.dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys(inputaddress);
		testB.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys(inputAddr);
		
		
		WebElement submit = testB.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		
		submit.click();
		
//		--------- Test Case ---------
		
		String actualName = testB.dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		System.out.println(actualName.substring(5).equals(inputName) ? "TC1 - Pass : Name"
				: "TC1 - Fail");
		
		String actualEmail = testB.dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		System.out.println(actualEmail.substring(5).equals(inputName) ? "TC1 - Pass : Email"
				: "TC1 - Fail");
		
		String actualaddress = testB.dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		System.out.println(actualaddress.substring(5).equals(inputName) ? "TC1 - Pass : Address"
				: "TC1 - Fail");
		
		String actualAddr = testB.dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		System.out.println(actualAddr.substring(5).equals(inputName) ? "TC1 - Pass : Addr"
				: "TC1 - Fail");

	}
	
	public static void TestTC2() throws InterruptedException {
		TestBase testB = new TestBase();
		testB.openWebBrowser();
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Tony dai"); 
		testB.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abcgmai.com");
		testB.dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("UBQN");
		testB.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("UBQN 01");
		
		
		WebElement submit = testB.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		
		submit.click();
		Thread.sleep(3000);
		//Check boder red
		WebElement element = testB.dr.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		String colorHex  = Color.fromString(element.getCssValue("border-bottom-color")).asHex();
		System.out.println(colorHex.equals("#ff0000") ? "TC2 - Pass: Red border is displayed"
						: "TC2 - Fail: Red border isn't displayed");
		
//		System.out.println(colorHex);
	}
	

}
