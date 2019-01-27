package sda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

    private Map<Integer, Person> listaOsob = new HashMap<>();
    private static Integer id = 0;


    private  void addUser(Person person){
        listaOsob.put(id,person);
        id++;
    }




}

