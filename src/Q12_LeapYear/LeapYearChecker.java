package Q12_LeapYear;

public class LeapYearChecker {

        public  boolean isLeapYear(int year) {

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                return true;
            }
            return false;
        }


}
