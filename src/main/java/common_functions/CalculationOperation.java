package common_functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import page.CalculatorPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
public class CalculationOperation {

    private CalculatorPage calculatorPage;
    public CalculationOperation(CalculatorPage calculatorPage) {
        this.calculatorPage = calculatorPage;
    }

    public ITestResult validateAdditionOperation(int expectedResult) {
        wait3Sec();
        waitUntil(elementToBeClickable(calculatorPage.getAdditionOperation()), Duration.ofSeconds(5));
        calculatorPage.getInputClearOperation().click();
        System.out.println("Cleared Input field");
        calculatorPage.getDigitEight().click();
        System.out.println("Tapped 8");

        calculatorPage.getAdditionOperation().click();
        System.out.println("Tapped +");
        calculatorPage.getDigitTwo().click();
        System.out.println("Tapped 2");
        calculatorPage.getCalculationOperation().click();
        System.out.println("Tapped =");

        validateResult(expectedResult);
        System.out.println("Addition Validation Passed");
        return null;
    }
    public void validateSubtractionOperation(int expectedResult) {
        wait3Sec();
        waitUntil(elementToBeClickable(calculatorPage.getAdditionOperation()), Duration.ofSeconds(5));
        calculatorPage.getInputClearOperation().click();
        System.out.println("Cleared Input field");
        calculatorPage.getDigitEight().click();
        System.out.println("Tapped 8");

        calculatorPage.getSubtractionOperation().click();
        System.out.println("Tapped -");
        calculatorPage.getDigitTwo().click();
        System.out.println("Tapped 2");
        calculatorPage.getCalculationOperation().click();
        System.out.println("Tapped =");

        validateResult(expectedResult);
        System.out.println("Subtraction Validation Passed");
    }
    public void validateMultiplicationOperation(int expectedResult) {
        wait3Sec();
        waitUntil(elementToBeClickable(calculatorPage.getAdditionOperation()), Duration.ofSeconds(5));
        calculatorPage.getInputClearOperation().click();
        System.out.println("Cleared Input field");
        calculatorPage.getDigitEight().click();
        System.out.println("Tapped 8");

        calculatorPage.getMultiplicationOperation().click();
        System.out.println("Tapped X");
        calculatorPage.getDigitTwo().click();
        System.out.println("Tapped 2");
        calculatorPage.getCalculationOperation().click();
        System.out.println("Tapped =");

        validateResult(expectedResult);
        System.out.println("Multiplication Validation Passed");
    }
    public void validateDivisionOperation(int expectedResult) {
        wait3Sec();
        waitUntil(elementToBeClickable(calculatorPage.getAdditionOperation()), Duration.ofSeconds(5));
        calculatorPage.getInputClearOperation().click();
        System.out.println("Cleared Input field");
        calculatorPage.getDigitEight().click();
        System.out.println("Tapped 8");

        calculatorPage.getDivisionOperation().click();
        System.out.println("Tapped ÷");
        calculatorPage.getDigitTwo().click();
        System.out.println("Tapped 2");
        calculatorPage.getCalculationOperation().click();
        System.out.println("Tapped =");

        validateResult(expectedResult);
        System.out.println("Division Validation Passed");
    }

    private void validateResult(int expectedResult){
        String result = calculatorPage.getResultField().getText();
        System.out.println("The calculation result is: "+result);
        Assert.assertEquals(Integer.parseInt(result), expectedResult);
    }
    private void waitUntil(ExpectedCondition<WebElement> until, Duration duration) {
        WebDriverWait wait = new WebDriverWait(calculatorPage.getCalculatorPageDrive(), duration.getSeconds());
        wait.until(until);
    }

    private void wait3Sec(){
        calculatorPage.getCalculatorPageDrive().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
