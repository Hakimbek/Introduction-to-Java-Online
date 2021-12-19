package state;

// Область состоит из городов и районов
public class Region {
    // Название области
    private String name;

    // Областные центры
    private String center;

    // В одной области может находится несколько районов
    private District[] districts;

    // В одной области может находится несколько городов
    private City[] cities;

    // Площадь области
    private double square;

    // Конструктор с входными параметрами
    public Region(String name, String center, District[] districts, City[] cities) {
        this.name = name;
        this.center = center;
        this.districts = districts;
        this.cities = cities;

        // Суммирует площадь районов
        if (districts != null) {
            for (District district : districts) {
                square += district.getSquare();
            }
        }

        // Суммирует площадь городов
        if (cities != null) {
            for (City city : cities) {
                square += city.getSquare();
            }
        }
    }

    // Default constructor
    public Region() {
    }

    // Методы get- и set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District[] getDistricts() {
        return districts;
    }

    public City[] getCities() {
        return cities;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public double getSquare() {
        return square;
    }
}
