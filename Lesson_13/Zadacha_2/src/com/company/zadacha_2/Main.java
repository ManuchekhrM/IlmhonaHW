package com.company.zadacha_2;

import com.company.second.Abonent;

public class Main {

    public static void main(String[] args) {
        Abonent abonent = new Abonent(66, "Anush", "Bekov",
                "Bekovich", "Zarafshon 11", 55, 33);

        System.out.println(abonent.getTimeCityCall());
        abonent.getName();
    }
}
