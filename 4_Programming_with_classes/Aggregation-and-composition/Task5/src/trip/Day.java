package trip;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Day {
    // День вылета
    private LocalDate departureDay;

    // День прилета
    private LocalDate arrivalDay;

    // Продолжительность тура
    private Period tourDuration;

    // Конструктор с входными параметрами
    public Day(LocalDate departureDay, LocalDate arrivalDay) {
        this.departureDay = departureDay;
        this.arrivalDay = arrivalDay;
        this.tourDuration = Period.between(departureDay, arrivalDay);
    }

    // Default constructor
    public Day() {
    }

    // Методы get- и set-
    public LocalDate getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(LocalDate departureDay) {
        this.departureDay = departureDay;
    }

    public LocalDate getArrivalDay() {
        return arrivalDay;
    }

    public void setArrivalDay(LocalDate arrivalDay) {
        this.arrivalDay = arrivalDay;
    }

    public Period getTourDuration() {
        return tourDuration;
    }

    @Override
    public String toString() {
        return "Day{" +
                "departureDay=" + departureDay +
                ", arrivalDay=" + arrivalDay +
                ", tourDuration=" + tourDuration +
                '}';
    }
}
