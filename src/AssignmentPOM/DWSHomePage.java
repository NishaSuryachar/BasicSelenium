package AssignmentPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage
{
     public DWSHomePage(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     @FindBy(xpath = "//div[@class='header-logo']")
     WebElement logo;
     
     @FindBy(xpath = "//a[text()='Register']")
     WebElement register;
     
     @FindBy(xpath = "//a[text()='Log in']")
     WebElement login;
     
     @FindBy(xpath = "(//a[@class='ico-cart'])[1]")
     WebElement shoppingcart;
     
     @FindBy(xpath = "//span[text()='Wishlist']")
     WebElement wishlist;
     
     @FindBy(id = "small-searchterms")
     WebElement searchfield;
     
     @FindBy(xpath = "//input[@type='submit']")
     WebElement searchbutton;
     
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
     
     @FindBy(name = "NewsletterEmail")
     WebElement newsletter;
     
     @FindBy(xpath = "(//input[@type='button'])[1]")
     WebElement subscribe;
     
     @FindBy(xpath = "//label[text()='Excellent']")
     WebElement excellent;
     
     @FindBy(xpath = "//input[@value='Vote']")
     WebElement vote;
     
     public void Logo()
     {
    	 logo.click();
     }
     public void Register()
     {
    	 register.click();
     }
     public void Login()
     {
    	 login.click();
     }
     public void ShoppingCart()
     {
    	 shoppingcart.click();
     }
     public void WishList()
     {
    	 wishlist.click();
     }
     public void SearchField(String value)
     {
    	 searchfield.sendKeys(value);
     }
     public void SearchButton()
     {
    	 searchbutton.click();
     }
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
     public void NewsLetter(String value)
     {
    	 newsletter.sendKeys(value);
     }
     public void Subscribe()
     {
    	 subscribe.click();
     }
     public void Excellent()
     {
    	 excellent.click();
     }
     public void Vote()
     {
    	 vote.click();
     }
     
}
