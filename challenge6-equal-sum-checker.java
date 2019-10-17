public class main {
    public static void main(String[] args) {
        boolean result = hasEqualSum(1, 1, 1);
        System.out.println(result);

    }



    public static boolean hasEqualSum(int number1, int number2, int number3){
        if(number1 + number2 == number3){
            return true;
        } else {
            return false;
        }
    }

}

