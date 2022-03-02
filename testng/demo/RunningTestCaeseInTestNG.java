package testng.demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (SampleListner.class)
public class RunningTestCaeseInTestNG
{
    @Test
    public void firstTest()
    {
        System.out.println("hello");
    }
    @Test
    public void secondTest()
    {
        System.out.println("hi");
        Assert.assertTrue(false);
    }
}
