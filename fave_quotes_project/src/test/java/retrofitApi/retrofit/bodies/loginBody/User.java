package retrofitApi.retrofit.bodies.loginBody;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @JsonProperty("login")
    private String login;
    @JsonProperty("password")
    private String password;

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }
}