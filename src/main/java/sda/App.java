package sda;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        User user = new User();
//        user.setImie("Katia");
//        user.setNazwisko("Iaroshovets");
//        user.setHaslo("Kokos");
//        user.setLogin("KaterynaI");

//
//        UserService service  = new UserService();
//
//        User user = new User();
//        user.setImie("Katia");
//        user.setNazwisko("Iaroshovets");
//        user.setHaslo("Kokos");
//        user.setLogin("KaterynaI");
//
//        service.addUser(user);
//        service.printAll();
//


//        ArrayList <String> ListaOsob = new ArrayList<>();
//         ListaOsob.add("Janusz");
//        ListaOsob.add("Jacek");
//        ListaOsob.add("Katia");
//        ListaOsob.add("Kinga");
//
//        for (String name: ListaOsob){
//            System.out.println(name);
//        }
//        ArrayList<Integer> NumerOsob = new ArrayList<>();
//
//        NumerOsob.add(1);
//        NumerOsob.add(2);
//        NumerOsob.add(3);
//        NumerOsob.add(4);
//
//        for (int i :NumerOsob){
//            System.out.println(i);
//        }

//
//        UserService ekipka = new UserService();
//        ekipka.addUser(new User("ela", "malysz", "e.malysz", "skoczek"));
//        ekipka.printAll();
//    }


//        Dictionary engDictionary = new Dictionary();
//
//        engDictionary.addTranslation("pilka","ball");
//        engDictionary.addTranslation("mleko","milk");
//        engDictionary.addTranslation("lalka", "doll");
//        engDictionary.addTranslation("kot","cat");
//
//
//        System.out.println(engDictionary.getTranslation("pilka"));
//


//
//        Dictionary engDictionary = new Dictionary();
//        List<String> ballTranslation = new ArrayList<>();
//
//        ballTranslation.add("ball");
//        ballTranslation.add("ball1");
//        ballTranslation.add("ball2");
//        ballTranslation.add("ball3");
//
//
//        engDictionary.addTranslation("pilk", ballTranslation);
//        engDictionary.addTranslation("mleko", Arrays.asList("Laptop","compuer","casdasdf"));
//
//
//
//        System.out.println(engDictionary.getTranslation("mleko" ));
////
//
//
//        System.out.println("korzen pil:" + engDictionary.Szukam("p"));
//

//        Person person = new Person("Jan","Kowalski", LocalDate.parse("2008-06-20")){};
//
//        Map<Integer,String> persons = new HashMap<>();
//        persons.put(1222222, "Katia");
//        persons.put(7777777, "Aniata");
//        persons.put(9999999,"Lukasz");


//        System.out.println( persons.get(1222222));
//
//        for (Integer key: persons.keySet()){
//            System.out.println(key + "=" + persons.get(key));
//        }

//        String returne_value = (String)persons.remove(1222222);
//        System.out.println("usuwam:" + " " + returne_value);
//        System.out.println("nowa mapa:" + " " + persons);


//        System.out.println(person.isAdult());



        Countries countries = new Countries();

        countries.addCountry("Ukraine");
        countries.addCountry("Poooolska");
        countries.addCountry("Anglia");
        countries.addCountry("Grecja");


        System.out.println(countries.getAllCountries());

            countries.removeCountry("Polska");


        System.out.println(countries.getAllCountries());


        countries.updateCountry("Poooolska", "Polska");
        System.out.println(countries.getAllCountries());

    }



}
