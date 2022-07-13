package retrofitApi.retrofit.responses.postLogin;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "User-Token",
        "login",
        "email"
})
public class LoginResponse {

    @JsonProperty("User-Token")
    private String userToken;
    @JsonProperty("login")
    private String login;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginResponse() {
    }

    /**
     *
     * @param userToken
     * @param login
     * @param email
     */


    @JsonProperty("User-Token")
    public String getUserToken() {
        return userToken;
    }

    @JsonProperty("User-Token")
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}