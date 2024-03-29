public class main {
    public static void main(String[] args) {
       long result = toMilesPerHour(1.5);
        System.out.println(result);

        printConversion(10.25);

    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);

        }

    }

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }
    }
}
