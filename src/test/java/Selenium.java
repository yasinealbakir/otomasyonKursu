
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void test01() throws InterruptedException {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        driver.quit();

    }

    @Test
    public void radioButtonTest() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.findElement(By.xpath("//input[@value='Option 2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
        driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
        driver.findElement(By.xpath("//input[@value='checkbox3']")).click();
        Thread.sleep(2000);

    }

    @Test
    public void dropDownTest() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement element = driver.findElement(By.name("country"));
        Select selectUlke = new Select(element);
        selectUlke.selectByValue("ANGOLA");
        Thread.sleep(2000);
    }

    @Test
    public void scrollOperationTest() throws InterruptedException {
        driver.get("https://www.amazon.com.tr/");
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a[.='Giriþ yap']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void dragDropTest() throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement sehir = driver.findElement(By.id("box3")); //washington
        WebElement ulke = driver.findElement(By.id("box103")); //abd

        Actions action = new Actions(driver);
        action.dragAndDrop(sehir, ulke).perform();
        Thread.sleep(2000);

    }

    @Test
    public void dragDropTest2() throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HashMap<String, String> sehirlerUlkerMap = new HashMap<>();
        sehirlerUlkerMap.put("box1", "box101");
        sehirlerUlkerMap.put("box2", "box102");
        sehirlerUlkerMap.put("box3", "box103");
        sehirlerUlkerMap.put("box4", "box104");
        sehirlerUlkerMap.put("box5", "box105");
        sehirlerUlkerMap.put("box6", "box106");
        sehirlerUlkerMap.put("box7", "box107");

        Actions action = new Actions(driver);
        for (HashMap.Entry<String, String> entry : sehirlerUlkerMap.entrySet()) {

            WebElement sehir = driver.findElement(By.id(entry.getKey()));
            WebElement ulke = driver.findElement(By.id(entry.getValue()));
            action.dragAndDrop(sehir, ulke).perform();

        }
        Thread.sleep(2000);

    }

    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\example\\file.txt");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();
        Thread.sleep(2000);
    }
    
    @Test
    public void toolTipTest(){
        driver.get("https://demo.guru99.com/test/social-icon.html");
        String element = driver.findElement(By.cssSelector(".fa-facebook")).getAttribute("title");
        System.out.println("Tooltip : " + element);
        
    }

}
