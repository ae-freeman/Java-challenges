package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;

        //find first digit
        while(number > 9){
            number /= 10;
        }

       return lastDigit + number;
    }
}
