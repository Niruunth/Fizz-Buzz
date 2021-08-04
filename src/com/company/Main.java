package com.company;

public class Main {

    public static void main(String[] args) {
        int Fizz = 3;
        int Buzz = 5;

        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if(i%5==0){
                System.out.println("Buzz");
            }   else if(i%3!=0) {
                System.out.println(i);
            }
            System.out.println();
        }

    }
}
