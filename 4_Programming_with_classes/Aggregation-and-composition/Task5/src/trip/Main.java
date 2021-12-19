package trip;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport(true, "Bus");
        Food food = new Food(true, false, false);
        Day day = new Day(LocalDate.of(2021, 12, 10), LocalDate.of(2021, 12, 20));

        TourPackage tourPackage = new TourPackage("Shopping", day, food, transport);
        System.out.println(tourPackage);
    }
}
