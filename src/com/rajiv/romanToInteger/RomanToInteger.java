package com.company.romanToInteger;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int output = 0;

        int i = 0;
        while (i < s.length()){
            Character c = s.charAt(i);
            if(c == 'I'){
                if(i != s.length() - 1 && s.charAt(i+1) == 'V'){
                    output += 4;
                    i++;
                } else if(i != s.length() - 1 && s.charAt(i+1) == 'X'){
                    output += 9;
                    i++;
                } else output += 1;
            } else if(c == 'X'){
                if(i != s.length() - 1 && s.charAt(i+1) == 'L'){
                    output += 40;
                    i++;
                } else if(i != s.length() - 1 && s.charAt(i+1) == 'C'){
                    output += 90;
                    i++;
                } else output += 10;
            } else if(c == 'C'){
                if(i != s.length() - 1 && s.charAt(i+1) == 'D'){
                    output += 400;
                    i++;
                } else if(i != s.length() - 1 && s.charAt(i+1) == 'M'){
                    output += 900;
                    i++;
                } else output += 100;
            } else if(c == 'V') output += 5;
            else if(c == 'L') output += 50;
            else if(c == 'D') output += 500;
            else if(c == 'M') output += 1000;
            i++;
        }
        return output;
    }

}
