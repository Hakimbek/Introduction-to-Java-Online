package calendar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(new ArrayList<>(Arrays.asList(
            new Calendar.Date(LocalDate.now(), DateType.WEEKDAY),
            new Calendar.Date(LocalDate.of(2021,12,31), DateType.HOLIDAY),
            new Calendar.Date(LocalDate.of(2021,12, 10), DateType.WEEKEND)
        )));

        for (Calendar.Date date : calendar.getDates()) {
            System.out.println(date);
        }
    }
}
