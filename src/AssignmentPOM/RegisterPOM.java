package AssignmentPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM 
{
    public RegisterPOM(WebDriver driver)
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
    
    @FindBy(xpath = "//a[text()='Register']")
    WebElement register;
    
    @FindBy(name="Gender")
    WebElement female;
    
    @FindBy(name="FirstName")
    WebElement firstname;
    
    @FindBy(name="LastName")
    WebElement lastname;
    
    @FindBy(name="Email")
    WebElement email;
    
    @FindBy(name="Password")
    WebElement password;
    
    @FindBy(name="ConfirmPassword")
    WebElement confirmationpassword;
    
    @FindBy(id="register-button")
    WebElement registerbutton;
    
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
    public void Register()
    {
   	 register.click();
    }
    public void Female()
    {
   	 female.click();
    }
    public void FirstName(String value)
    {
   	 firstname.sendKeys(value);
    }
    public void LastName(String value)
    {
   	 lastname.sendKeys(value);
    }
    public void Email(String value)
    {
   	 email.sendKeys(value);
    }
    public void Password(String value)
    {
   	 password.sendKeys(value);
    }
    public void ConfirmationPassword(String value)
    {
   	 confirmationpassword.sendKeys(value);
    }
    public void RegisterButton()
    {
   	 registerbutton.click();
    }
}

