package Objectreposistory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements2 
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
		return d1.findElement(By.linkText("Samsung 108 cm (43 inches) Crystal 4K Neo Series Ultra HD Smart LED TV UA43AUE65AKXXL (Black)"));                 //selectphone
	}
	
	public WebElement colorselectphone(WebDriver d1)
	{
		return d1.findElement(By.id("a-autoid-20"));                 //ledseries
	}
	
	public WebElement addtocart(WebDriver d1)
	{
		return d1.findElement(By.id("add-to-cart-button"));                 //AddToCart
	}
}
