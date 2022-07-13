package retrofitApi.retrofit.calls;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofitApi.retrofit.bodies.loginBody.LoginCredentialsBody;
import retrofitApi.retrofit.responses.postLogin.LoginResponse;


public interface RetrofitCallsLogin {

    @Headers("Content-type:application/json")

    @POST("api/session")
    Call<LoginResponse> postLogin(@Body LoginCredentialsBody body, @Header("Authorization") String authHeader);



}

