
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
    "pressure",
    "temperature",
    "weather",
    "unitPressure",
    "unit"
})
public class Condition implements Serializable
{

    @JsonProperty("pressure")
    private Integer pressure;
    @JsonProperty("temperature")
    private Integer temperature;
    @JsonProperty("weather")
    private String weather;
    @JsonProperty("unitPressure")
    private String unitPressure;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8476747383428201783L;

    @JsonProperty("pressure")
    public Integer getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("temperature")
    public Integer getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("weather")
    public String getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(String weather) {
        this.weather = weather;
    }

    @JsonProperty("unitPressure")
    public String getUnitPressure() {
        return unitPressure;
    }

    @JsonProperty("unitPressure")
    public void setUnitPressure(String unitPressure) {
        this.unitPressure = unitPressure;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
