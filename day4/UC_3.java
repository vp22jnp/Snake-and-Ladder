package com.day4;

import java.util.Random;

public class UC_3 {
    public static void main(String[] args) {
        int startposition=0;
        System.out.println("start position is"+ startposition);
        Random random=new Random();
        int dicenumber = random.nextInt(6)+1;
        System.out.println("number is ::"+dicenumber);
        int option =(int)Math.floor(Math.random()*10%3);
        System.out.println("player option is "+ option);
        switch (option){
            case 1:
                startposition=dicenumber+startposition;
                System.out.println("ladder");
                System.out.println("player of the position after getting ladder is at position" +startposition);
                break;
            case 2:
                startposition=dicenumber-startposition;
                System.out.println("snake");
                System.out.println("player after cut by snake now at position"+startposition);
                break;
            default:
                System.out.println("no play");
        }
    }
}

