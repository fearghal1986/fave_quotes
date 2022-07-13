package retrofitApi.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

import static retrofitApi.ParametersFix.*;

public class TestBaseFix {
    // TestBaseFix Instance variables
    protected Retrofit retrofit;
    protected String baseURL;
    protected String dynamicURL;

    // TestBaseFix Constructor
    public TestBaseFix() {
        // Set SLF4J logging format
        System.setProperty("java.util.logging.SimpleFormatter.format", LOG_FORMAT);
        // Set baseURL
        baseURL = (System.getProperty("baseURL") == null) ? BASE_URL : System.getProperty("baseURL");
        // Set dynamicURL
        dynamicURL = (System.getProperty("dynamicURL") == null) ? DYNAMIC_URL : System.getProperty("dynamicURL");


    }

    // Step 1 of 2 to build Retrofit instance
    protected OkHttpClient buildOkHttpClient() {
        return new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor().setLevel(LVL_BODY))
                .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
                .readTimeout(HTTP_READ_TIMEOUT, TimeUnit.MILLISECONDS).build();
    }

    // Step 2 of 2 to build Retrofit instance
    protected Retrofit buildRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(baseURL).client(okHttpClient)
                .addConverterFactory(JacksonConverterFactory.create()).build();
    }
}
