public class main {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int age1, int age2, int age3){
        if(age1 > 12 && age1 < 20 || age2 > 12 && age2 < 20 || age3 > 12 && age3< 20){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age){
        if(age > 12 && age < 20){
            return true;
        } else {
            return false;
        }
    }
}
