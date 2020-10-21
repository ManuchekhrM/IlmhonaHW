package com.company;

public class Main {

        //5)  Написать метод, который вернет сумму цифр переданного массива.

        public static void main(String[] args) {

            int zadanie5 = Sum(new int[]{2, -4, 5, -10, -3, 6, 9, 15});
            System.out.println(zadanie5);

        }
        public static int Sum(int[] array) {
            int sum = 0;
            for (int C = 0; C < array.length; C++)
                sum += array[C] ;
            return sum;
        }
    }

