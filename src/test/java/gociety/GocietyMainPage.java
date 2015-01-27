package gociety;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GocietyMainPage {
	private static final String MAIN_PAGE = "http://adventure.gociety.com/#!pageMain";
	
@FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/select")
private WebElement selectActivity;
	
	
	public WebElement getSelectActivity() {
	return selectActivity;
}

	private WebDriver driver;

	public GocietyMainPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	public List<WebElement> getOptions(){
		
		List<WebElement> options= selectActivity.findElements(By.name("sport"));
		return options;
		
		
	}


	public static String getMainPage() {
		
		return MAIN_PAGE;
	}
}
