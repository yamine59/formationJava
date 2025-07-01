package org.example;

import org.example.exception.NotFoundException;
import java.util.List;
import java.util.Objects;

public class CitySearch {
    public List<String> city;

    public List<String> search(String search)  {

        if (search.length() < 2){
            if (search.equals("*")){
                return city.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).toList();
            }

            throw new NotFoundException("City name must be at least 2 characters");
        }else {
            return city.stream().filter(c->c.toLowerCase().contains(search.toLowerCase())).map(
                    c -> c.substring(0, 1).toUpperCase() + c.substring(1)).toList();
        }

    }
}
