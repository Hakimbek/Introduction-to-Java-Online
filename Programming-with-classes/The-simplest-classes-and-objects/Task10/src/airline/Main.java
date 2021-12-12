package airline;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        AirlineAggregation airlineAggregation = new AirlineAggregation(new Airline[] {
                new Airline("Tokyo", 101, "Boeing747", LocalTime.of(10,35), DayOfWeek.MONDAY),
                new Airline("London", 107, "Boeing747", LocalTime.of(5,45), DayOfWeek.SATURDAY),
                new Airline("Abu Dhabi", 101, "Boeing747", LocalTime.of(1,5), DayOfWeek.SATURDAY),
                new Airline("Moscow", 101, "Boeing747", LocalTime.of(7,10), DayOfWeek.FRIDAY),
                new Airline("New-York", 101, "Boeing747", LocalTime.of(9,56), DayOfWeek.THURSDAY),
        });

        airlineAggregation.getByDestination("Tokyo");
        airlineAggregation.getByDayOfWeek(DayOfWeek.SATURDAY);
        airlineAggregation.getByDayOfWeekAndTime(DayOfWeek.FRIDAY, LocalTime.of(8,10));
    }
}
