package Functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectreposistory.elements2;

public class loginamazon2 
{
	
		  @Test
			public void amazonlogin() throws InterruptedException, AWTException, IOException
			{
		    	   WebDriver d1;
		    	 
				   System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
			       d1 = new ChromeDriver();
			       d1.get("https://www.amazon.in/");
			       d1.manage().window().maximize();
			       
			       elements2 e2 = new elements2();
			       e2.searchbttn(d1).click();		
			       e2.mobilelogin(d1).sendKeys("9910305181");
			       e2.continuelogin(d1).click();
			       e2.mobileloginpass(d1).sendKeys("Quantum@25");
			       e2.continuelogin2(d1).click();
			       
			       Thread.sleep(2000);
			       
			       e2.phonesearch(d1).sendKeys("samsung led tv");
			       Robot r2 = new Robot();
			       Thread.sleep(2000);
			       r2.keyPress(KeyEvent.VK_DOWN);
			       r2.keyRelease(KeyEvent.VK_DOWN);
			       r2.keyPress(KeyEvent.VK_DOWN);
			       r2.keyRelease(KeyEvent.VK_DOWN);
			       r2.keyPress(KeyEvent.VK_DOWN);
			       r2.keyRelease(KeyEvent.VK_DOWN);
			       r2.keyPress(KeyEvent.VK_DOWN);
			       r2.keyRelease(KeyEvent.VK_DOWN);
			       r2.keyPress(KeyEvent.VK_ENTER);
			       r2.keyRelease(KeyEvent.VK_ENTER);
			       
			       e2.selectphone(d1).click();
			       
			       String w1 = d1.getTitle();                                             //w1kTitlekliyehai
			       Set<String> windows=d1.getWindowHandles();                             //handles
			       Iterator<String> iter=windows.iterator();                                  //iterator
			       String window1=iter.next();
			       String window2=iter.next();
			       d1.switchTo().window(window2);
			       String w2=d1.getTitle();
			       System.out.println(w1);
			       System.out.println(w2);
			       System.out.println(window1);
			       System.out.println(window2);
			      
			       Thread.sleep(3000);
			       JavascriptExecutor js =(JavascriptExecutor) d1;           //scrolldownuse
			       js.executeScript("scroll(0,300)");
			       
			     
			      
			      
			       e2.colorselectphone(d1).click();
			       Thread.sleep(5000);
			       e2.addtocart(d1).click();
			       
			       Robot r3 = new Robot();                                                                 //screenshoot
			       Dimension screenshoot_size= Toolkit.getDefaultToolkit().getScreenSize();
			       Rectangle rec = new Rectangle(screenshoot_size);
			       BufferedImage Source= r3.createScreenCapture(rec);
			       File destination = new File("C:\\Users\\NITIN YADAV\\Pictures\\screen3.png");
			       //C:\Users\NITIN YADAV\Pictures
			       ImageIO.write(Source, "png", destination);
			       
			}
		 
	
	    
}
