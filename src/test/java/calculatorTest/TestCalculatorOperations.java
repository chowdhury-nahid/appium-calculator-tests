package calculatorTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import listener.ExtentReportListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.TestNGException;
import org.testng.annotations.*;
import page.CalculatorPage;
import common_functions.CalculationOperation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Listeners(listener.ExtentReportListener.class)
public class TestCalculatorOperations {

    ExtentReports extent;
    ExtentReportListener extentReportListener;
    private String appiumServerUrl = "http://localhost:4723";
    private AndroidDriver driver;
    private String deviceName = "Pixel_3a_API_29";
//    private String appLocation = "C:/testApk/calculator-8-4-1.apk";
//    private String appLocation = "src/test/resources/apps/calculator-8-4-1.apk";
//    URL appLocation = getClass().getResource("/src/test/resources/apps/calculator-8-4-1.apk");

//    URL url = getClass().getResource("src/main/resources/calculator-8-4-1.apk");
//    private String appLocation = url.getPath();
    File appFile = new File("src/test/resources/apps/calculator-8-4-1.apk");
    private CalculatorPage calculatorPage;
    private CalculationOperation calculationOperation;
    private ExtentTest test;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        extentReportListener = new ExtentReportListener();
        extent = extentReportListener.getExtentReports();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("app", appFile.getAbsolutePath());

        driver = new AndroidDriver<MobileElement>(new URL(appiumServerUrl), capabilities);
        calculatorPage = new CalculatorPage(driver);
        calculationOperation = new CalculationOperation(calculatorPage);
    }

    @Test
    public void testAdditionOperation() {
        test = extent.createTest("Test Addition Operations", "Validation of Addition operation");
        try {
            calculationOperation.validateAdditionOperation(10);

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (WebDriverException e) {
            handleException(e, "Test failed. Check the report at Test_Report/calculation-report.html");
        }
    }
    @Test
    public void testSubtractionOperation() {
        test = extent.createTest("Test Subtraction Operations", "Validation of Subtraction operation");
        try {

            calculationOperation.validateSubtractionOperation(6);


            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (WebDriverException e) {
            handleException(e, "Test failed. Check the report at Test_Report/calculation-report.html");
        }
    }
    @Test
    public void testMultiplicationOperation() {
        test = extent.createTest("Test Multiplication Operations", "Validation of Multiplication operation");
        try {
            calculationOperation.validateMultiplicationOperation(16);


            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (WebDriverException e) {
            handleException(e, "Test failed. Check the report at Test_Report/calculation-report.html");
        }
    }
    @Test
    public void testDivisionOperation() {
        test = extent.createTest("Test Division Operations", "Validation of Division operation");
        try {

            calculationOperation.validateDivisionOperation(4);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (WebDriverException e) {
            handleException(e, "Test failed. Check the report at Test_Report/calculation-report.html");
        }
    }



    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            handleException(result.getThrowable(), "Test failed. Check the screenshot at this location screenshots/error_calculationOperations.png");
        }
    }

    private void handleException(Throwable e, String message) {
        String errorMessage = String.format("%s\nException: %s", message, e.getMessage());
        System.err.println(errorMessage);
        test.fail(errorMessage);
        driver.getScreenshotAs(OutputType.FILE).renameTo(new File("screenshots/error_calculationOperations.png"));
        throw new TestNGException(errorMessage, e);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
