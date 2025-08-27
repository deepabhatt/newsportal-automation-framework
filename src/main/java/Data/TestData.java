package Data;

import Pages.NewsPage;
import org.openqa.selenium.WebElement;


public class TestData {
	
	protected String banner;
	protected String ExpectedHerostory;
	
	
	public String getBanner() {
		return banner;
		
	}
	
	public String setBanner(String banner) {
		banner=this.banner;
		return banner;
	
	}
	
	public String getHerostory() {
		return ExpectedHerostory;
	
}
	
	public void setHeroStory(String ExpectedHerostory) {
		this.ExpectedHerostory=ExpectedHerostory;
	}
}
