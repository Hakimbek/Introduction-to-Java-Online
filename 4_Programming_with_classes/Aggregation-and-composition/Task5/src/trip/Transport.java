package trip;

public class Transport {
    // С аэропорта до отеля
    private boolean hasTransfer;

    // Тип
    private String type;

    // Конструктор с входными параметрами
    public Transport(boolean hasTransfer, String type) {
        this.hasTransfer = hasTransfer;
        this.type = type;
    }

    // Default constructor
    public Transport() {
    }

    // Методы get- и set-
    public boolean isHasTransfer() {
        return hasTransfer;
    }

    public void setHasTransfer(boolean hasTransfer) {
        this.hasTransfer = hasTransfer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "hasTransfer=" + hasTransfer +
                ", type='" + type + '\'' +
                '}';
    }
}
