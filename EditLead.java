package week2.day1.seleniumhomework;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCCOMPANY");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobana");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasad");
		 driver.findElement(By.name("firstNameLocal")).sendKeys("Shoba");
		 driver.findElement(By.name("departmentName")).sendKeys("IT");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("I worked in the IT field for past 3 years");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shobapp@gmail.com");
		 WebElement elementDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd =new Select(elementDropdown);
		 dd.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.name("importantNote")).sendKeys("This is important note to be followed");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 System.out.println("The Title is :" +driver.getTitle());
		 driver.close();

	}

}
