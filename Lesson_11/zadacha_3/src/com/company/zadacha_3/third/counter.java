package com.company.zadacha_3.third;

public class counter {
    public int currentNumber;


    public counter(int name) {
        this.currentNumber = name;


    }
    public void plus(){
        int x = 0;
        x = currentNumber + 1;
        System.out.println("Увеличенный currentNumber " + x);

    }
    public void minus() {
        int y = 0;
        y = currentNumber - 1;
        System.out.println("Уменьшить currentNumber " + y);
    }
    public void tekushee() {
        System.out.println("текущее значение " + currentNumber);
    }
}
