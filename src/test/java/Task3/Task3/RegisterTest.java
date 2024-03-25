package Task3.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class RegisterTest {

	WebDriver driver;
	
	
	
	@Test(dataProvider="testdata")
	public void fillDetails(String uid, String pwd, String fName, String lName, String emailId, String mob, String add1, String add2, String cities, String sta, String zip, String con ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
       
		
		WebElement id=driver.findElement(By.name("username"));
		WebElement fname=driver.findElement(By.name("account.firstName"));
		WebElement lname=driver.findElement(By.name("account.lastName"));
		WebElement email=driver.findElement(By.name("account.email"));
		WebElement street=driver.findElement(By.name("account.address1"));
		WebElement street2=driver.findElement(By.name("account.address2"));
		WebElement city=driver.findElement(By.name("account.city"));
		WebElement state=driver.findElement(By.name("account.state"));
		WebElement postcode=driver.findElement(By.name("account.zip"));
		
		WebElement country=driver.findElement(By.name("account.country"));
		WebElement num=driver.findElement(By.name("account.phone"));
		WebElement pass=driver.findElement(By.name("password"));
		WebElement conpas=driver.findElement(By.name("repeatedPassword"));
		
		WebElement checkmark=driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
		WebElement capcha=driver.findElement(By.xpath("//input[@name='account.listOption']"));
		WebElement reg=driver.findElement(By.name("newAccount"));
		
		id.sendKeys(uid);
		pass.sendKeys(pwd);
		conpas.sendKeys(pwd);
		fname.sendKeys(fName);
		lname.sendKeys(lName);
		email.sendKeys(emailId);
		num.sendKeys(mob);
		street.sendKeys(add1);
		street2.sendKeys(add2);
		city.sendKeys(cities);
		state.sendKeys(sta);
		postcode.sendKeys(zip);
		country.sendKeys(con);
		
		
		checkmark.click();
		capcha.click();
		reg.click();
		
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] registerTD() {
		ReadCSVFile config = new ReadCSVFile("D:\\WorldLine\\Autotestdata.csv");
        int rows = config.getRowCount(); // Get total number of rows in the CSV file

        Object[][] credentials = new Object[rows][12];

        for (int i = 0; i < rows; ++i) {
            // Populate each row of credentials array with data from CSV file
            credentials[i] = new String[]{
                config.getData(i, 0), // uid
                config.getData(i, 1), // pwd
                config.getData(i, 2), // fName
                config.getData(i, 3), // lName
                config.getData(i, 4), // emailId
                config.getData(i, 5), // mob
                config.getData(i, 6), // add1
                config.getData(i, 7), // add2
                config.getData(i, 8), // cities
                config.getData(i, 9), // sta
                config.getData(i, 10), // zip
                config.getData(i, 11) // con
            };
        }

        return credentials;
    }
	
	
}


