package com.omp.country_data_fetcher.controller;

import com.omp.country_data_fetcher.model.Country;
import com.omp.country_data_fetcher.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/endpoint")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public ResponseEntity<?> getCountries(@RequestParam(value = "name", required = false) String name) throws Exception {
        if (name != null) {
            Optional<Country> country = countryService.getCountryByName(name);
            if (country.isPresent()) {
                Map<String, Object> result = new HashMap<>();
                result.put("name", country.get().getName());
                result.put("translations", country.get().getTranslations());
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country not found");
            }
        }
        return ResponseEntity.ok(countryService.getAllCountries());
    }
}
