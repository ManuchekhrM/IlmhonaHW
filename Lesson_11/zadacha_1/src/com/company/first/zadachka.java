package com.company.first;

public class zadachka {
    public int x;
    public int y;

    public void vivodZnacheniy() {
        System.out.println(x);
        System.out.println(y);
    }
    public void sum(){
        int sum = 0;
        sum = x + y;
            System.out.println("sum " + sum);

    }
    public void max(){
        int max = 0;
        max = Math.max(x,y);
        System.out.println("max " + max);
            }

}
