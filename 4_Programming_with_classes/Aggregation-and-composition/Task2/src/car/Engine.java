package car;

public class Engine {
    // Кол. цилиндров
    private int cylinder;

    // Лошадинная сила
    private int horsePower;

    // Состояние двугателя (default is false)
    private boolean switchedOn;

    // Конструктор с входными параметрами
    public Engine(int cylinder, int horsePower, boolean switchedOn) {
        this.cylinder = cylinder;
        this.horsePower = horsePower;
        this.switchedOn = switchedOn;
    }

    // Default constructor
    public Engine() {
    }

    // Включить
    public void switchOn() {
        switchedOn = true;
    }

    // Выключить
    public void switchOff() {
        switchedOn = false;
    }

    // Методы get- и set-
    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
