package com.day4;

public class UC_4 {
    public static void main(String[] args) {
        System.out.println("player exact winning position");
        int winning_position=100;
        int position=0, startposition=0;
        while (position<= winning_position){
            int dicenumber=(int)Math.floor(Math.random()*10)%6+1;
            position++;
            System.out.println("number in dice is-"+dicenumber);
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
}


