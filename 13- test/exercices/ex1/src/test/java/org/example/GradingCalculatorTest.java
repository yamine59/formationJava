package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GradingCalculatorTest {
    private GradingCalculator gradingCalculator;

//    @ParameterizedTest
//    @MethodSource("providerParameters")
//    public void whenScoreAndPresenceThenResultAwaitGrade(int score , int presence,char awaitedGrade){
//        gradingCalculator = new GradingCalculator(score,presence);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals(awaitedGrade,grade);
//    }
//
//    private static Stream<Arguments> providerParameters() {
//        return Stream.of(
//                Arguments.of(95,90,'A'),
//                Arguments.of(85,90,'B'),
//                Arguments.of(65,90,'C'),
//                Arguments.of(95,65,'B'),
//                Arguments.of(95,55,'F'),
//                Arguments.of(65,55,'F'),
//                Arguments.of(50,90,'F')
//        );
//    }

    @ParameterizedTest
    @CsvSource({
            "95,90,A",
            "85,90,B",
            "65,90,C",
            "95,65,B",
            "95,55,F",
            "65,55,F",
            "50,90,F",
    })
    public void whenScoreAndPresenceThenResultAwaitGrade(int score , int presence,char awaitedGrade){
        gradingCalculator = new GradingCalculator(score,presence);
        char grade = gradingCalculator.getGrade();
        Assert.assertEquals(awaitedGrade,grade);
    }


//    @Test
//    public void when_Score_ALL_Presence_ALL_Then_note_ALL (){
//        gradingCalculator = new GradingCalculator(95,90);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('A',grade);
//    }
//
//    @Test
//    public void when_Score_95_Presence_90_Then_note_A (){
//        gradingCalculator = new GradingCalculator(95,90);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('A',grade);
//    }
//    @Test
//    public void when_Score_85_Presence_90_Then_note_B (){
//        gradingCalculator = new GradingCalculator(85,90);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('B',grade);
//    }
//    @Test
//    public void when_Score_65_Presence_90_Then_note_C (){
//        gradingCalculator = new GradingCalculator(65,90);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('C',grade);
//    }
//    @Test
//    public void when_Score_95_Presence_65_Then_note_B (){
//
//        gradingCalculator = new GradingCalculator(95,65);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('B',grade);
//    }
//    @Test
//    public void when_Score_95_Presence_55_Then_note_F (){
//        gradingCalculator = new GradingCalculator(95,55);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('F',grade);
//    }
//    @Test
//    public void when_Score_65_Presence_55_Then_note_F (){
//        gradingCalculator = new GradingCalculator(65,55);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('F',grade);
//    }
//    @Test
//    public void when_Score_50_Presence_90_Then_note_F (){
//        gradingCalculator = new GradingCalculator(50,90);
//        char grade = gradingCalculator.getGrade();
//        Assert.assertEquals('F',grade);
//    }
}
