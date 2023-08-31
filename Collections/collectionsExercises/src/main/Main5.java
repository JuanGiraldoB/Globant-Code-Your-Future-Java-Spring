package main;

import main.Entities.Country;
import main.Services.CountryService;

public class Main5 {
    public static void main(String[] args) {
        CountryService cs = new CountryService();

        Country country = cs.createCountry();
        Country country1 = cs.createCountry();
        Country country2 = cs.createCountry();
        cs.addCountry(country);
        cs.addCountry(country1);
        cs.addCountry(country2);

        cs.printCountries();
        cs.sortByName();
        cs.printCountries();


    }
}
