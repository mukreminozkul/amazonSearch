package amazon.step_definitions;
import amazon.pages.AmazonSearchPage;
import amazon.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AmazonStepDefinitions {

    AmazonSearchPage amazonSearchPage = new AmazonSearchPage();
    String step3_price;

    @Given("User is on the amazon home page")
    public void user_is_on_the_amazon_home_page() throws InterruptedException {
        Driver.getDriver("chrome").get("https://www.amazon.com/");
        Thread.sleep(1000);
    }

    @When("User searches qa testing for beginners in the search box")
    public void user_searches_qa_testing_for_beginners_in_the_search_box() {
        amazonSearchPage.amazonSearchBox.sendKeys("qa testing for beginners");
        amazonSearchPage.amazonSearchButton.click();
        step3_price = "$"+amazonSearchPage.wholePrice.getText()+"."+amazonSearchPage.partPrice.getText();
    }

    @When("User clicks the first item")
    public void user_clicks_the_first_item() {
        amazonSearchPage.firstElement.click();
    }

    @Then("User checks the price")
    public void user_checks_the_price() {
        System.out.println(amazonSearchPage.buyPrice.getText());
        Assert.assertEquals(amazonSearchPage.buyPrice.getText(), step3_price);
    }
    @Then("User clicks the checkout")
    public void user_clicks_the_checkout() {
        amazonSearchPage.addCart.click();
        Assert.assertEquals(amazonSearchPage.finalPrice.getText(), step3_price);
    }

}
