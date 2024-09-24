// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CadastrarVeterinarioTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void cadastrarVeterinario() {
    driver.get("http://localhost:8080/home");
    driver.manage().window().setSize(new Dimension(896, 816));
    driver.findElement(By.cssSelector("a:nth-child(3) > .btn")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("José da Silva");
    driver.findElement(By.id("inputEmail")).click();
    driver.findElement(By.id("inputEmail")).sendKeys("josesilva@mail.com");
    driver.findElement(By.id("inputEspecialidade")).click();
    driver.findElement(By.id("inputEspecialidade")).sendKeys("Felinos");
    driver.findElement(By.id("inputSalario")).click();
    driver.findElement(By.id("inputSalario")).sendKeys("3500");
    driver.findElement(By.cssSelector(".btn")).click();
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > span")).getText(), is("José da Silva"));
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3) > span")).getText(), is("Felinos"));
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(4) > span")).getText(), is("josesilva@mail.com"));
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(5) > span")).getText(), is("3500.00"));
  }
}
