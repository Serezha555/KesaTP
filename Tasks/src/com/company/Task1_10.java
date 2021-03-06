package com.company;

public class Task1_10{

        /* Метод для зачачи 1 из блока 1/6
         * Напишите функцию, которая принимает целое число минут и преобразует его в секунды.*/
        public static int convert(int i){
                return i *60;
        }
        /* Метод для зачачи 2 из блока 1/6
         * Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х и 3-х очков,
         * находите окончательные очки для команды и возвращаете это значение. */
        public static int points (int ball2, int ball3){
                return 2* ball2 + 3*ball3;
        }
        /* Метод для зачачи 3 из блока 1/6
        * Создайте функцию, которая принимает количество побед, ничьих и поражений и вычисляет количество очков, набранных футбольной командой на данный момент.
        выигрыш – получают 3 очка
        ничья – получают 1 очко
        проигрыш – получают 0 очков */
        public static int footballPoints (int pobeda, int nich, int proigr){
                return 3*pobeda + 1*nich + 0*proigr;
        }
        /* Метод для зачачи 4 из блока 1/6
        Создайте функцию, которая возвращает true, если целое число равномерно делится на 5, и false в противном случае. */
        public static String divisibleByFive (int div5)
        {
                String d;
                if (div5 % 5 == 0)
                {
                        d = "true";
                }
                else
                        d = "false";
                return d;
        }

        /* Метод для зачачи 5 из блока 1/6
        * 5. В Java есть логический оператор &&. Оператор && принимает два логических значения и возвращает true, если оба значения истинны.
        Рассмотрим a && b:
        a проверяется, является ли оно истинным или ложным.
        Если a равно false, возвращается false.
        b проверяется, является ли оно истинным или ложным.
        Если b имеет значение false, возвращается значение false.
        В противном случае возвращается true (поскольку и a, и b, следовательно, истинны ).
        Оператор && вернет true только для true && true.
        Создайте функцию с помощью оператора&&.
        */
        public static boolean and(boolean r, boolean rr)
        {
                return r && rr;
        }

        /* Метод для зачачи 6 из блока 1/6
        * 6. У меня есть ведро с большим количеством темно-синей краски, и я хотел бы покрасить как можно больше стен.
        * Создайте функцию, которая возвращает количество полных стен, которые я могу покрасить, прежде чем мне нужно будет отправиться в магазины,
        * чтобы купить еще.
        n - это количество квадратных метров, которые я могу нарисовать.
        w и h-это ширина и высота одной стены в метрах.
        */
        public static int howManyWalls (int kvad_metr, int width, int height){
                return kvad_metr/(width*height);
        }

        /* Метод для зачачи 7 из блока 1/6 */
        public static int squared (int number){
                int i = number * number;
                return i;
        }

        /* Метод для зачачи 8 из блока 1/6
         * Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает true,
         * если prob * prize > pay; в противном случае возвращает false.*/
        public static String profitableGamble (double prob, int prize, int pay){
                String d;
                if (prob * prize > pay)
                {
                        d = "true";
                }
                else
                        d = "false";

                return d;
        }


        /* Метод для зачачи 9 из блока 1/6
         * Создайте метод, который возвращает количество кадров, показанных за заданное количество минут для определенного FPS.*/
        public static int frames (int FPS, int k) {
                return FPS*k*60;
        }

        /* Метод для зачачи 10 из блока 1/6
         * 10. Создайте функцию, которая будет работать как оператор модуля % без использования оператора модуля. Оператор модуля-это
         * способ определения остатка операции деления. Вместо того чтобы возвращать результат деления,
         * операция по модулю возвращает остаток целого числа. */
        public static int mod(int a, int b){
                return a-a/b*b;
        }
}