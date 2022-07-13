package retrofitApi.retrofit.calls;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofitApi.retrofit.responses.postLogin.FaveQuoteResponse;

public interface RetrofitCallsHide {


    @PUT("api/quotes/{quote}/hide")
    Call<FaveQuoteResponse> hideQuote(@Header("Authorization") String authHeader, @Header("User-Token") String userToken, @Path("quote") String quote);

    @PUT("api/quotes/{quote}/unhide")
    Call<FaveQuoteResponse> unhideQuote(@Header("Authorization") String authHeader, @Header("User-Token") String userToken, @Path("quote") String quote);
}
