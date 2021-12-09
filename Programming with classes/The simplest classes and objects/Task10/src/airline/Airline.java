package airline;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
 * set-и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Airline,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
 *  a) список рейсов для заданного пункта назначения;
 *  b) список рейсов для заданного дня недели;
 *  c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Airline {
    // Пункт назначения
    private String destination;

    // Номер рейса
    private int flightNumber;

    // Тип самолета
    private String aircraftType;

    // Время вылета
    private LocalTime departureTime;

    // Дни недели
    private DayOfWeek daysOfWeek;

    // Конструктор с входными параметрами
    public Airline(String destination, int flightNumber, String aircraftType, LocalTime departureTime, DayOfWeek daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    // Default constructor
    public Airline() {
    }

    // Методы get- и set-
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DayOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }

}
