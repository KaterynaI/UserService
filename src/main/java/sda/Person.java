package sda;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String imie;
    private String nazwisko;
    private LocalDate birthday;



    Person(String imie, String nazwisko, LocalDate birthday) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.birthday = birthday;
    }

    public String getImie() {
        return imie;
    }

    public boolean isAdult() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears() >= 18;


//        if (period.getYears()>=18){
//            return true;
//        }else {
//            return false;
//        }




    }
}



