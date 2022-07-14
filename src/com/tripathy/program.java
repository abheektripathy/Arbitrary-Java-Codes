package com.tripathy;

public class program {
    public static void main(String[] args) {
        int num = 56;
        String strNum = "" + num;
        int strLength = strNum.length();
        int sum = 0;

        for (int i = 0; i < strLength; ++i) {
            int digit = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            sum += (digit * digit);
        }
    }
}



