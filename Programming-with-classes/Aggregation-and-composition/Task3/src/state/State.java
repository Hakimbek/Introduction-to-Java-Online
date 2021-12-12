package state;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class State {
    // Название государства
    private String name;

    // Области
    private Region[] regions;

    // Столица
    private String capital;

    // Площадь
    private double square;

    // Конструктор с входными параметрами
    public State(String name, Region[] regions, String capital) {
        this.name = name;
        this.regions = regions;
        this.capital = capital;

        // Суммирует площадь областей
        for (Region region : regions) {
            square += region.getSquare();
        }
    }

    // Default constructor
    public State() {
    }

    // Находит количество областей
    public void amountOfRegions() {
        int count = 0;
        for (Region region : regions) {
            count++;
        }
        System.out.println(count + " regions in state");
    }

    // Методы get- и set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getSquare() {
        return square;
    }
}
