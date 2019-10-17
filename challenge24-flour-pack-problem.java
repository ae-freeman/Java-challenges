package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
//

        int sum = (bigCount * 5) + smallCount;

        //check validity of numbers
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        else if (sum == goal){
            return true;
        }

        else if(sum < goal){
            return false;
        }

        else if((5 * (goal / 5) + smallCount) >= goal){
            return true;
        }

      else if(bigCount < 1 && smallCount >= goal){
          return true;
        }
      else {
          return false;
        }



    }
}
