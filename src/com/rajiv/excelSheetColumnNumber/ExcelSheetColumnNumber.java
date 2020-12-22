package com.rajiv.excelSheetColumnNumber;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String s) {
        if(s == null || s.equals("")) return -1;

        int output = 0;
        int power = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            output += (s.charAt(i) - 'A' + 1) * Math.pow(26, power);
            power++;
        }
        return output;
    }
}
