package Tests;

import ExamplePackage.serviceClass;
import org.junit.*;

import static org.junit.Assert.fail;


public class ExampleTestSuite {

    @BeforeClass
    public static void beforeClass() {
        serviceClass sc = new serviceClass();
        sc.addNewBook("Test Author", "Test Title", "history", "1995");
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
        int mapSize = sc.getBookMapSize();
        sc.addNewBook("Adam", "Book Title", "history", "4001");
        Assert.assertEquals(mapSize+1, sc.getBookMapSize());
    }

    @Test
    public void countBookTest(){
        serviceClass sc = new serviceClass();
        Assert.assertEquals(2, sc.countBookType("history"));
    }

    @After
    public void afterTest() {

    }

    @AfterClass
    public static void afterClass() {

    }

}

