package retrofitApi.retrofit.calls;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofitApi.retrofit.responses.postLogin.FaveQuoteErrorResponse;
import retrofitApi.retrofit.responses.postLogin.FaveQuoteResponse;

public interface RetrofitFavouriteQuote {

    @Headers("Content-type:application/json")

    @PUT("api/quotes/{quote}/fav")
    Call<FaveQuoteResponse> faveQuote(@Header("Authorization") String authHeader, @Header("User-Token") String userToken, @Path("quote") String quote);

    @PUT("api/quotes/{quote}/unfav")
    Call<FaveQuoteResponse> unfaveQuote(@Header("Authorization") String authHeader, @Header("User-Token") String userToken, @Path("quote") String quote);

    @PUT("api/quotes/{quote}/fav")
    Call<FaveQuoteErrorResponse> faveQuoteError(@Header("Authorization") String authHeader, @Header("User-Token") String userToken, @Path("quote") String quote);

}
