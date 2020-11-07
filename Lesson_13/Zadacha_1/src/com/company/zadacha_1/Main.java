package com.company.zadacha_1;

import com.company.first.Pokupatel;

public class Main {

    public static void main(String[] args) {
	    Pokupatel pokupatel = new Pokupatel("Odilov", "Rustam", "Saidovich",
                "Behzod 8", 22223333, 44);

        System.out.println(pokupatel.getIdNumber());
        pokupatel.getName();



    }
}
