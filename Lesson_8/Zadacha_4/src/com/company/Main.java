package com.company;

public class Main {

    //4)  Написать метод, который удаляет все отицательные чистла в переданном массиве и вернет новый массив без отрицательных чисел.

    public static void main(String[] args) {

        int zadanie4 = Delet(new int[]{2, -4, 5, -10, -3});
        System.out.println(zadanie4);


    }

    public static int Delet(int[] array) {
        int counter = 0;
        for (int r = 0; r < array.length; r++) {
            int Element0 = array[r];
            if (Element0 < 0) {
                counter++;
            }
        }
        int y = 0;
        int[] array0 = new int[array.length - counter];
        for (int r = 0; r < array.length; r++) {
            int Element0 = array[r];
            if (Element0 > 0) {
                array0[y] = Element0;
                y++;
            }
        }
        int Del = 0;
        for (int r = 0; r < array0.length; r++) {
            Del = array0[r];
        }
        return Del;
    }
}
