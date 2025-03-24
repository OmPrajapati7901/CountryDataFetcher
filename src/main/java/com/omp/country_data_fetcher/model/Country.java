package com.omp.country_data_fetcher.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {


    private String name;
    private Translations translations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", translations=" + translations +
                '}';
    }
}
