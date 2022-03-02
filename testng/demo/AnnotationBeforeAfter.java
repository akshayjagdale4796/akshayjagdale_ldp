package testng.demo;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.*;

public class AnnotationBeforeAfter
{
    @AfterTest
    public void lastExecution()
    {
        System.out.println("i will execute last at the module");
    }
    @Test
    public void printHello()
    {
        System.out.println(" Helloo i am in annotation classs");
    }
    @BeforeTest
    public void preRequest()
    {
        System.out.println("i will execute first");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("it execute before each and every test in that specific class  ");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("it execute after each and every test in that specific class");
    }
    @AfterSuite
    public void afterSuiteMethod()
    {
        System.out.println("it execute at ending of suite");
    }
    @BeforeSuite
    public void beforeSuitMethod()
    {
        System.out.println("it execute at the starting of suite");
    }
}
