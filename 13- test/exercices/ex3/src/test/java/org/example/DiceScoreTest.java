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
    public void whenDeIsEquals_ThenResultISMultiplier(){
        diceScore = new DiceScore();
        Mockito.when(de.getRoll()).thenReturn(5);
        int result = diceScore.getScore();

        Assert.assertEquals(20,result);
    }
}
