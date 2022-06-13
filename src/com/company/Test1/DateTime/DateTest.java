package src.com.company.Test1.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class DateTest {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));

        System.out.println();
        System.out.println();


        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
//Its a lambda expression
//        get all x if the year is greater than 2000
        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);

        System.out.println();
        System.out.println();
//        LocalTime time1 = LocalTime.of(16, 40);

//        This question is on ternary operator
//        If an expression has multiple ternary operators
//        then number of ? and : should match.
//        Given expression contains 2 ? and 1 : and hence Compilation Error.

//        String amPm = time1.getHour() >= 12 ?  (time1.getHour() == 12) ? "PM" : "AM";
//        System.out.println(amPm);

    }
}
