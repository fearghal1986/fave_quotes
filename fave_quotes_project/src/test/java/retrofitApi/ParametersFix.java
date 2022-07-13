package retrofitApi;

import okhttp3.logging.HttpLoggingInterceptor;

public interface ParametersFix {

    public static final String BASE_URL = "https://favqs.com/";

    public static final String DYNAMIC_URL = "https://favqs.com/";

    public static final String LOG_FORMAT = "%1$tF %1$tT %4$s %2$s %5$s%6$s%n";

    public static final Integer CONNECTION_TIMEOUT = 30000;
    public static final Integer HTTP_READ_TIMEOUT = 15000;

    public static final HttpLoggingInterceptor.Level LVL_BODY = HttpLoggingInterceptor.Level.BODY;

}
