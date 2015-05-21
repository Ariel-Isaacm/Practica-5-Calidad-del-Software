

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AAdirTarjeta {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://trello.com/b/hgnEQYl5/didlogic";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //this.driver = new Capabi(driver).cap();
    this.driver = new Capabi(driver).cap2();
  }

  @Test
  public void testAAdirTarjeta() throws Exception {
	  driver.get("https://trello.com/login");
	  driver.findElement(By.id("user")).sendKeys("CalidadSoftware");
	  driver.findElement(By.id("password")).sendKeys("CALIDADSOFTWARE");
	  driver.findElement(By.id("login")).click();
	  
	  
	  
	  //driver.get("");
	  driver.findElement(By.className("header-logo-default")).click();
	  
	  driver.get("https://trello.com/b/Ne0HIyn6/calidadsoftware");
    driver.findElement(By.xpath("(//a[contains(text(),'Add a card…')])[10]")).click();
    driver.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).click();
    driver.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
    driver.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys("Tarjeta de prueba");
    driver.findElement(By.xpath("//input[@value='Add']")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
