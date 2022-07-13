package retrofitApi.retrofit.bodies.loginBody;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "user"
})
public class LoginCredentialsBody {

    @JsonProperty("user")
    private User user;

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }
}