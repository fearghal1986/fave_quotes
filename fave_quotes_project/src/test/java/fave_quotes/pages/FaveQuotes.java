package fave_quotes.pages;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofitApi.retrofit.TestBaseFix;
import retrofitApi.retrofit.bodies.loginBody.LoginCredentialsBody;
import retrofitApi.retrofit.bodies.loginBody.User;
import retrofitApi.retrofit.calls.RetrofitCallsHide;
import retrofitApi.retrofit.calls.RetrofitCallsLogin;
import retrofitApi.retrofit.calls.RetrofitFavouriteQuote;
import retrofitApi.retrofit.responses.postLogin.FaveQuoteErrorResponse;
import retrofitApi.retrofit.responses.postLogin.FaveQuoteResponse;

import static org.junit.Assert.assertEquals;

//All calls check for 200 response
public class FaveQuotes extends TestBaseFix {
    //Retro fit call pages
    Retrofit retrofit = super.buildRetrofit(super.buildOkHttpClient());
    RetrofitCallsLogin call = retrofit.create(RetrofitCallsLogin.class);
    RetrofitFavouriteQuote fave = retrofit.create(RetrofitFavouriteQuote.class);
    RetrofitCallsHide hid = retrofit.create(RetrofitCallsHide.class);

    //response bodies
    private Response<retrofitApi.retrofit.responses.postLogin.LoginResponse> responseBody;
    private Response<FaveQuoteResponse> faveBody;

    private static String token;

    //Login with parameters for username and password
    public String LoginApi(String username, String password) throws Exception {

        LoginCredentialsBody log = new LoginCredentialsBody();
        User login = new User();
        login.setLogin(username);
        login.setPassword(password);
        log.setUser(login);

        responseBody = call.postLogin(log,"Token token=b6c7f04308b80ae617fc03c105ba9213").execute();
        assertEquals(200, responseBody.code());
        token = responseBody.body().getUserToken();
        return token;
    }

    public boolean isFaveDisplayed(String quoteID) throws Exception {
        faveBody = fave.faveQuote("Token token=b6c7f04308b80ae617fc03c105ba9213",LoginApi("Fearghal","Feargha1!"),quoteID).execute();
        assertEquals(200, faveBody.code());
        //return boolean and assert in the step definition
        //Check if the isFavorite boolean =true
        return faveBody.body().getUserDetails().isFavorite();

    }

    public boolean isFaveNotDisplayed(String quoteID) throws Exception {
        faveBody = fave.unfaveQuote("Token token=b6c7f04308b80ae617fc03c105ba9213",LoginApi("Fearghal","Feargha1!"),quoteID).execute();
        assertEquals(200, faveBody.code());
        //return boolean and assert in the step definition
        return faveBody.body().getUserDetails().isFavorite();

    }
    public boolean isErrorCodeDisplayed(String quoteID) throws Exception {

        Response<FaveQuoteErrorResponse> errorResponseResponseBody = fave.faveQuoteError("Token token=b6c7f04308b80ae617fc03c105ba9213", LoginApi("Fearghal", "Feargha1!"), quoteID).execute();
        //Check if the response code is 404
        assertEquals(404, errorResponseResponseBody.code());
        return true;
    }

    public boolean isHiddenDisplayed(String quoteID) throws Exception {
        faveBody = hid.hideQuote("Token token=b6c7f04308b80ae617fc03c105ba9213",LoginApi("Fearghal","Feargha1!"),quoteID).execute();        assertEquals(200, faveBody.code());
        assertEquals(200, faveBody.code());
        return faveBody.body().getUserDetails().isHidden();

    }
    public boolean isUnHiddenDisplayed(String quoteID) throws Exception {
        faveBody = hid.unhideQuote("Token token=b6c7f04308b80ae617fc03c105ba9213",LoginApi("Fearghal","Feargha1!"),quoteID).execute();
        assertEquals(200, faveBody.code());
        return faveBody.body().getUserDetails().isHidden();

    }
}
