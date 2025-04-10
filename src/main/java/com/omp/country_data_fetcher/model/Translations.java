package com.omp.country_data_fetcher.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Translations {

    private String de;
    private String es;
    private String fr;
    private String it;
    private String ja;
    private String nl;
    private String hr;

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    @Override
    public String toString() {
        return "Translations{" +
                "de='" + de + '\'' +
                ", es='" + es + '\'' +
                ", fr='" + fr + '\'' +
                ", it='" + it + '\'' +
                ", ja='" + ja + '\'' +
                ", nl='" + nl + '\'' +
                ", hr='" + hr + '\'' +
                '}';
    }
}
