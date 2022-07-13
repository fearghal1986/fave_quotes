package fave_quotes.steps;
//

import fave_quotes.pages.FaveQuotes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginApiStepDefinition {

    FaveQuotes fq = new FaveQuotes();

    @And("I login with {string} and {string} to return login token")
    public void iLoginWithAndToReturnLoginToken(String username, String password) throws Exception {

        fq.LoginApi(username, password);

    }

    @Then("I login to Fav Quote with {string} and {string}")
    public void iLoginQuoteWithAnd(String username, String password) throws Exception {

        fq.LoginApi(username,password);

    }

    @And("favourite quote {string}")
    public void favouriteQuote(String quoteID) throws Exception {

        Assert.assertTrue(fq.isFaveDisplayed(quoteID));

    }

    @And("unfavourite quote {string}")
    public void unfavouriteQuote(String quoteID) throws Exception {

        Assert.assertFalse(fq.isFaveNotDisplayed(quoteID));

    }

    @When("favourite quote {string} error code 404 is displayed")
    public void favouriteQuoteErrorCodeAndErrorMessageIsDisplayed(String quoteID ) throws Exception {

        Assert.assertTrue(fq.isErrorCodeDisplayed(quoteID));

    }

}