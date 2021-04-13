package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//  1-10
        System.out.println(Task1_10.remainder(3,4));
        System.out.println(Task1_10.triArea(10,10));
        System.out.println(Task1_10.animals(2,3,5));
        System.out.println(Task1_10.profitableGamble(0.2, 50, 9));
        System.out.println(Task1_10.operation(24, 26, 2));
        System.out.println(Task1_10.ctoa('A'));
        System.out.println(Task1_10.addUpTo(10));
        System.out.println(Task1_10.nextEdge(8,10));
        int[] sumofcubes = {1,5,9};
        System.out.println(Task1_10.sumOfCubes(sumofcubes));
        System.out.println(Task1_10.abcmath(5,2,1));
//  10_20
        System.out.println(Task10_20.repeat("mice", 5));
        int[] avg = {1,5,6};
        System.out.println(Task10_20.isAvgWhole(avg));
        int[] sum = {3,3,-2,408,3,3};
        System.out.println(Arrays.toString(Task10_20.cumulativeSum(sum)));
        System.out.println(Task10_20.getDecimalPlaces("43,20"));
        System.out.println(Task10_20.Fibonacci(12));
        System.out.println(Task10_20.isValid("59001"));
        System.out.println(Task10_20.isStrangePair("ratio", "orator"));
        System.out.println(Task10_20.isSuffix("arachnophobia", "-phobia"));
        System.out.println(Task10_20.isPrefix("automation", "auto-"));
        Task10_20.boxSeq(5);
        System.out.println(" ");
    }
}