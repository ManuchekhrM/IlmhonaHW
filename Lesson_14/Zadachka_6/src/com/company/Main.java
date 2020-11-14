package com.company;

public class Main {

    public static void main(String[] args) {
	/*Даны два слова. Найдите только те символы слов,
которые встречаются в обоих словах только один раз.*/
        String zadacha6 = "chip, beautiful";
        int zad = zadacha6.indexOf("i");
        int count = 0;
        for (int f = 0; f< zadacha6.length(); f++) {
            count++;
            zadacha6 = zadacha6.substring(zad + 1);
            zad = zadacha6.indexOf("i");
            System.out.println(count);
        }
    }
}
