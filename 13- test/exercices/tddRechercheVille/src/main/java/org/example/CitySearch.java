package org.example;

import jdk.jshell.spi.ExecutionControl;
import org.example.exception.NotFoundException;
import org.example.exception.NotImplementedException;

import java.util.List;
import java.util.Objects;

public class CitySearch {
    List<String> city = List.of(
            "paris", "budapest", "skopje",
            "rotterdam", "valence", "vancouver",
            "amsterdam", "vienne", "sydney",
            "new york", "londres", "bangkok",
            "hong kong", "duba ", "rome", "istanbul"
    );
    public List<String> search(String search)  {
        if (Objects.equals(search, "*")){
            return city.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).toList();
        }
        String searchGET =  search.toLowerCase();
        System.out.println(searchGET);

        if (searchGET.length()<2){
            throw new NotFoundException("City name must be at least 2 characters");
        }else {
            return city.stream().filter(t->t.contains(searchGET)).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).toList();
        }

    }
}
