package com.omp.country_data_fetcher.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryResponse {
    private Country[] data;

    public Country[] getData() {
        return data;
    }

    public void setData(Country[] data) {
        this.data = data;
    }
}
