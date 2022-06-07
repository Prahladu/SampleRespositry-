package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	 public WebDriver driver;
	
	@FindBy(xpath ="//*[@id='userID']")
	// @FindBy(id = "userID")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(tagName = "button")
	WebElement submitbtn;
	
	@FindBy(xpath = "//div[@class='nav-link ng-binding']")
	WebElement welcometext;
	
	@FindBy(xpath = "//span[@ng-click='signOut()']//span")
	WebElement signoffbtn;
  
    
    public LoginPage(WebDriver mydriver){
    	driver = mydriver;
    	PageFactory.initElements(mydriver,this);
    }

	public void setUserName(String uname)
    {
    	username.clear();
    	username.sendKeys(uname);
    	
    }
    public void setpassword(String pwd)
    {
    	
    	password.sendKeys(pwd);
    	
    }
    public void clickSubmit()
    {
    	
    	submitbtn.click();
    	
    }
    public String comapreWelcomeText()
    {
    	return welcometext.getText();
    	
    	
    }
    public void clicksignoff()
    {
    	
    	signoffbtn.click();
    	
    }

}


