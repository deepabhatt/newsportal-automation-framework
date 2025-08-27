package NewsPageTest;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.DriverStatus;

import Base.TestBase;
import Pages.NewsPage;
import Data.TestData;



public class NewsPageTest extends TestBase{


	@Test
	
	public void TestbannerClick() throws InterruptedException{
	
		NewsPage n= new NewsPage(driver);
		
		TestData d=new TestData();		
		driver.get(url);
		String originalWindow=driver.getWindowHandle();		
		n.clickbanner();
		new WebDriverWait(driver,20).until(ExpectedConditions.numberOfWindowsToBe(2));
		
		for(String windowHandle:driver.getWindowHandles()) {
			if(!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
				
			}
		}
		
		Assert.assertNotSame(originalWindow,d.setBanner(n.clickbanner()), "Banner opened");
		driver.close();
	}
		
		
	public void TestHeroStoryclick()	{
		
	}


		
		
		}
		
		

		
		
		
		
	
	
	
	

		
	
	
	
	
	
	

