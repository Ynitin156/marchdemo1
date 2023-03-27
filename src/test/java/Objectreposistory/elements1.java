package Objectreposistory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements1
{
	public WebElement searchbttn(WebDriver d1)
	{
		return d1.findElement(By.linkText("Sign in"));                 //singin
	}
	
	public WebElement mobilelogin(WebDriver d1)
	{
		return d1.findElement(By.id("ap_email"));                 //MobileNo
	}
	
	public WebElement continuelogin(WebDriver d1)
	{
		return d1.findElement(By.id("continue"));                 //continue
	}
	
	public WebElement mobileloginpass(WebDriver d1)
	{
		return d1.findElement(By.id("ap_password"));                 //Loginpass
	}
	
	public WebElement continuelogin2(WebDriver d1)
	{
		return d1.findElement(By.id("signInSubmit"));                 //continue2
	}
	
	public WebElement phonesearch(WebDriver d1)
	{
		return d1.findElement(By.id("twotabsearchtextbox"));                 //Phonesearch
	}
	
	public WebElement selectphone(WebDriver d1)
	{
		return d1.findElement(By.linkText("Samsung Galaxy Z Fold4 5G (Graygreen, 12GB RAM, 512GB Storage) with No Cost EMI/Additional Exchange Offers"));                 //selectphone
	}
	
	public WebElement colorselectphone(WebDriver d1)
	{
		return d1.findElement(By.id("a-autoid-18"));                 //colorselectphone
	}
	
	public WebElement addtocart(WebDriver d1)
	{
		return d1.findElement(By.id("add-to-cart-button"));                 //AddToCart
	}
}
