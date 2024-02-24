package com.assignment.EnitiateAssignment;
import java.sql.DriverManager;

//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login{
//	@Test
	public void signup()
	{
			WebDriver obj=new ChromeDriver();
			
			obj.get("https://codemanager.pythonanywhere.com/");
			
			WebElement element=obj.findElement(By.xpath("//a[text()='Sign Up']"));
			element.click();

			WebElement fname=obj.findElement(By.id("fname-input"));
			fname.sendKeys("Vaishanavi");
			
			WebElement lname=obj.findElement(By.id("lname-input"));
			lname.sendKeys("Bharate");   
			
			WebElement email=obj.findElement(By.id("email-input"));
			email.sendKeys("vbharate1801@gmail.com");  
			
			WebElement username=obj.findElement(By.id("user-input"));
			username.sendKeys("vaishnavi_31");
			
			WebElement pwd=obj.findElement(By.id("pwd-input"));
			pwd.sendKeys("Vaish@13");
			
			WebElement cnf=obj.findElement(By.id("cnf-pwd"));
			cnf.sendKeys("Vaish@13");
			
			WebElement submitbtn=obj.findElement(By.xpath("//button[@class='btn btn-primary']"));
			submitbtn.click();
			
			//obj.quit();
			
}
	public void login() {
		WebDriver obj=new ChromeDriver();
		 obj.get("https://codemanager.pythonanywhere.com/");
		 obj.manage().window().maximize();
	     obj.findElement(By.id("user-input")).sendKeys("vaishnavi");
		 obj.findElement(By.id("pwd-input")).sendKeys("Vaish@31");
		 obj.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/button")).click();
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// obj.findElement(By.linkText("add_question")).click();xpath("//div[@class='invalid selector']")
		 WebElement element = obj.findElement(By.xpath("/html/body/div[1]/a"));
		 JavascriptExecutor js = (JavascriptExecutor)obj;
		 js.executeScript("arguments[0].click();", element);
		 //obj.findElement(By.className("float-right btn btn-primary")).click();
		// obj.findElement(By.xpath("//div[@class='float-right btn btn-primary']")).click();
		 //obj.findElement(By.cssSelector(".float-right")).click();
		 
		// WebDriverWait wait = new WebDriverWait(obj,Duration.ofMillis(10));
		 //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.float-right.btn.btn-primary")));
		 //element.click();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		  obj.findElement(By.id("id_title")).sendKeys("JAVASCRIPT");
		  obj.findElement(By.id("id_link")).sendKeys("https://www.java.com");
		  obj.findElement(By.id("id_description")).sendKeys("Java is the on of the prog lang");
		  
		  
		  WebElement difficulty = obj.findElement(By.id("id_difficulty"));
		  Select select =new Select(difficulty);
		  select.selectByValue("Hard");
		  
		  WebElement tag = obj.findElement(By.id("id_tag"));
		  Select selectTag =new Select(tag);
		  selectTag.selectByValue("3");
		  
		  obj.findElement(By.id("tag-name")).sendKeys("PQR");
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  obj.findElement(By.id("add-tag")).click();
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  obj.findElement(By.id("id_examples")).sendKeys("PQR");
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  obj.findElement(By.xpath("/html/body/div[1]/form/button")).click();
	}
	public static void main(String[] args) {
		Login l = new Login();
		l.login();
	}
}