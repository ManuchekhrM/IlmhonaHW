package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.since = "1916";
        car.color = "Черное";
        car.type = "Седан";

        System.out.println("Название: " + car.name);
        System.out.println("Основание: " + car.since);
        System.out.println("Цвет: " + car.color);
        System.out.println("Тип: " + car.type);
        System.out.println();

        Car car2 = new Car();
        car2.name = "Toyota";
        car2.since = "1937";
        car2.color = "Золотистое";
        car2.type = "Кросовер";

        System.out.println("Название: " + car2.name);
        System.out.println("Основание: " + car2.since);
        System.out.println("Цвет: " + car2.color);
        System.out.println("Тип: " + car2.type);
        System.out.println();

        Car car3 = new Car();
        car3.name = "Митсубиси";
        car3.since = "1870";
        car3.color = "Матовый черный";
        car3.type = "Внедорожник";

        System.out.println("Название: " + car3.name);
        System.out.println("Основание: " + car3.since);
        System.out.println("Цвет: " + car3.color);
        System.out.println("Тип: " + car3.type);
        System.out.println();

        Car car4 = new Car();
        car4.name = "Шевроле";
        car4.since = "1911";
        car4.color = "Зеленый";
        car4.type = "Хетчбэк";

        System.out.println("Название: " + car4.name);
        System.out.println("Основание: " + car4.since);
        System.out.println("Цвет: " + car4.color);
        System.out.println("Тип: " + car4.type);
    }
}

class Car {
    String name;
    String since;
    String color;
    String type;
}
