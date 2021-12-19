package car;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {
    // Марка
    private String model;

    // Колеса
    private Wheel wheel;

    // Двигатель
    private Engine engine;


    public Car(String model, Wheel wheel, Engine engine) {
        this.model = model;
        this.wheel = wheel;
        this.engine = engine;
    }

    // Default constructor
    public Car() {
    }

    // Водить (заводит двугатель)
    public void drive() {
        engine.switchOn();
        System.out.println("Engine switch: " + engine.isSwitchedOn());
        System.out.println("Drive");
    }

    // Остановить (выключает двигатель)
    public void  stop() {
        engine.switchOff();
        System.out.println("Engine switch: " + engine.isSwitchedOn());
        System.out.println("Stop");
    }

    // Поменять колеса
    public void changeWheel(Wheel newWheel) {
        wheel = newWheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
