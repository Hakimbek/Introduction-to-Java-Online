package simpleClassesAndObjects.task4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Train {
    // Destination name of train
    private String destinationName;

    // Train number
    private int trainNumber;

    // Departure time of train
    private LocalDateTime departureTime;

    // Constructors
    public Train(String destinationName, int trainNumber, LocalDateTime departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public Train() {
    }

    // Getters and Setters
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

    // The method sorts ArrayList by train number
    public static void sortBuTrainNumber(ArrayList<Train> trains) {
        Comparator<Train> trainComparator = Comparator.comparing(Train::getTrainNumber);
        trains.sort(trainComparator);
    }

    // The method sorts ArrayList by destination name. If destination name is equal sort by departure time
    public static void sortByDestinationName(ArrayList<Train> trains) {
        Comparator<Train> trainComparator = Comparator.comparing(Train::getDestinationName).thenComparing(Train::getDepartureTime);
        trains.sort(trainComparator);
    }

    // Print
    public static void print(ArrayList<Train> trains) {
        System.out.printf("%16s %15s %20s\n", "Destination name", "Train number", "Departure name");
        System.out.printf("%16s %15s %20s\n", "----------------", "------------", "--------------");
        for (Train train : trains) {
            System.out.printf("%16s %15s %20s\n", train.getDestinationName(), train.getTrainNumber(), train.getDepartureTime());
        }
    }

    // Finds train by number and print it
    public static void findByTrainNumber(ArrayList<Train> trains, int trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                System.out.println(train);
            }
        }
    }
}
