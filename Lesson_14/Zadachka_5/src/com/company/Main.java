package com.company;

public class Main {

    public static void main(String[] args) {
	/*Замените в строке все вхождения 'word' на
        'letter'.*/

        String zadacha5 = "Give me your word!";
        String zad = zadacha5.replaceAll("word", "letter");
        System.out.println(zad);


    }
}
