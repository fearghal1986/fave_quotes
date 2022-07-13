package retrofitApi.retrofit.responses.postLogin;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "favorite",
        "upvote",
        "downvote",
        "hidden"
})

public class UserDetails {

    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("upvote")
    private Boolean upvote;
    @JsonProperty("downvote")
    private Boolean downvote;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public boolean isFavorite(){return this.favorite;}

    public boolean isHidden(){return this.hidden;}


    @JsonProperty("favorite")
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }


    @JsonProperty("upvote")
    public Boolean getUpvote() {
        return upvote;
    }

    @JsonProperty("upvote")
    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }

    @JsonProperty("downvote")
    public Boolean getDownvote() {
        return downvote;
    }

    @JsonProperty("downvote")
    public void setDownvote(Boolean downvote) {
        this.downvote = downvote;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
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