
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
    "absMinBreakingHeight",
    "absMaxBreakingHeight",
    "probability",
    "unit",
    "minBreakingHeight",
    "maxBreakingHeight",
    "components"
})
public class Swell implements Serializable
{

    @JsonProperty("absMinBreakingHeight")
    private Double absMinBreakingHeight;
    @JsonProperty("absMaxBreakingHeight")
    private Double absMaxBreakingHeight;
    @JsonProperty("probability")
    private Integer probability;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("minBreakingHeight")
    private Double minBreakingHeight;
    @JsonProperty("maxBreakingHeight")
    private Double maxBreakingHeight;
    @JsonProperty("components")
    private Components components;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3154996102002322264L;

    @JsonProperty("absMinBreakingHeight")
    public Double getAbsMinBreakingHeight() {
        return absMinBreakingHeight;
    }

    @JsonProperty("absMinBreakingHeight")
    public void setAbsMinBreakingHeight(Double absMinBreakingHeight) {
        this.absMinBreakingHeight = absMinBreakingHeight;
    }

    @JsonProperty("absMaxBreakingHeight")
    public Double getAbsMaxBreakingHeight() {
        return absMaxBreakingHeight;
    }

    @JsonProperty("absMaxBreakingHeight")
    public void setAbsMaxBreakingHeight(Double absMaxBreakingHeight) {
        this.absMaxBreakingHeight = absMaxBreakingHeight;
    }

    @JsonProperty("probability")
    public Integer getProbability() {
        return probability;
    }

    @JsonProperty("probability")
    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("minBreakingHeight")
    public Double getMinBreakingHeight() {
        return minBreakingHeight;
    }

    @JsonProperty("minBreakingHeight")
    public void setMinBreakingHeight(Double minBreakingHeight) {
        this.minBreakingHeight = minBreakingHeight;
    }

    @JsonProperty("maxBreakingHeight")
    public Double getMaxBreakingHeight() {
        return maxBreakingHeight;
    }

    @JsonProperty("maxBreakingHeight")
    public void setMaxBreakingHeight(Double maxBreakingHeight) {
        this.maxBreakingHeight = maxBreakingHeight;
    }

    @JsonProperty("components")
    public Components getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(Components components) {
        this.components = components;
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
