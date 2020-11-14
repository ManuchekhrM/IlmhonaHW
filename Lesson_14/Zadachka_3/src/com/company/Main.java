package com.company;


public class Main {

    public static void main(String[] args) {
	/* Дана строка. Определите, какой символ в ней
        встречается раньше: 'x' или 'w'. Если какого-то
        из символов нет, вывести сообщение об этом*/

        String zadacha3 = "Avokado is the best fruit";

        int index = zadacha3.indexOf("x");
        System.out.print(index + " ");
        int index1 = zadacha3. indexOf("w");
        System.out.println(index1 + " ");


    }
}


