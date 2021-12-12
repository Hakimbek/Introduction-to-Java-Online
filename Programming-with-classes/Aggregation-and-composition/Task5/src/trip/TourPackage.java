package trip;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической
 * путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class TourPackage {
    // Тип (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
    private String type;

    // Числа дней
    private Day day;

    // Питание
    private Food food;

    // Транспорт
    private Transport transport;

    // Конструктор с входными параметрами
    public TourPackage(String type, Day day, Food food, Transport transport) {
        this.type = type;
        this.day = day;
        this.food = food;
        this.transport = transport;
    }

    // Default constructor
    public TourPackage() {
    }

    // Методы get- и set-
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "type='" + type + '\'' +
                ", day=" + day +
                ", food=" + food +
                ", transport=" + transport +
                '}';
    }
}
