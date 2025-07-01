package org.example;

import org.example.exception.NotFoundException;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CitySearchTest {
    private CitySearch citySearch;

    @BeforeEach
    public void setUp() {
        List<String> city = List.of(
                "paris", "budapest", "skopje",
                "rotterdam", "valence", "vancouver",
                "amsterdam", "vienne", "sydney",
                "new york", "londre", "bangkok",
                "hong kong", "dubai ", "rome", "istanbul"
        );
        citySearch = new CitySearch();
        citySearch.city = city;
    }

    @Test
    public void WhenSearch_StartMin_2_ThenResult_ThrowException(){
        Assertions.assertThrows(NotFoundException.class,()-> citySearch.search("a"));
    }

    @Test
    public void WhenSearch_minOrEquals_2_ThenResults_stringCity(){
        List<String> result = citySearch.search("pa");
        List<String> expected = List.of("Paris");
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void WhenSearchCaseInsensitive_ThenResult_stringCity(){
        List<String> result = citySearch.search("PaR");
        System.out.println(result.stream().toList());
        Assertions.assertTrue(result.stream().toList().contains("Paris"));
    }

    @Test
    public void WhenSearchContainStringOfCity_ThenResult_stringCity(){
        List<String> result = citySearch.search("RIS");
        Assertions.assertTrue(result.stream().toList().contains("Paris"));
    }

    @Test
    public void WhenSearchIs_All_ThenResult_stringAllCity(){
        List<String> result = citySearch.search("*");
        Assertions.assertTrue(result.size()>=10);
    }

}
