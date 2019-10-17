package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int numberCounter = 0;
        while (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                sum += number;
                numberCounter++;
                }

            if (numberCounter > 0) {
                average = Math.round((double)sum / numberCounter);
            }


            System.out.println("SUM = " + sum + " AVG = " + average);
            scanner.close();




    }

}
