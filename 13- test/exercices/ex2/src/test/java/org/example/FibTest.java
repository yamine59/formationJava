package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibTest {
    public Fib fib;
    @Test
    public void whenRangeIs_1_Then_IsNotEmpty() {
        fib = new Fib(1);
        List<Integer> result= fib.getFibSeries();

        Assert.assertFalse(result.isEmpty());

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
    }

    @Test
    public void whenRange_6_thenResultContain_6_elements(){
        fib = new Fib(6);
        List<Integer> result= fib.getFibSeries();

        Assert.assertEquals(6,result.size());
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
        List<Integer> expected = List.of(0,1,1,2,3,5);
        List<Integer> result= fib.getFibSeries();

        Assert.assertEquals(expected,result);
    }

    @Test
    public  void whenRange_6_thenResultIsAsc(){
        fib = new Fib(6);
        List<Integer> result= fib.getFibSeries();

        List<Integer> expected = new ArrayList<>(result);
        expected.sort(null);

        Assert.assertEquals(expected,result);
//        Assert.assertEquals(result.stream().sorted().toList(),result);

    }
}
