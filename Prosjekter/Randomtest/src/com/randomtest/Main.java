package com.randomtest;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int low = 20;
        int high = 30+1;


        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(high - low) + low);
        }
    }
}