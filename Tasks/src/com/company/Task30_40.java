package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Task30_40 { //task31

    // Метод для задачи 1 из task4
    public static String sevenBoom (int[] seven)
    { int a = 0;
        String s;
        for (int i: seven){
            s = Integer.toString(i); // число в строку
            if (s.contains("7"))
            { a +=1;
            }}
        if (a>0) return "BOOM!";
        else return "there is no 7 in the array";
    }

    // Метод для задачи 2 из task4
    public static boolean cons(int[] sort){
        boolean k = false;
        Arrays.sort(sort); // класс arrays, метод сорт
        for(int i =1; i < sort.length;i++){
            k = sort[i] - sort[i - 1] == 1;
        }
        return k;
    }

    // Метод для задачи 3 из task4
    public static String unmix(String mix){
        char obm;
        char[] a = mix.toCharArray();
        for( int i = 0; i<a.length; i+=2){
            obm = a[i];
            a[i] = a[i+1];
            a[i+1]=obm;
        }
        return String.valueOf(a); //возвращает строковое представление int аргумента
    }

    // Метод для задачи 4 из task4
    public static String noYelling(String yell){
        while (yell.endsWith("!!") || yell.endsWith("??")) {
            yell = yell.substring(0, yell.length() - 1); // удаление последнего элемента строки
        }
        return yell;
    }

    // Метод для задачи 5 из task4
/*public static String xPronounce(String x) {
x = x.replaceAll("\sx\s", " ecks ");
x = x.replaceAll("\sx", " z");
x = x.replaceAll("x", "cks");
return x;
}
*/
// Метод для задачи 6 из task4
    public static int largestGap (int[] gap){
        Arrays.sort(gap);
        int r = 0;
        for(int i = 0; i< gap.length - 1 ;i++)
            if ((gap[i+1] - gap[i])>r)
                r = gap[i+1] - gap[i];
        return r;
    }
    // Метод для задачи 7 из task4
    public static int raznitsa(int t) {
        String k = String.valueOf(t); // int -> string
        StringBuilder result = new StringBuilder();
        char[] b = k.toCharArray();
        for (int i = b.length-1; i >= 0; i--) { //запись числа в обратном порядке
            result.append(b[i]); // перепись
        }
        int res = Integer.parseInt(result.toString().trim()); //string ->int, trim удаляет пробелы
        return t - res;
    }

    // Метод для задачи 8 из task4
    public static String commonLastVowel (String vowel) {
        vowel = vowel.toLowerCase();
        char[] arr = vowel.toCharArray();
        int len = arr.length;
        char buf = '1';
        for(int i = 0; i< len; i++){
            if (isVowel(arr[i]))
                buf = arr[i];
        }
        return String.valueOf(buf); //valueOf возвращает строкове представление переданного аргумента
    }

    public static boolean isVowel(char c)
    {return "aeiouy".indexOf(c)!=-1;}

    // Метод для задачи 9 из task4
    public static int memeSum(int a1, int a2){
        int len = Math.max(String.valueOf(a1).length(),String.valueOf(a2).length());
        String w = "";
        for (int i = len - 1; i>= 0 ; i--){
            w = (a1 % 10 + a2 % 10) + w;
            a1 /=10;
            a2 /=10;
        }
        return Integer.parseInt(w);
    }

    // Метод для задачи 10 из task4
    public static String unrepeated (String str){
        int l = str.length();
        StringBuilder rez = new StringBuilder();
        for(int i=0; i< l; i++){
            if (!rez.toString().contains(String.valueOf(str.charAt(i)))) //добавление неповторяющейся буквы
                rez.append(str.charAt(i));
        }
        return rez.toString();
    }
}