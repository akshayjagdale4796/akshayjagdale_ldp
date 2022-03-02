package testng.demo;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class SampleListner implements ITestListener
{

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult)
    {
        System.out.println("succesfully pass the test");
    }

    @Override
    public void onTestFailure(ITestResult Result)
    {
        System.out.println("failed to execute test"+Result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
    @Test
    public void pass()
    {
        System.out.println("pass test");
    }
    @Test
    public void fail()
    {
        System.out.println("fail test");
       Assert.assertTrue(false);
    }
}
