package com.company;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();
        box.height = 13.5;
        box.width = 40.2;
        box.material = "plastic";
        box.weight = 50.0;

        System.out.println("Высота: " + box.height);
        System.out.println("Ширина: " + box.width);
        System.out.println("Материал: " + box.material);
        System.out.println("Вес: " + box.weight);
        System.out.println();




        Box box2 = new Box();
        box2.height = 20.0;
        box2.width = 30.0;
        box2.material = "wood";
        box2.weight = 30.0;

        System.out.println("Высота: " + box2.height);
        System.out.println("Ширина: " + box2.width);
        System.out.println("Материал: " + box2.material);
        System.out.println("Вес: " + box2.weight);
    }
}

class Box {
    double height;
    double width;
    String material;
    double weight;
}