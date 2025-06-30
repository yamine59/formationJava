package org.example;

import org.example.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class CitySearchTest {

    private CitySearch citySearch;
    @Test
    public void WhenSearch_StartMin_2_ThenResult_ThrowException(){
        citySearch = new CitySearch();
        Assert.assertThrows(NotFoundException.class,()-> {citySearch.search("a");});
    }
    @Test
    public void WhenSearch_minOrEquals_2_ThenResults_stringCity(){
        citySearch = new CitySearch();
        List<String> result = citySearch.search("pa");
        Assert.assertTrue(result.stream().toList().contains("Paris"));
    }
    @Test
    public void WhenSearchCaseInsensitive_ThenResult_stringCity(){
        citySearch = new CitySearch();
        List<String> result = citySearch.search("PaR");
        System.out.println(result.stream().toList());
        Assert.assertTrue(result.stream().toList().contains("Paris"));
    }
    @Test
    public void WhenSearchContainStringOfCity_ThenResult_stringCity(){
        citySearch = new CitySearch();
        List<String> result = citySearch.search("RIS");
        Assert.assertTrue(result.stream().toList().contains("Paris"));
    }
    @Test
    public void WhenSearchIs_All_ThenResult_stringAllCity(){
        citySearch = new CitySearch();
        List<String> result = citySearch.search("*");
        Assert.assertTrue(result.size()>=10);
    }

}
