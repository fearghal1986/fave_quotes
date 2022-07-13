package retrofitApi.retrofit.calls;

import retrofit2.Call;
import retrofit2.http.*;
import retrofitApi.retrofit.responses.postLogin.ListQuoteResponse;

public interface RetroFitQuoteList {


    @Headers("Content-type:application/json")

    @GET("api/quotes")
    Call<ListQuoteResponse> listQuote(@Header("Authorization") String authHeader);

    @GET("api/quotes/")
    Call<ListQuoteResponse> listFilter(@Header("Authorization") String authHeader, @Query("filter") String filter);

    @GET("api/quotes/")
    Call<ListQuoteResponse> listFilterType(@Header("Authorization") String authHeader, @Query("filter") String filter, @Query("type") String tag);

    @GET("api/quotes/")
    Call<ListQuoteResponse> listHidden(@Header("Authorization") String authHeader, @Header("User-Token") String userToken,@Query("hidden") String filter);
}
