# worldlineTestingTask3
# Pet Store Registration Automation

This project automates the registration process on the Pet Store website using Selenium WebDriver and TestNG. It reads test data from a CSV file and fills the registration form with the provided data.It is an experiment conducted by exploring a case study or use case with one of the following Test Data Generation Tools i.e. GenerateData.com

## Prerequisites

- Java Development Kit (JDK) installed on your machine
- WebDriver executable (e.g., ChromeDriver) compatible with your browser installed and its path added to the system PATH environment variable
- Maven installed on your machine

## Setup

1. Clone this repository to your local machine:

git clone https://github.com/singhroshnni/worldlineTestingTask3.git)https://github.com/singhroshnni/worldlineTestingTask3.git

2. Navigate to the project directory:

cd wordlineTestingTask3

3. Import the project into your preferred IDE.

4. Make sure to install dependencies using Maven:

mvn clean install

## Additional details

1. CSV file containing test data, used in this project is in `src/resource/` directory. Ensure the file name is `Autotestdata.csv`.

2. Open the `RegisterTest.java` file located at `src/main/java/Task3/Task3/`.

3. Replace the file path used in the `ReadCSVFile` constructor with the correct path to your CSV file or to file path in src folder:

```java
ReadCSVFile config = new ReadCSVFile("src/resource/Autotestdata.csv");```

4. Register.java file contains test script to fill the details and automate registeration process

5. ReadCSVFile is utility file to read CSV file 

