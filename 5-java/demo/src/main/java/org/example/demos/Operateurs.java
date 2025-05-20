package org.example.demos;

public class Operateurs {
    public static void main(String[] args) {
        int result = 1+2;
        System.out.println("le resultat est "+result);
        int originalResult = result;

        result = result - 1;
        System.out.println(originalResult+ "-1 = "+ result);
        originalResult = result;

        result = result * 2;
        System.out.println(originalResult+ "* 2 = "+ result);
        originalResult = result;

        result = result / 2;
        System.out.println(originalResult+ "/ 2 = "+ result);
        originalResult = result;


    }
}
