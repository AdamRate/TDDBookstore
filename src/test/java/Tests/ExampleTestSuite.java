package Tests;

import ExamplePackage.serviceClass;
import org.junit.*;

import static org.junit.Assert.fail;


public class ExampleTestSuite {

    @BeforeClass
    public static void beforeClass() {

    }

    @Before
    public void beforeTest() {
    }

    @Test
    public void test1(){
        serviceClass sc = new serviceClass();
        Assert.assertEquals(sc.func1(), "Test");
    }

    @Test
    public void addBookTest(){
        serviceClass sc = new serviceClass();
        sc.init();

        int mapSize = sc.getBookMapSize();
        sc.addDefaultBook();
        Assert.assertEquals(mapSize+1, sc.getBookMapSize());
    }

    @Test
    public void countBookTest(){
        serviceClass sc = new serviceClass();
        sc.init();

        Assert.assertEquals(1, sc.countBookType("history"));
    }

    @After
    public void afterTest() {

    }

    @AfterClass
    public static void afterClass() {

    }

}

