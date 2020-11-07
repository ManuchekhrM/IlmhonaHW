package com.company.zadacha_2;

import com.company.second.Abonent;

public class Main {

    public static void main(String[] args) {
        Abonent abonent = new Abonent(66, "Anush", "Bekov",
                "Bekovich", "Zarafshon 11", 53, 33);

        Abonent abonent1 = new Abonent(66, "NOzanin", "Bekova",
                "Bekovich", "Zarafshon 15", 54, 35);

        Abonent abonent2 = new Abonent(66, "Anusha", "Beki",
                "Bekovich", "Zarafshon 14", 55, 36);

        Abonent abonent3 = new Abonent(66, "Anvara", "Bekovi",
                "Bekovich", "Zarafshon 13", 56, 38);

        Abonent abonent4 = new Abonent(66, "Azarat", "Belova",
                "Bekovich", "Zarafshon 12", 57, 34);

        Abonent[] abonents = new Abonent[5];
        abonents[0] = abonent;
        abonents[1] = abonent1;
        abonents[2] = abonent2;
        abonents[3] = abonent3;
        abonents[4] = abonent4;
        int peregovori = 0;
        for(int i = 0; i <= 4; i++ ){
            if(abonents[i].getTimeIntercityCall() > peregovori) {
                peregovori = abonents[i].getTimeIntercityCall();

            }
        System.out.println(peregovori);

    }
}}
