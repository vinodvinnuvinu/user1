package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage
{
	//Declaration
	
	@FindBy(id="email") private WebElement usernameTF;
	@FindBy(id="pass") private WebElement passwordTF;
	@FindBy(name="email") private WebElement loginButton;
	@FindBy(linkText="Forgotten password") private WebElement forgotPasswordLink;
	@FindBy(linkText="create new account") private WebElement createNewAccountLink;
	@FindBy(linkText="create a page") private WebElement CreatePageLink;
	
	// Initialisation
	public FaceBookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	    // utiliasation
	
	public void setUserName(String username)
	{
		usernameTF.sendKeys(username);
	}
	public void setPassword(String password)
	{
		passwordTF.sendKeys(password);
	}
	public void clickLoginButton()
	{
		loginButton.click();;
	}
	public void ClickForgotpassword()
	{
		forgotPasswordLink.click();
	}
	public void clickcreateNewAccount()
	{
		createNewAccountLink.click();
	}
	public void createPageLink()
	{
		CreatePageLink.click();;
	}
}

