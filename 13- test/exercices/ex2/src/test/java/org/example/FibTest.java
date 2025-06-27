package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibTest {
    public Fib fib;
    @Test
    public void whenRangeIs_1_Then_Is_Not_Null() {
        fib = new Fib(1);
        List<Integer> result= fib.getFibSeries();

        Assert.assertNotNull(result);

    }

    @Test
    public void whenRange_1_Then_result_0() {
        fib = new Fib(1);
        List<Integer> result= fib.getFibSeries();
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        Assert.assertEquals(expected,result);

    }

    @Test
    public void whenRange_6_Then_Result_3(){
        fib = new Fib(6);
        List<Integer> result= fib.getFibSeries();

        Assert.assertTrue(result.contains(3));

//        Assert.assertTrue(result.contains(3));
//        Assert.assertEquals(6, result.size());
//        Assert.assertFalse(result.contains(4));
    }

    @Test
    public void whenRange_6_thenResultContain_6_elements(){
        fib = new Fib(6);
        List<Integer> expected = new ArrayList<>();
        List<Integer> result= fib.getFibSeries();

        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        Assert.assertEquals(expected.size(),result.size());
    }

    @Test
    public  void whenRange_6_thenResultNotContain_4(){
        fib = new Fib(6);
        List<Integer> result= fib.getFibSeries();

        Assert.assertFalse(result.contains(4));
    }

    @Test
    public void whenRange_6_thenResultContain_0_To_5(){
        fib = new Fib(6);
        List<Integer> expected = new ArrayList<>();
        List<Integer> result= fib.getFibSeries();

        expected.add(0);
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        Assert.assertEquals(expected,result);
    }

    @Test
    public  void whenRange_6_thenResultIsAsc(){
        fib = new Fib(6);
        List<Integer> result= fib.getFibSeries();

        for (int i = 0; i < result.size() - 1; i++) {

            Assert.assertTrue(result.get(i)<= result.get(i + 1));
        }

    }
}
