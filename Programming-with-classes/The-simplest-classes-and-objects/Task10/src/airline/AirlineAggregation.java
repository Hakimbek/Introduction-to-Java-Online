package airline;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class AirlineAggregation {
    // Масси типа Airline
    private Airline[] airlines;

    // Конструктор с входными параметрами
    public AirlineAggregation(Airline[] airlines) {
        this.airlines = airlines;
    }

    // Default constructor
    public AirlineAggregation() {
    }

    // Методы get- и set-
    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "AirlineAggregation{" +
                "airlines=" + Arrays.toString(airlines) +
                '}';
    }

    // Находит список рейсов длязаданного пункта назначения
    public void getByDestination(String destination) {
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                System.out.println(airline);
            }
        }
    }

    // Находит список рейсов для заданного дня недели
    public void getByDayOfWeek(DayOfWeek dayOfWeek) {
        for (Airline airline : airlines) {
            if (airline.getDaysOfWeek().equals(dayOfWeek)) {
                System.out.println(airline);
            }
        }
    }

    // Находит список рейсов для заданного дня недели, время вылета для которых больше заданного
    public void getByDayOfWeekAndTime(DayOfWeek dayOfWeek, LocalTime time) {
        for (Airline airline : airlines) {
            if (airline.getDaysOfWeek().equals(dayOfWeek) && airline.getDepartureTime().isBefore(time)) {
                System.out.println(airline);
            }
        }
    }
}
