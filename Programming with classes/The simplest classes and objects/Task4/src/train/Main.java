package train;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Train[] trains = {
                new Train("Los Angeles", 15, LocalDateTime.of(2021,10,23,15,30)),
                new Train("London", 10, LocalDateTime.of(2021,11,14,10,30)),
                new Train("Paris", 11, LocalDateTime.of(2021,10,16,9,45)),
                new Train("Paris", 5, LocalDateTime.of(2021,9,1,12,0)),
                new Train("Paris", 17, LocalDateTime.of(2021,12,31,23,30))
        };

        System.out.println("Sort by train number");
        Train.sortByTrainNumber(trains);
        Train.print(trains);

        System.out.println("Sort by destination name and departure time");
        Train.sortByDestinationName(trains);
        Train.print(trains);

        Train.findByTrainNumber(trains, 10);
    }
}
