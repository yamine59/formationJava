package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
@ExtendWith(MockitoExtension.class)
public class DiceScoreTest {

    private DiceScore diceScore;
    public Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDeIsEquals_Value5_ThenResultIS20(){
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(5);
        int result = diceScore.getScore();

        Assert.assertEquals(20,result);
    }

    @Test
    public void whenDiceIsEquals_6_ThenResultIS30(){
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6);
        int result = diceScore.getScore();

        Assert.assertEquals(30,result);
    }

    @Test
    public void whenDicesIsRandom_10_5_ThenResultIs10(){
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(10,5);
        int result = diceScore.getScore();

        Assert.assertEquals(10,result);
    }
}
