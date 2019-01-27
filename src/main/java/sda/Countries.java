package sda;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Handler;

public class Countries {

//    private Set<String> countries = new HashSet<String>();
//
//    public void addCountry(String name) {
//        if (countries.contains(name)) {
//            System.out.println("ten kraj juz istnieje");
//        } else {
//            countries.add(name);
//        }
//    }
//
//    public Set<String> getAllCountries() {
//        return countries;
//    }
//
//    public void removeCountry(String name) {
//        if (countries.contains(name)) {
//            countries.remove(name);
//        } else {
//            System.out.println("Nie ma takiego kraju");
//        }
//
//    }
//
//    public void updateCountry(String oldCountry, String newCountry) {
//        if (countries.contains(oldCountry)) {
//            countries.remove(oldCountry);
//            countries.add(newCountry);
//
//        }
//    }

        private Set<Country> countries = new HashSet<Country>();

    public void addCountry(Country name) {
        if (countries.contains(name)) {
            System.out.println("ten kraj juz istnieje");
        } else {
            countries.add(name);
        }
    }

    public Set<Country> getAllCountries() {
        return countries;
    }

    public void removeCountry(String name) {
        if (countries.contains(name)) {
            countries.remove(name);
        } else {
            System.out.println("Nie ma takiego kraju");
        }


    }

    public void updateCountry(Country oldCountry, Country newCountry) {
        if (countries.contains(oldCountry)) {
            countries.remove(oldCountry);
            countries.add(newCountry);

        }
    }


    public Set<Country> getCountry()

}
