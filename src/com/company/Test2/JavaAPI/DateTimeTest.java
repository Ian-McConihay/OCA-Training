package src.com.company.Test2.JavaAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DateTimeTest {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));

        StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
        sb.delete(0,100);// (start index, end index)
        System.out.println(sb.length());

        List<LocalDate> dates = new ArrayList<>();
//        dates.add(LocalDate.parse("2018-7-11")); //runtime
//      exception caused do to the parse requiring xxxx-xx-xx
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);



        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if(days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }// wont run. contains returns false

        System.out.println(days.size());
    }
}
