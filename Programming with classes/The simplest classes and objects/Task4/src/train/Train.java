package train;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Train {
    // Пункт назначения
    private String destinationName;

    // Номер поезда
    private int trainNumber;

    // Время отправления
    private LocalDateTime departureTime;

    // Конструктор с входными параметрами
    public Train(String destinationName, int trainNumber, LocalDateTime departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    // Default конструктор
    public Train() {
    }

    // Методы get- и set-
    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    // Override toString method
    @Override
    public String toString() {
        return destinationName + " " + trainNumber + " " + departureTime;
    }

    // Метод, который сортирует элементы массива по номерам поездов
    public static void sortByTrainNumber(Train[] trains) {
        Comparator<Train> trainComparator = Comparator.comparing(Train::getTrainNumber);
        Arrays.sort(trains, trainComparator);
    }

    // Метод, который сортирует элементы массива по пункту назначения
    // Поезда с одинаковыми пунктами назначения упорядочивает по времени отправления
    public static void sortByDestinationName(Train[] trains) {
        Comparator<Train> trainComparator = Comparator.comparing(Train::getDestinationName).thenComparing(Train::getDepartureTime);
        Arrays.sort(trains, trainComparator);
    }

    // Print
    public static void print(Train[] trains) {
        System.out.printf("%16s %15s %20s\n", "Destination name", "Train number", "Departure name");
        System.out.printf("%16s %15s %20s\n", "----------------", "------------", "--------------");
        for (Train train : trains) {
            System.out.printf("%16s %15s %20s\n", train.getDestinationName(), train.getTrainNumber(), train.getDepartureTime());
        }
    }

    // Метод, который выводит информацию о поезде, номер которого введен пользователем
    public static void findByTrainNumber(Train[] trains, int trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                System.out.println(train);
            }
        }
    }
}
