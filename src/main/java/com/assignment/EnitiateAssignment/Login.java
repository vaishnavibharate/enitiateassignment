package com.assignment.EnitiateAssignment;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
//	@Test
	public void login()
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
			
			email.sendKeys("vaishnavibharate18@gmail.com"); //user-input
			
	WebElement username=obj.findElement(By.id("user-input"));
			
			username.sendKeys("vaishnavi_31");
			
			WebElement pwd=obj.findElement(By.id("pwd-input"));
			
			pwd.sendKeys("Vaish@13");
			
	WebElement cnf=obj.findElement(By.id("cnf-pwd"));
			
			cnf.sendKeys("Vaish@13");
			
		 
			
			WebElement submitbtn=obj.findElement(By.xpath("//button[@class='btn btn-primary']"));
			
			submitbtn.click();
			
			//WebElement  u_name = obj.findElement(By.id(user-input)).sendKeys("vaishnavi_13");


			//obj.quit();
			
}
	public static void main(String[] args) {
		Login l = new Login();
		l.login();
	}
}