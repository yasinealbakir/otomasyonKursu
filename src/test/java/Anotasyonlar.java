
import org.testng.annotations.*;

public class Anotasyonlar {

    
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test...");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

}
