package com.company;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.brand = "Антоновка";
        apple.color = "Зеленое";
        apple.sour = "Да";

        System.out.println("Высота: " + apple.brand);
        System.out.println("Ширина: " + apple.color);
        System.out.println("Материал: " + apple.sour);
        System.out.println();




        Apple apple2 = new Apple();
        apple2.brand = "Джонатан";
        apple2.color = "Красное";
        apple2.sour = "Нет";

        System.out.println("Высота: " + apple2.brand);
        System.out.println("Ширина: " + apple2.color);
        System.out.println("Материал: " + apple2.sour);
        System.out.println();

        Apple apple3 = new Apple();
        apple3.brand = "Голден";
        apple3.color = "Желтое";
        apple3.sour = "Нет";

        System.out.println("Высота: " + apple3.brand);
        System.out.println("Ширина: " + apple3.color);
        System.out.println("Материал: " + apple3.sour);
    }
}

class Apple {
    String brand;
    String  color;
    String sour;
}
