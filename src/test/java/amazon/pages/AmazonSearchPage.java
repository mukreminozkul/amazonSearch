package amazon.pages;

import amazon.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPage {
    public AmazonSearchPage(){
        PageFactory.initElements(Driver.getDriver("chrome"), this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement amazonSearchBox;

    @FindBy(id = "nav-search-submit-text")
    public WebElement amazonSearchButton;

    @FindBy(xpath = "//span[@class='a-price-whole']")
    public WebElement wholePrice;

    @FindBy(xpath = "//span[@class='a-price-fraction']")
    public WebElement partPrice;

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-fixed-height']")
    public WebElement firstElement;

    @FindBy(xpath = "//span[@id='newBuyBoxPrice']")
    public WebElement buyPrice;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addCart;

    @FindBy(xpath = "//span[@class='a-color-price hlb-price a-inline-block a-text-bold']")
    public WebElement finalPrice;

}
