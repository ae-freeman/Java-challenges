public class main {

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
    }

    public static boolean shouldWakeUp(boolean ifBarking, int hourOfDay){
        //check time is valid
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else {
            //check if dog is barking
            if(ifBarking){
                //check if within time to wake up
                if(hourOfDay < 8 || hourOfDay > 22){
                    return true;
                } else {
                    return false;
                }


            } else {
                return false;
            }
        }
    }
}
