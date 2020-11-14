package com.company;

public class Main {

    public static void main(String[] args) {
/*Дана строка. Вывести первые три символа и
последний три символа, если длина строки больше 5.
Иначе вывести первый символ столько раз, какова
длина строки.*/
        String zadachka1 = "Avokado is the best fruit";

        int Len = zadachka1.length();
        int koli = 0;
        for (int i = 0; i < Len; i++) {
            koli++;
        }

        char max = 5;
        if (koli > max) {
            String nachalo = zadachka1.substring(0, 3);
            String konets = zadachka1.substring(22, 25);
            System.out.printf(nachalo + " ");
            System.out.println(konets);
        } else if (koli < max) {
            String r = "a";
            for (int i = 0; i < zadachka1.length(); i++){
                zadachka1 = r;
            }
            System.out.println(r);
        }

        }

    }



