
package com.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "localTimestamp",
    "issueTimestamp",
    "fadedRating",
    "solidRating",
    "swell",
    "wind",
    "condition",
    "charts"
})
public class Forecast implements Serializable
{

    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("localTimestamp")
    private Integer localTimestamp;
    @JsonProperty("issueTimestamp")
    private Integer issueTimestamp;
    @JsonProperty("fadedRating")
    private Integer fadedRating;
    @JsonProperty("solidRating")
    private Integer solidRating;
    @JsonProperty("swell")
    private Swell swell;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("condition")
    private Condition condition;
    @JsonProperty("charts")
    private Charts charts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6661807349371409033L;

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("localTimestamp")
    public Integer getLocalTimestamp() {
        return localTimestamp;
    }

    @JsonProperty("localTimestamp")
    public void setLocalTimestamp(Integer localTimestamp) {
        this.localTimestamp = localTimestamp;
    }

    @JsonProperty("issueTimestamp")
    public Integer getIssueTimestamp() {
        return issueTimestamp;
    }

    @JsonProperty("issueTimestamp")
    public void setIssueTimestamp(Integer issueTimestamp) {
        this.issueTimestamp = issueTimestamp;
    }

    @JsonProperty("fadedRating")
    public Integer getFadedRating() {
        return fadedRating;
    }

    @JsonProperty("fadedRating")
    public void setFadedRating(Integer fadedRating) {
        this.fadedRating = fadedRating;
    }

    @JsonProperty("solidRating")
    public Integer getSolidRating() {
        return solidRating;
    }

    @JsonProperty("solidRating")
    public void setSolidRating(Integer solidRating) {
        this.solidRating = solidRating;
    }

    @JsonProperty("swell")
    public Swell getSwell() {
        return swell;
    }

    @JsonProperty("swell")
    public void setSwell(Swell swell) {
        this.swell = swell;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("charts")
    public Charts getCharts() {
        return charts;
    }

    @JsonProperty("charts")
    public void setCharts(Charts charts) {
        this.charts = charts;
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
