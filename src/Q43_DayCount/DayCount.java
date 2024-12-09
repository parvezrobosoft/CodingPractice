package Q43_DayCount;

public class DayCount {

        public static int getDayCount(String date) {

            int year = Integer.parseInt(date.substring(0,4));
            int month = Integer.parseInt(date.substring(5,7));
            int day = Integer.parseInt(date.substring(8,10));

            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth[1] = 29;}

            int dayOfYear = 0;

            for (int i = 0; i < month - 1; i++) {
                dayOfYear += daysInMonth[i];

            }
            dayOfYear += day;

            return dayOfYear;
        }

        public static void main(String[] args) {
            String date = "2024-12-09";
            System.out.println("Days till date: " + getDayCount(date));
        }
    }

