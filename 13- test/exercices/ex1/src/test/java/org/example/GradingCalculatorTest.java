package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    @Test
    public void when_Score_95_Presence_90_Then_note_A (){
        GradingCalculator GradingCalculator = new GradingCalculator(95,90);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('A',grade);
    }
    @Test
    public void when_Score_85_Presence_90_Then_note_B (){
        GradingCalculator GradingCalculator = new GradingCalculator(85,90);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('B',grade);
    }
    @Test
    public void when_Score_65_Presence_90_Then_note_C (){
        GradingCalculator GradingCalculator = new GradingCalculator(65,90);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('C',grade);
    }
    @Test
    public void when_Score_95_Presence_65_Then_note_B (){

        GradingCalculator GradingCalculator = new GradingCalculator(95,65);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('B',grade);
    }
    @Test
    public void when_Score_95_Presence_55_Then_note_F (){
        GradingCalculator GradingCalculator = new GradingCalculator(95,55);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('F',grade);
    }
    @Test
    public void when_Score_65_Presence_55_Then_note_F (){
        GradingCalculator GradingCalculator = new GradingCalculator(65,55);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('F',grade);
    }
    @Test
    public void when_Score_50_Presence_90_Then_note_F (){
        GradingCalculator GradingCalculator = new GradingCalculator(50,90);
        char grade = GradingCalculator.getGrade();
        Assert.assertEquals('F',grade);
    }
}
