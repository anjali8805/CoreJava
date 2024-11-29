package Google_Search;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleGoogleSearchAutomation {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjali Sinha\\drivers//chromedriver.exe");
		/*
		 This line of code essentially informs Selenium's WebDriver that it should use the ChromeDriver 
		executable located at C:\\Automation\\myWorkSpace\\WebDriver\\SeleniumWebDriver 
		when automating tasks in the Google Chrome browser. 
		*/
		
		WebDriver driver =new ChromeDriver();  // Selenium will launch a new Google Chrome browser window.
		/*
		 Creates an instance of the WebDriver interface using the ChromeDriver class. 
		 This is how you initialize a WebDriver object that will control the Chrome browser.
		 */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 WebDriver will wait for up to the specified duration before throwing an exception. 
		 During this time, it will keep checking for the presence of an element in the DOM.
         If the element is found within the time frame, the operation continues immediately. 
         If the element is not found within the time limit, a NoSuchElementException will be thrown.
         happen for all the elements 
		 */
		
		try {
			driver.get("https://www.google.com/"); //The browser will automatically load https://www.google.com/.
			driver.manage().window().maximize();   
			/*
			 WebDriver-controlled browser window (e.g., Chrome, Firefox) will be maximized, 
			meaning it will expand to take up the entire screen 
			*/
			
			WebElement searchBox = driver.findElement(By.name("q"));  //(implicitly waits for elements to appear)
			//will search the element using ID for searchbox
			
			searchBox.sendKeys("Benifits of Litchi");  // used to type text into the searchBox element ( Google search bar).
			searchBox.submit();
			/*
			  used to submit the form in which the searchBox element resides. 
			  This is equivalent to pressing the Enter key after typing in the search input.
			 */
			 //Retrive the list of search result  titles 
			List <WebElement> results= driver.findElements(By.cssSelector("h3")); //(implicitly waits for elements to appear)
			System.out.println("Top search result");
			
			//enhaned for loop /for-each loop to retrive all the data from the list.
			int count=0;
			for (WebElement final_result : results) {
				if (count>5) 
					break; {
					 String fin_res =final_result.getText();  //getText(): Selenium used to retrieve the text content of an HTML element
					System.out.println(fin_res);
					count ++;
				}
					}
			
				if (!results.isEmpty()) {
					results.get(0).click(); //results.get(0).click(); finds the first element in the results list and clicks it.
				System.out.println("Nativated to : "+ driver.getTitle());
				}	
		}
		
		
		catch(Exception e) {  //handles any exception
			System.out.println("error found" + e.getMessage());
			e.printStackTrace();
		}
		finally {
			driver.quit();
			// Close the browser after execution
		}
	}

}
