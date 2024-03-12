package page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage {

    private AndroidDriver<MobileElement> driver;
    private MobileElement resultField;
    private MobileElement additionOperation;
    private MobileElement subtractionOperation;
    private MobileElement multiplicationOperation;
    private MobileElement divisionOperation;
    private MobileElement calculationOperation;
    private MobileElement inputClearOperation;
    private MobileElement digitTwo;
    private MobileElement digitEight;

    public CalculatorPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        System.out.println("Driver Status"+driver.getStatus());
        initializeElements();
    }

    private void initializeElements() {
        additionOperation = driver.findElement(MobileBy.id("com.google.android.calculator:id/op_add"));
        subtractionOperation = driver.findElement(MobileBy.id("com.google.android.calculator:id/op_sub"));
        multiplicationOperation = driver.findElement(MobileBy.id("com.google.android.calculator:id/op_mul"));
        divisionOperation = driver.findElement(MobileBy.id("com.google.android.calculator:id/op_div"));
        calculationOperation = driver.findElement(MobileBy.id("com.google.android.calculator:id/eq"));
        inputClearOperation = driver.findElement(MobileBy.id("com.google.android.calculator:id/clr"));
        digitTwo = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_2"));
        digitEight = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_8"));
        System.out.println("Initialization done");
    }

    private void initializeResultFieldElement() {
        resultField = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
    }


    public MobileElement getResultField() {
        initializeResultFieldElement();
        return resultField;
    }

    public MobileElement getAdditionOperation() {
        return additionOperation;
    }

    public MobileElement getSubtractionOperation() {
        return subtractionOperation;
    }

    public MobileElement getMultiplicationOperation() {
        return multiplicationOperation;
    }

    public MobileElement getDivisionOperation() {
        return divisionOperation;
    }

    public MobileElement getCalculationOperation() {
        return calculationOperation;
    }

    public MobileElement getInputClearOperation() {
        return inputClearOperation;
    }

    public MobileElement getDigitTwo() {
        return digitTwo;
    }

    public MobileElement getDigitEight() {
        return digitEight;
    }

    public AndroidDriver getCalculatorPageDrive() {
        return driver;
    }

}
