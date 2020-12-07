package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {

    public void startup() {

    }

    @Test
    public void test1() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname='j93WEe']")).click();
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='qCp9A']")).click();
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        //driver.findElement(By.cssSelector("div.PaQdxb.A2W7l")).click();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        assertEquals("1", driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText());
        driver.quit();
    }

    @Test
    public void test2() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname='abcgof']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        //driver.findElement(By.cssSelector("div.PaQdxb.A2W7l")).click();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        assertEquals("Infinity", driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText());
        driver.quit();
    }

    @Test
    public void test3() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("калькулятор", Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname='aN1RFf']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
        //driver.findElement(By.cssSelector("div.PaQdxb.A2W7l")).click();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();
        assertEquals("Error", driver.findElement(By.xpath("//span[@jsname='VssY5c']")).getText());
        driver.quit();
    }
}
