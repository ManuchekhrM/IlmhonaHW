package com.company.zadacha_1;

import com.company.first.Pokupatel;

public class Main {

    public static void main(String[] args) {
	    Pokupatel pokupatel = new Pokupatel("Odilov", "Rustam", "Saidovich",
                "Behzod 8", 22223333, 46);

        Pokupatel pokupatel1 = new Pokupatel("Bekov", "Anush", "Bekovich",
                "Behzod 6", 22224444, 55);

        Pokupatel pokupatel2 = new Pokupatel("Khalilov", "Kholiq", "Beko",
                "Behzod 7", 22221444, 27);

        Pokupatel pokupatel3 = new Pokupatel("Win", "Dows", "Bek",
                "Behzod 5", 223224444, 13);

        Pokupatel pokupatel4 = new Pokupatel("Holov", "AShamil", "Ich",
                "Behzod 4", 22224344, 29);


        Pokupatel[] pokupatels = new Pokupatel[5];
        pokupatels[0] = pokupatel;
        pokupatels[1] = pokupatel1;
        pokupatels[2] = pokupatel2;
        pokupatels[3] = pokupatel3;
        pokupatels[4] = pokupatel4;
        int chetnoe = 0;
            for(int i = 0; i <= 4; i++ ){
                if(pokupatels[i].getIdNumber() % 2 == 0)
                    chetnoe = pokupatels[i].getIdNumber();
            System.out.println(chetnoe);
    }



    }
}
