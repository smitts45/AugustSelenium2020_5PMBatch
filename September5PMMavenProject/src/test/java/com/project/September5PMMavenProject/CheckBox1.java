package com.project.September5PMMavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class CheckBox1 extends BaseTest
{
  
	@BeforeMethod
	@Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		init();
		test = report.startTest("CheckBox1");
		test.log(LogStatus.INFO, "Initilizing properties files....");
				
		launch(bType);
		test.log(LogStatus.INFO, "Launching browser :- " + dp.getProperty("chromebrowser"));
		
		navigateUrl("checkboxurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + childProp.getProperty("checkboxurl") );	
	  }
	  
	  
	@Test
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	 driver.quit();
	 
	 report.endTest(test);
	 report.flush();
  }

}
