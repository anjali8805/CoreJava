package Google_Search;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAutomationforWebApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Anjali Sinha\\drivers//chromedriver.exe");
		/*
		 This line of code essentially informs Selenium's WebDriver that it should use the ChromeDriver 
		executable located at C:\\Automation\\myWorkSpace\\WebDriver\\SeleniumWebDriver 
		when automating tasks in the Google Chrome browser. 
		*/
		
		WebDriver driver= new ChromeDriver(); // Selenium will launch a new Google Chrome browser window.
		/*
		 Creates an instance of the WebDriver interface using the ChromeDriver class. 
		 This is how you initialize a WebDriver object that will control the Chrome browser.
		 */
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		// Create WebDriverWait instance with a timeout of 10 seconds
		try {
			driver.navigate().to("https://www.saucedemo.com/");//The browser will automatically load https://www.saucedemo.com/
			driver.manage().window().maximize();
			/*
			 WebDriver-controlled browser window (e.g., Chrome, Firefox) will be maximized, 
			meaning it will expand to take up the entire screen 
			*/
			 // Wait for the username field to be visible
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
            usernameField.sendKeys("standard_user"); // Enter username

            // Wait for the password field to be visible
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            passwordField.sendKeys("secret_sauce"); // Enter password

            // Wait for the login button to be clickable and then click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            loginButton.click();

            // Verify if the login was successful (Check for the inventory page)
            WebElement inventoryHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product_label")));
            if (inventoryHeader.isDisplayed()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } catch (Exception e) {
            System.out.println("Error during automation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
			
		}
					
		
		
		

	
}
