package com.company;

public class Main {

    public static void main(String[] args) {
	/*Дана строка. Если ее длина больше 10, то оставить
        в строке только первые 6 символов, иначе дополнить
        строку символами 'o' до длины 12.*/
        String zadacha4 = "Avoka";

        if (zadacha4.length() > 10){
            String pervie6 = zadacha4.substring(0, 6);
            System.out.println(pervie6);

        }else if (zadacha4.length() < 10){
            String zamena = new String();
            for (int i = 0; i< zadacha4.length(); i++){
                zadacha4+='o';

            }
            System.out.println(zamena);
            }


        }

    }

