package car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(LocalDate.now(), "winter", 12000, 22);
        Engine engine = new Engine(8, 320, false);

        Car car = new Car("BMW M5 Sport", wheel, engine);
        car.drive();

        car.stop();

        car.changeWheel(new Wheel(LocalDate.now(), "summer", 22000, 22));
    }
}
