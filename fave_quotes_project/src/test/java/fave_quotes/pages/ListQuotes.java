package fave_quotes.pages;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofitApi.retrofit.TestBaseFix;
import retrofitApi.retrofit.calls.RetroFitQuoteList;
import retrofitApi.retrofit.responses.postLogin.ListQuoteResponse;
import retrofitApi.retrofit.responses.postLogin.Quote;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

//All calls check for 200 response
public class ListQuotes extends TestBaseFix {

    Retrofit retrofit = super.buildRetrofit(super.buildOkHttpClient());
    RetroFitQuoteList quoteB = retrofit.create(RetroFitQuoteList.class);
    FaveQuotes faveq = new FaveQuotes();

    private Response<ListQuoteResponse> quoteBody;
    private Response<Quote> quoteResponseBody;

    //Checking hos many objects are returned when the quotes
    public Integer numberOfQuotesMatch() throws IOException {

        quoteBody = quoteB.listQuote("Token token=b6c7f04308b80ae617fc03c105ba9213").execute();
        assertEquals(200, quoteBody.code());
        //Count the number of json elements
        Integer quoteNUm = quoteBody.body().getQuotes().size();
        return quoteNUm;

    }

    public String doAllQuotesContain(String filter) throws IOException {

        quoteBody = quoteB.listFilter("Token token=b6c7f04308b80ae617fc03c105ba9213", filter).execute();
        assertEquals(200, quoteBody.code());
        String ar = quoteBody.body().getQuotes().toArray().toString();
        System.out.println("array" + ar);
        return ar;
        //Integer quoteBody.body().getQuotes();

    }
    public Integer doAllQuotesContain(String filter,String type) throws IOException {

        quoteBody = quoteB.listFilterType("Token token=b6c7f04308b80ae617fc03c105ba9213", filter,type).execute();
        assertEquals(200, quoteBody.code());
        Integer quoteNUm = quoteBody.body().getQuotes().size();
        return quoteNUm;
        //Integer quoteBody.body().getQuotes();

    }

    public Integer areAllHiddenQuotesListed(String username, String password, String filter) throws Exception {

        quoteBody = quoteB.listHidden("Token token=b6c7f04308b80ae617fc03c105ba9213", faveq.LoginApi( username,  password), filter).execute();
        assertEquals(200, quoteBody.code());
        //Using a try catch as the empty json returns a null pointer exception
        try {
            Integer quoteNUm = quoteBody.body().getQuotes().size();
            return quoteNUm;
        }catch (NullPointerException e){
            return 0;
        }

    }

}

