package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.TestBase;

public class CheckBox {
	public static void TestTC3() {
		TestBase testB = new TestBase();
		testB.openWebBrowser();
		((JavascriptExecutor) testB.dr) .executeScript("window.scrollTo(0, document.body.scrollHeight)" );
		testB.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
		testB.dr.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).click(); 

}
}
