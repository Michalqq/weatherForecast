package com.ak.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TemperatureModel {

    @JsonProperty("temp")
    private Double temperature;

    @JsonProperty("pressure")
    private Integer pressure;
}
