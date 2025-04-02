# Appium Calculator Tests

This repository contains Appium automation tests for a mobile calculator application. It demonstrates how to interact with calculator elements and verify their functionality using Appium.

## Table of Contents

* [Prerequisites](#prerequisites)
* [Setup](#setup)
* [Running the Tests](#running-the-tests)
* [Project Structure](#project-structure)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)

## Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK):** Make sure you have a compatible JDK installed.
* **Android SDK (if targeting Android):** Required for interacting with Android emulators/devices. Ensure you have the necessary platform tools and SDK packages.
* **Xcode (if targeting iOS):** Required for interacting with iOS simulators/devices.
* **Node.js and npm (or yarn):** Appium is built on Node.js.
* **Appium Server:** You need to have the Appium server installed and running. You can install it globally using npm:

    ```bash
    npm install -g appium
    ```

    Or using yarn:

    ```bash
    yarn global add appium
    ```
* **Appium Doctor:** Useful for verifying your Appium setup:

    ```bash
    npm install -g appium-doctor
    appium-doctor --android # For Android checks
    appium-doctor --ios     # For iOS checks
    ```
* **IDE (Recommended):** IntelliJ IDEA, Eclipse, or any other Java IDE.
* **Maven (if using Maven for dependency management):** Ensure Maven is installed.
* **TestNG (if using TestNG as the testing framework):** Ensure TestNG is configured in your project.
* **A Mobile Calculator Application:** You'll need the APK file (for Android) or the .app or .ipa file (for iOS) of the calculator application you want to test.

## Setup

Follow these steps to set up the project:

1.  **Clone the Repository:**

    ```bash
    git clone https://github.com/chowdhury-nahid/appium-calculator-tests.git
    cd appium-calculator-tests
    ```

2.  **Navigate to the Project Directory:**

    ```bash
    cd appium-calculator-tests
    ```

3.  **Import the Project into your IDE:** Import the project as a Maven project (if you are using Maven).
4.  **Install Dependencies (if using Maven):**

    ```bash
    mvn clean install
    ```

5.  **Configure Appium:**

    * Ensure your Appium server is running.
    * Update the desired capabilities in your test scripts (e.g., `src/test/java/your/package/name/BaseTest.java` or a similar configuration file) to match your target device/emulator and application details (platform name, device name, app path/package, etc.).

## Running the Tests

**Example using Maven and TestNG:**

1.  **Ensure your Appium server is running.**
2.  **Open your terminal in the project directory.**
3.  **Run the tests using the following Maven command:**

    ```bash
    mvn test
    ```

    This command will execute the TestNG suite defined in your `pom.xml` or your TestNG XML file.

**If running directly from your IDE:**

1.  **Ensure your Appium server is running.**
2.  **Locate your TestNG test classes or suite file in your IDE.**
3.  **Right-click on the test class or suite file and select "Run As" -> "TestNG Test".**

## Project Structure

```
appium-calculator-tests/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── your/package/name/
│   │           └── ... (Page Object classes, utility classes)
│   └── test/
│       └── java/
│           └── your/package/name/
│               └── ... (Test classes)
│   └── resources/
│       └── ... (Configuration files, test data)
├── pom.xml         (if using Maven)
├── README.md
├── LICENSE         (if you have one)
└── ... (other project files)
```

## Contributing

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them.
4.  Push to your fork.
5.  Submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.


