package pt.ipp.isep.dei.examples.tdd.basic.domain;


import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
//import static jdk.nashorn.internal.objects.NativeMath.round;
public class BookmarkTest {

    @BeforeAll
    public static void classSetUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place before any @Test is executed");
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }

    @Test
    @Disabled
    public void failingTest() {
        fail("a disabled failing test");
    }

    /**
     * Test to ensure two positive numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arrange: one positive number (three) and another positive number (two).<p>
     * Act: sum both numbers (three and two).<p>
     * Assert: the result is five.
     */
    @Test
    public void addValidURL() throws MalformedURLException {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        URL url= new URL("http://www.google.com");
        Boolean expectedResult = true;
        Boolean result;

        // Act

        result = new Bookmark().addBookmark(url);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void addInvalidURL() throws MalformedURLException {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        try {
            URL url = new URL("http://www.google.com");
            Boolean expectedResult = true;
            Boolean result;

            // Act
            result = new Bookmark().addBookmark(url);

            // Assert
            assertEquals(expectedResult, result);
        } catch (MalformedURLException e) {
        }
    }

}



