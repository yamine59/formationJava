package org.example.demo2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JeuTest {
    private Jeu jeu;

    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDeLancerWithValue20_ThenReturnTrue() {

        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(20);
        Assert.assertTrue(jeu.jouer());
    }

    @Test
    public void whenDeLancerWithValueNot20_ThenReturnFalse() {
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(10);
        Assert.assertFalse(jeu.jouer());
    }

}
