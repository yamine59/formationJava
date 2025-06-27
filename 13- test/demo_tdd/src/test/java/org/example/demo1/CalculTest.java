package org.example.demo1;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    private Calcul calcul;

    @Test
    public void whenAddition_1_2_Then_3 (){
//        // Arrange
        calcul = new Calcul();
//        double x = 1;
//        double y = 2;
//
//        // Act
//        double result = calcul.addition(x,y);
//
//        // Assert
//        Assert.assertEquals(3,result,0.0001);
        Assert.assertEquals(3,calcul.addition(1.00,2.00),0.001);
    }


    @Test
    public void whenDivision_30_10_Then_3 () {
        calcul = new Calcul();
        Assert.assertEquals(3,calcul.division(30.00,10.00),0.001);
    }

    @Test
    public void whenDivision_10_0_Then_DivisionByZeroException (){
        calcul = new Calcul();
        Assert.assertThrows(DivisionByZeroException.class, () -> {calcul.division(10,0);}  );
    }


}
