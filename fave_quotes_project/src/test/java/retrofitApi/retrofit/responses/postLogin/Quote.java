package retrofitApi.retrofit.responses.postLogin;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "dialogue",
        "private",
        "tags",
        "url",
        "favorites_count",
        "upvotes_count",
        "downvotes_count",
        "author",
        "author_permalink",
        "body"
})
public class Quote {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("dialogue")
    private Boolean dialogue;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("url")
    private String url;
    @JsonProperty("favorites_count")
    private Integer favoritesCount;
    @JsonProperty("upvotes_count")
    private Integer upvotesCount;
    @JsonProperty("downvotes_count")
    private Integer downvotesCount;
    @JsonProperty("author")
    private String author;
    @JsonProperty("author_permalink")
    private String authorPermalink;
    @JsonProperty("body")
    private String body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Quote() {
    }




    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("dialogue")
    public Boolean getDialogue() {
        return dialogue;
    }

    @JsonProperty("dialogue")
    public void setDialogue(Boolean dialogue) {
        this.dialogue = dialogue;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("favorites_count")
    public Integer getFavoritesCount() {
        return favoritesCount;
    }

    @JsonProperty("favorites_count")
    public void setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    @JsonProperty("upvotes_count")
    public Integer getUpvotesCount() {
        return upvotesCount;
    }

    @JsonProperty("upvotes_count")
    public void setUpvotesCount(Integer upvotesCount) {
        this.upvotesCount = upvotesCount;
    }

    @JsonProperty("downvotes_count")
    public Integer getDownvotesCount() {
        return downvotesCount;
    }

    @JsonProperty("downvotes_count")
    public void setDownvotesCount(Integer downvotesCount) {
        this.downvotesCount = downvotesCount;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("author_permalink")
    public String getAuthorPermalink() {
        return authorPermalink;
    }

    @JsonProperty("author_permalink")
    public void setAuthorPermalink(String authorPermalink) {
        this.authorPermalink = authorPermalink;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
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