package com.example.lab1sigov.Model;

public class Convert_systemNumber {
    private String number;
    private int firstSCH;
    private int secondSCH;

    public Convert_systemNumber(String ch, int fCH, int sCH)
    {
        number = ch;
        firstSCH = fCH;
        secondSCH = sCH;
    }

    public String convert() {
        int decimal = Integer.parseInt(number, firstSCH);

        switch (secondSCH) {
            case 2:
                return Integer.toBinaryString(decimal);
            case 8:
                return Integer.toOctalString(decimal);
            case 10:
                return String.valueOf(decimal);
            case 16:
                return Integer.toHexString(decimal).toUpperCase();
        }
        return "Неверный формат ввода";
    }
}
