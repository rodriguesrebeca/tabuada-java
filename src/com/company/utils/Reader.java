package com.company.utils;

import java.util.Scanner;

public class Reader {
    private static Scanner scanNumber;

    public static int scannerNumber(){
        scanNumber = new Scanner(System.in);
        Print.printMsgNumber();
        int number = scanNumber.nextInt();
        return number;
    }
}
