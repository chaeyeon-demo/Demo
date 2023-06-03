// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.openqa.selenium.devtools.v112.page.Page.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SeleniumTest1Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();  // provides a way to share data or pass information between different parts of the test
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void hongik5() throws InterruptedException {
    	driver.get("https://github.com/chaeyeon-demo/sw_demo");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector(".mr-n2 path")).click();
        driver.findElement(By.cssSelector(".CodeMirror-scroll")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".CodeMirror-code"));
          js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<div style=\"position: relative;\"><div class=\"CodeMirror-gutter-wrapper\" contenteditable=\"false\" style=\"left: -53px;\"><div class=\"CodeMirror-linenumber CodeMirror-gutter-elt\" style=\"left: 0px; width: 21px;\">1</div></div><pre class=\" CodeMirror-line \" role=\"presentation\" dir=\"auto\"><span role=\"presentation\" style=\"padding-right: 0.1px;\"><span class=\"cm-header cm-header-1\"># sw_demo</span></span></pre></div><div style=\"position: relative;\"><div class=\"CodeMirror-gutter-wrapper\" contenteditable=\"false\" style=\"left: -53px;\"><div class=\"CodeMirror-linenumber CodeMirror-gutter-elt\" style=\"left: 0px; width: 21px;\">2</div></div><pre class=\" CodeMirror-line \" role=\"presentation\" dir=\"auto\"><span role=\"presentation\" style=\"padding-right: 0.1px;\"><span cm-text=\"\">��</span></span></pre></div><div style=\"position: relative;\"><div class=\"CodeMirror-gutter-wrapper\" contenteditable=\"false\" style=\"left: -53px;\"><div class=\"CodeMirror-linenumber CodeMirror-gutter-elt\" style=\"left: 0px; width: 21px;\">3</div></div><pre class=\" CodeMirror-line \" role=\"presentation\" dir=\"auto\"><span role=\"presentation\" style=\"padding-right: 0.1px;\">hello world!</span></pre></div>'}", element);
        }
        driver.findElement(By.cssSelector(".cFjoJl > .Box-sc-g0xbh4-0 > span")).click();
        driver.findElement(By.cssSelector(".ButtonPrimary-sc-1awfvt4-0")).click();
    }
}

