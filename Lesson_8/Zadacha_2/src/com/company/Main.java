package com.company;

public class Main {

    //2) Написать метод SumOfSquares(int a, int y) где a<b и вернуть сумму квадратов всех целых числ от a до b включительно.

    public static void main(String[] args) {

        double zadanie2 = SumOfSquares(2, 7);
        System.out.println(zadanie2);


    }

    public static double SumOfSquares(int A, int B) {
        double sum = 1;
        while (A <= B) {
            sum = sum + (int) Math.pow(A, 2);
            A++;
        }
        return sum;
    }
}


