package com.day4;

import java.util.Random;

public class UC_2 {
    public static void main(String[] args) {
        Random random=new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("number is ::"+dice);
    }
}
