package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

// 1-10
        System.out.println("1.1 = " + Task1_10.convert(5));
        System.out.println("1.2 = " + Task1_10.points (13,12));
        System.out.println("1.3 = " + Task1_10.footballPoints (3,4,2));
        System.out.println("1.4 = " + Task1_10.divisibleByFive (5));
        System.out.println("1.5 = " + Task1_10.and (true, true));
        System.out.println("1.6 = " + Task1_10.howManyWalls (54, 1, 43));
        System.out.println("1.7 = " + Task1_10.squared(5));
        System.out.println("1.8 = " + Task1_10.profitableGamble( 0.9, 1, 2));
        System.out.println("1.9 = " + Task1_10.frames(10, 25));
        System.out.println("1.10 = " + Task1_10.mod (5, 2));
// 10_20
        System.out.println("2.1 = " + Task10_20.oppositeHouse(1, 3));
        System.out.println("2.2 = " + Task10_20.nameShuffle("Donald Trump"));
        System.out.println("2.3 = " + Task10_20.discount(89, 20));
        System.out.println("2.4 = " + Task10_20.differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("2.5 = " + Task10_20.equal(1, 1, 1));
        System.out.println("2.6 = " + Task10_20.reverse("Hello World"));
        System.out.println("2.7 = " + Task10_20.programmers(1, 5, 9));
        System.out.println("2.8 = " + Task10_20.getXO("ooxx"));
        System.out.println("2.9 = " + Task10_20.bomb("There is a bomb."));
        System.out.println("2.10 = " + Task10_20.sameAscii("AA", "B@"));
// 20_30
        System.out.println("3.1 = " );Task20_30.millionsRounding(new String[][] {{"Manila", "13923452"},{"Kuala Lumpur", "7996830"}, {"Jakarta", "10770487"}});
        System.out.println("3.2 = " + Arrays.toString(Task20_30.otherSides(12)));
        System.out.println("3.3 = " + Task20_30.rps("scissors", "scissors"));
        System.out.println("3.4 = " + Task20_30.warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
        System.out.println("3.5 = " + Task20_30.reverseCase("Happy Birthday"));
        System.out.println("3.6 = " + Task20_30.inat("oooo"));
        System.out.println("3.7 = " + Task20_30.doesBrickFit(1,1,1,1,1));
        System.out.println("3.8 = " + Task20_30.totalDistance(36.1, 8.6, 3, true));
        System.out.println("3.9 = " + Task20_30.mean(new int[] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
        System.out.println("3.10 = " + Task20_30.parityAnalysis(3));
// 30_40
        System.out.println("4.1 = " + Task30_40.sevenBoom(new int[] {1, 2, 3, 4, 5, 6, 97}));
        System.out.println("4.2 = " + Task30_40.cons (new int[] {5, 6, 7, 8, 9, 13}));
        System.out.println("4.3 = " + Task30_40.unmix("hTsii s aimex dpus rtni.g"));
        System.out.println("4.4 = " + Task30_40.noYelling("Oh my goodness!!!"));
// System.out.println("4.5 = " + Task30_40.xPronounce("OMG x box unboxing video x D") );
        System.out.println("4.6 = " + Task30_40.largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
        System.out.println("4.7 = " + Task30_40.raznitsa(832));
        System.out.println("4.8 = " + Task30_40.commonLastVowel("Watch the characters dance!"));
        System.out.println("4.9 = " + Task30_40.memeSum(26, 39));
        System.out.println("4.10 = " + Task30_40.unrepeated("hello"));
// 40_50
// 50_60
    }
}