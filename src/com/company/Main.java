package com.company;
import com.company.services.Calculator;
import com.company.utils.Reader;


public class Main {
    public static void main(String[] args) {
        Calculator.results(Reader.scannerNumber());
    }
}
