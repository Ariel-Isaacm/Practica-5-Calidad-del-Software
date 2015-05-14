


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CambiarNombreDashboard {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://trello.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCrearDashboard() throws Exception {
	  //acceder al sitio y logear
	  driver.get("https://trello.com/login");
	  driver.findElement(By.id("user")).sendKeys("CalidadSoftware");
	  driver.findElement(By.id("password")).sendKeys("CALIDADSOFTWARE");
	  driver.findElement(By.id("login")).click();
	  
	  
	  
	  //driver.get("");
	  driver.findElement(By.className("header-logo-default")).click();
	  
	  driver.get("https://trello.com/b/Ne0HIyn6/calidadsoftware");
	  driver.findElement(By.className("js-board-name js-autofocus")).sendKeys("CalidadDelSoftware");
	  driver.findElement(By.className("primary confirm js-save-edit")).click();
	  
	  
	  //driver.findElement(By.id("boardNewTitle")).sendKeys("CALIDADSOFTWARE");
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
