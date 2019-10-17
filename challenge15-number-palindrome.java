package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome(int number){
        int reversedNumber = 0;
        int numberToChange = number;
        while(numberToChange != 0){
            int digit = numberToChange % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numberToChange /= 10;
        }

        if(reversedNumber == number){
            return true;
        } else {
            return false;
        }
    }
}
