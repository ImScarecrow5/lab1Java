package com.example.lab1sigov.Model;

public class Convert_systemNumber {
    private int number;

    public Convert_systemNumber(int ch)
    {
        number = ch;
    }

    public String convertDV()
    {
        return Integer.toBinaryString(number);
    }
}
