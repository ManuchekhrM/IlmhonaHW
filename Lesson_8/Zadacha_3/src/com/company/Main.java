package com.company;

public class Main {

    //3) Написать метод maxInArray(int[] array), который вернет максимальное число в массиве array.

    public static void main(String[] args) {

        double zadanie3 = maxInArray(new int[]{2, 4, 5});
        System.out.println(zadanie3);


    }

    public static double maxInArray(int[] array) {
        int max = 0;

        for (int D = 0; D < array.length; D++)
            if (array[D] > max) {
                max = array[D];
            }
        return max;
    }
}
