package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Candy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Candy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Velusamy");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Leftie");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium Webdriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pravin.velusamy25@gmail.com");
		WebElement eleTool = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd = new Select(eleTool);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title is :"+ driver.getTitle());
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("I confirm the title has View Lead");
		}else
			System.out.println("The title does not have word View Lead");
			
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pravin");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The title is :"+ driver.getTitle());
		if(driver.getTitle().contains("View Leads")) {
			System.out.println("I confirm the title has View Lead");
		}else
			System.out.println("The title does not have word View Lead");

	}

}
