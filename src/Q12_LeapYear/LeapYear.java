package Q12_LeapYear;

public class LeapYear {
    public static void main(String[] args) {
        LeapYearChecker checkYear=new LeapYearChecker();

        int year=2000;
        if(checkYear.isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
