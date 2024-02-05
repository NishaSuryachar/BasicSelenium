package AssignmentPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM
{
    public LoginPOM(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
    WebElement books;
    
    @FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
    WebElement computers;
    
    @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
    WebElement electronics;
    
    @FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
    WebElement apparelandshoes;
    
    @FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
    WebElement digitaldownloads;
    
    @FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
    WebElement jewelry;
    
    @FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
    WebElement giftcards;
    
    @FindBy(xpath = "//a[text()='Log in']")
    WebElement login;
    
    @FindBy(id = "Email")
    WebElement email;
    
    @FindBy(id = "Password")
    WebElement password;
    
    @FindBy(id = "RememberMe")
    WebElement rememberme;
    
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    WebElement loginbutton;
    
    public void Books()
    {
   	 books.click();
    }
    public void Computers()
    {
   	 computers.click();
    }
    public void Electronics()
    {
   	 electronics.click();
    }
    public void ApparelAndShoes()
    {
   	 apparelandshoes.click();
    }
    public void DigitalDownloads()
    {
   	 digitaldownloads.click();
    }
    public void Jewelry()
    {
   	 jewelry.click();
    }
    public void GiftCards()
    {
   	 giftcards.click();
    }
    public void Login()
    {
    	login.click();
    }
    public void Email(String value)
    {
   	 email.sendKeys(value);
    }
    public void Password(String value)
    {
   	  password.sendKeys(value);
    }
    public void RemenberMe()
    {
   	 rememberme.click();
    }
    public void LoginButton()
    {
   	 loginbutton.click();
    }
}
