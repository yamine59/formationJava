package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    public GradingCalculator gradingCalculator;

    @Test
    public void when_Score_95_Presence_90_Then_note_A (){
        Assert.assertEquals('A',new GradingCalculator(95,90).getGrade());
    }
    @Test
    public void when_Score_85_Presence_90_Then_note_A (){
        Assert.assertEquals('B',new GradingCalculator(85,90).getGrade());
    }
    @Test
    public void when_Score_65_Presence_90_Then_note_A (){
        Assert.assertEquals('C',new GradingCalculator(65,90).getGrade());
    }
    @Test
    public void when_Score_95_Presence_65_Then_note_A (){
        Assert.assertEquals('B',new GradingCalculator(95,65).getGrade());
    }
    @Test
    public void when_Score_95_Presence_55_Then_note_A (){
        Assert.assertEquals('F',new GradingCalculator(95,55).getGrade());
    }
    @Test
    public void when_Score_65_Presence_55_Then_note_A (){
        Assert.assertEquals('F',new GradingCalculator(65,55).getGrade());
    }
    @Test
    public void when_Score_50_Presence_90_Then_note_A (){
        Assert.assertEquals('F',new GradingCalculator(50,90).getGrade());
    }
}
