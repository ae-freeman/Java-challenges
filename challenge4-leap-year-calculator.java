public class main {
    public static void main(String[] args) {
        boolean result = isLeapYear(1924);
        System.out.println(result);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            //calculation
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else if (year % 4 == 0 || year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }

}

