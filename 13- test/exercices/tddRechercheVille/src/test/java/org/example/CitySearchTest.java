package org.example;

import org.example.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class CitySearchTest {
    List<String> city = List.of(
            "paris", "budapest", "skopje",
            "rotterdam", "valence", "vancouver",
            "amsterdam", "vienne", "sydney",
            "new york", "londre", "bangkok",
            "hong kong", "dubai ", "rome", "istanbul"
    );



    private CitySearch citySearch;
    @Test
    public void WhenSearch_StartMin_2_ThenResult_ThrowException(){
        citySearch = new CitySearch(city);
        Assert.assertThrows(NotFoundException.class,()-> {citySearch.search("a");});
    }
    @Test
    public void WhenSearch_minOrEquals_2_ThenResults_stringCity(){
        citySearch = new CitySearch(city);
        List<String> result = citySearch.search("pa");
        Assert.assertTrue(result.stream().toList().contains("Paris"));
    }

    @Test
    public void WhenSearchCaseInsensitive_ThenResult_stringCity(){
        citySearch = new CitySearch(city);
        List<String> result = citySearch.search("PaR");
        System.out.println(result.stream().toList());
        Assert.assertTrue(result.stream().toList().contains("Paris"));
    }
    @Test
    public void WhenSearchContainStringOfCity_ThenResult_stringCity(){
        citySearch = new CitySearch(city);
        List<String> result = citySearch.search("RIS");
        Assert.assertTrue(result.stream().toList().contains("Paris"));
    }
    @Test
    public void WhenSearchIs_All_ThenResult_stringAllCity(){
        citySearch = new CitySearch(city);
        List<String> result = citySearch.search("*");
        Assert.assertTrue(result.size()>=10);
    }

}
