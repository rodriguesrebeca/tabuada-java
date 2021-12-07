package com.company.services;

public class Calculator {

    public static void results(int number){
        for(int i=1; i <= 10; i++){
            System.out.println(number + " x " + i +" = " + (number * i));
        }
    }
}
