package fave_quotes.steps;

import fave_quotes.pages.FaveQuotes;
import fave_quotes.pages.ListQuotes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class ListQuoteStepDefinition {

    ListQuotes qu = new ListQuotes();
    FaveQuotes quo = new FaveQuotes();

    @Then("number of quotes equals {int}")
    public void numberOfQuotesEquals(int quote) throws IOException {

        Assert.assertEquals( quote,(int) qu.numberOfQuotesMatch());

    }

    @Then("all quotes returned contain {string} are listed as {int}")
    public void allQuotesReturnedContainAreListedAs(String filter, int quote) throws IOException {

        qu.doAllQuotesContain(filter);

    }

    @Then("all quotes with the {string} {string} are listed as {int}")
    public void allQuotesWithTheAreListedAs(String filter, String type, int amount) throws IOException {

        Assert.assertEquals(amount,(int)qu.doAllQuotesContain(filter,type));
    }

    @When("quote {string} is marked as hidden")
    public void quoteIsMarkedAsHidden(String quote) throws Exception {

        Assert.assertTrue(quo.isHiddenDisplayed(quote));
    }



    @When("quote {string} is marked as unhidden")
    public void quoteIsMarkedAsUnhidden(String quote) throws Exception {

        Assert.assertFalse(quo.isUnHiddenDisplayed(quote));

    }

    @And("for username {string} with password {string} all hidden quotes {string} are listed as {int}")
    public void forUsernameWithPasswordAllHiddenQuotesAreListedAs(String username, String password, String num, int amount) throws Exception {

        Assert.assertEquals(amount,(int)qu.areAllHiddenQuotesListed(username,password,num));

    }
}
