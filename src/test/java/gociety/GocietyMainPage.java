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
//@FindBy(className="gspn3")
	private WebElement selectActivity;
	
@FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/select")
private WebElement orderBySelect;

@FindBy(xpath="/html/body/div[6]/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div/a")
//@FindBy(className="select2-container")
private WebElement imputLocation;



@FindBy(css="html body#body div#select2-drop.select2-drop.select2-with-searchbox.select2-drop-active div.select2-search input.select2-input")
private WebElement imputLocationsendKey;

@FindBy(css="html body#body div#select2-drop.select2-drop.select2-with-searchbox.select2-drop-active ul.select2-results")
private WebElement searchResult;



	public WebElement getSearchResult() {
	return searchResult;
}


	public WebElement getImputLocationsendKey() {
	return imputLocationsendKey;
}


	public WebElement getImputLocation() {
	return imputLocation;
}


	public WebElement getOrderBySelect() {
	return orderBySelect;
}


	public WebElement getSelectActivity() {
	return selectActivity;
}

	private WebDriver driver;

	public GocietyMainPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	public List<WebElement> getOptions(){
		
		List<WebElement> options= selectActivity.findElements(By.tagName("option"));
				
		return options;	
	}
public List<WebElement> getOptionsOrderBy(){
		
		List<WebElement> options= orderBySelect.findElements(By.tagName("option"));	
		return options;
		
}
public List<WebElement> getSerachResult(){
	
	List<WebElement> res= searchResult.findElements(By.tagName("li"));	
	return res;
}


	public static String getMainPage() {
		
		return MAIN_PAGE;
	}
}
