package com.omp.country_data_fetcher.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omp.country_data_fetcher.model.Country;
import com.omp.country_data_fetcher.model.CountryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CountryService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String URL = "https://jsonmock.hackerrank.com/api/countries";

    public List<Country> getAllCountries() throws Exception  {
        CountryResponse response = restTemplate.getForObject(URL, CountryResponse.class);

//        String test = restTemplate.getForObject(URL, String.class);
//        ObjectMapper mapper = new ObjectMapper();
//        CountryResponse cr =  mapper.readValue(test, CountryResponse.class);
//        System.out.println("responce from object mapper "+ Arrays.asList(cr.getData()));
//        System.out.println(test);
        return Arrays.asList(Objects.requireNonNull(response).getData());
    }

    public Optional<Country> getCountryByName(String name) throws Exception {
        return getAllCountries().stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
