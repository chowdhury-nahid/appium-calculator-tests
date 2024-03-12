# Android Calculator Automation Project

This project demonstrates automated testing of an Android calculator application using Appium, Java, and TestNG.

## Prerequisites

Before running the tests, ensure you have the following prerequisites installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Appium](http://appium.io/docs/en/about-appium/intro/install/)
- [Android Studio](https://developer.android.com/studio)
- Android emulator or a physical Android device

## Project Structure
Following the Page Object Model the project is organized as following:
- `src/calculatorTest/java/calculatorTest`: Contains the calculatorTest scripts
- `src/calculatorTest/java/listener`: Contains the extent listener scripts
- `src/main/java/page`: Contains page objects
- `src/main/java/common_functions`: Contains operation functions
- `testng.xml`: TestNG configuration file for running tests

## Configuration

1. **Appium Server:**
    - Start the Appium server using the provided configuration. Make sure the server is running on `http://localhost:4723`.
2. **AVD Configuration (emulator):**
    - Create and configure an Android Virtual Device (AVD) in Android Studio with device name `Pixel_3a_API_29`. Start the emulator device. The command to run the emulator is following:
   ```Bash
    emulator -avd Pixel_3a_API_29
   ```
3. **Test APK location::**
   - Put the calculatorTest apk at `C:/testApk/` location by `calculator-8-4-1.apk` name.
4. **TestNG Configuration:**
   - Open the `testng.xml` file and configure the desired calculatorTest suite, calculatorTest cases, and device capabilities.

## Running Tests

1. **Command Line:**
    - Navigate to the project root directory in the terminal.
    - Run the tests using the following command:
      ```bash
      mvn test -Dtest="TestCalculatorOperations.java"
      ```

2. **IDE (Eclipse/IntelliJ):**
    - Import the project into your preferred IDE.
    - Right-click on the `testng.xml` file and select "Run" or "Run As TestNG Suite."

## Test Results

After running the tests, review the results in the TestNG HTML report. The report is generated in the `Test_Report` folder.

## Troubleshooting

- If you encounter issues, refer to the calculatorTest generated report, error messages and check the Appium server logs for more information.
- Ensure that the desired capabilities in the `testng.xml` file are correctly configured.

## Contributors

- Nahid Chowdhury

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
