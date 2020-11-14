package com.company;

public class Main {
/*Дана строка. Показать номера символов,
совпадающих с последним символом строки.
*/
    public static void main(String[] args) {
        String zadacha2 = "Avokado is the best fruit";
        int zad = zadacha2.length();


        for (int i = 0; i < zad; i++) {
            if (zadacha2.charAt(i) == 't') {
                System.out.println(i);
            }
        }
    }
}