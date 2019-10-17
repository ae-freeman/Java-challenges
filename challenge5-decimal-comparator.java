public class main {

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.1753, 3.1767);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        if ((long)(num1 * 1000d) == (long) (num2 * 1000d)){
            return true;
        }
    return false;
    }
}
