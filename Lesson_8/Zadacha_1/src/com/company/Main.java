package com.company;

public class Main {

        // 1) Написать метод max(int x, int y), который вернет максимальное из х и у.

        public static void main(String[] args) {
            int max = maxOfMax(5, 13);
            System.out.println(max);

        }

        public static int maxOfMax (int x, int y) {
            int max = 0;
            if (x > y){
                max = x;
            } else if (x < y){
                max = y;
            }
            return max;
        }
    }

