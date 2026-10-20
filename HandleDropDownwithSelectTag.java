package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownwithSelectTag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-status/");
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
        Select drpCountry=new Select(drpCountryEle);
		
		//selecting an option from the dropdown
		drpCountry.selectByVisibleText("USA");
		//or
		//drpCountry.selectByValue("4");  //only value attribute is present
		//or
		//drpCountry.selectByIndex(3);
		
		//find total options in dropdown
		List<WebElement> options=drpCountry.getOptions();
		System.out.println("total number of options:"+options.size());
		
		
		//print option in console window
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		
		//or
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			
		}
		
		//clicking  two dropdown at a time
		driver.findElement(By.xpath(""));
		
		List<WebElement> options1=driver.findElements(By.xpath(""));
		System.out.println("Total number of dropdown:"+options.size());
		
		//print all the option from dropdown
		
		
		/*for(int i=0;i<options.size();i++)
		{
			String option=options.get(i).getText();
			
			if(option.equals("Java")|| options.equals("python"))
			{
            options.get(i).click();
			}
			break;*/
		
		//or
		
		for(WebElement option:options)
		{
				String text=option.getText();
				if(text.equals("Java")|| text.equals("pythons"))
						{
					option.click();
						}
		}
	}

}
