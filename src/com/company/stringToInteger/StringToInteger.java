package com.company.stringToInteger;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        if(s.equals("")) return 0;

        int i = 0;
        while(!s.substring(i).equals("") && s.charAt(i) == ' '){
            i++;
        }

        if(s.substring(i).equals("")) return 0;

        boolean isNeg = false;
        if(s.charAt(i) == '-' || s.charAt(i) == '+') {
            if(s.charAt(i) == '-') isNeg = true;
            i++;
        }

        if(s.substring(i).equals("")) return 0;
        if(s.charAt(i) < '0' || s.charAt(i) > '9') return 0;

        int output = Integer.parseInt(s.charAt(i) + "");
        i++;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if(!isNeg && (output > Integer.MAX_VALUE / 10 || (output == Integer.MAX_VALUE / 10 && Integer.parseInt(s.charAt(i) + "") > 7))) return Integer.MAX_VALUE;
            if(isNeg && (output - 1 > (Integer.MAX_VALUE) / 10 || (output == Integer.MAX_VALUE / 10 && Integer.parseInt(s.charAt(i) + "") > 8))) return Integer.MIN_VALUE;
            output *= 10;
            output += Integer.parseInt(s.charAt(i) + "");
            i++;
        }

        if(isNeg) return output * -1;
        return output;
    }
}
