package retrofitApi.retrofit.responses.postLogin;
import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "page",
        "last_page",
        "quotes"
})
public class ListQuoteResponse {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("last_page")
    private Boolean lastPage;
    @SerializedName("quotes")
    private List<Quote> quotes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public ListQuoteResponse() {
    }

    /**
     *
     * @param lastPage
     * @param page
     * @param quotes
     */
    public ListQuoteResponse(Integer page, Boolean lastPage, List<Quote> quotes) {
        super();
        this.page = page;
        this.lastPage = lastPage;
        this.quotes = quotes;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("last_page")
    public Boolean getLastPage() {
        return lastPage;
    }

    @JsonProperty("last_page")
    public void setLastPage(Boolean lastPage) {
        this.lastPage = lastPage;
    }

    @JsonProperty("quotes")
    public List<Quote> getQuotes() {
        return quotes;
    }

    @JsonProperty("quotes")
    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
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