package com.ak.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherModel {

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private TemperatureModel temperatureModel = new TemperatureModel();

    @JsonProperty("weatherDetails")
    private List<WeatherDetailsModel> detailsModelList;

    public List<WeatherDetailsModel> getdetailsList() {
        return detailsModelList;
    }

    public void setdetailsList(List<WeatherDetailsModel> detailsModelList) {
        this.detailsModelList = detailsModelList;
    }

}
