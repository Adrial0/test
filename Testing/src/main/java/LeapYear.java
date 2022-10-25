public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
            }
            else
                leapYear = true;
        }

        return leapYear;
    }
}