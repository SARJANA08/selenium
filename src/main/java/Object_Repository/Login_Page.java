package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	@FindBy(id="username")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passWordEdt;
	
	@FindBy(xpath = "//div[text()='Login ']")

	private WebElement loginBtn;

	

	public Login_Page(WebDriver driver)

	{

		PageFactory.initElements(driver, this);

	}

 

	public WebElement getUserNameEdt() {

		return userNameEdt;

	}

 

	public WebElement getPassWordEdt() {

		return passWordEdt;

	}

 

	public WebElement getLoginBtn() {

		return loginBtn;

	}

	

	public void loginToApp(String USERNAME, String PASSWORD)

	{

		userNameEdt.sendKeys(USERNAME);

		passWordEdt.sendKeys(PASSWORD);

		loginBtn.click();

	}

}
	
	


