package main.Services;

import main.Entities.Country;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class CountryService {

    HashSet<Country> countries;
    Scanner scan;

    public CountryService(){
        this.countries = new HashSet<>();
        this.scan = new Scanner(System.in);
    }

    public Country createCountry() {
        System.out.print("Country: ");
        String countryName = scan.next();

        return new Country(countryName);
    }

    public void addCountry(Country country) {
        this.countries.add(country);
    }

    public void printCountries() {
        countries.forEach((country) -> System.out.println(country));
    }

    public void sortByName() {
        ArrayList<Country> c = new ArrayList<>(countries);

        c.sort(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
