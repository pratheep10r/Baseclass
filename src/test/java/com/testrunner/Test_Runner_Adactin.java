package com.testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass_Pom_Project.Baseclass_P;

public class Test_Runner_Adactin extends Baseclass_P {
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		
		urlLaunch("https://adactinhotelapp.com/index.php");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
		sendsKeys(login, "benten11");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		sendsKeys(password, "benten");
		
		WebElement clk = driver.findElement(By.xpath("//input[@type='Submit']"));
	    clicks(clk);
		
	  //loaction
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByIndex(7);
		
		//hotel
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(3);
		
		//room
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(room);
		s2.selectByIndex(2);
		
		//room num
		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(no);
		s3.selectByIndex(2);
		
		//checkin
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("20/08/2022");
		
		//checkout
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.clear();
		checkout.sendKeys("22/08/2022");
		
		//audult
		WebElement audult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(audult);
		s4.selectByIndex(2);
		
		// child
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5=  new Select(child);
		s5.selectByIndex(2);
		
		// search
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		// continue
		driver.findElement(By.id("continue")).click();
		
		//name & address
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		sendsKeys(name,"pratheep");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
        sendsKeys(lastname, "raj");
        
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		sendsKeys(address, "nkko 7 gangaiyamman  kovil street pudhu nagar, pondicherry");
	
		// card details
		WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
        sendsKeys(credit, "8568745963556566");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
        dropdown(cardtype, "selectByIndex", "2");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		dropdown(month, "selectByIndex", "3");
		
	     WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
         dropdown(year, "selectByIndex", "3");
		 
		 WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
         sendsKeys(cvv, "345");
         
		 WebElement clk2 = driver.findElement(By.xpath("//input[@type='button']"));
          clicks(clk2);
		
	}

}
