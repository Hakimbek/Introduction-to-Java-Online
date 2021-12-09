package time;

/**
 * Составить описание класса для представления времени. Предусмотрите возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значении 0. Саздать методы изменения
 * времени на заданное количество часов, минут и секунд.
 */
public class Time {
    // Часы
    private int hour;

    // Минуты
    private int minute;

    // Секунды
    private int second;

    // Конструктор с входными параметрами
    public Time(int hour, int minute, int second) {
        if ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    // Default конструктор
    public Time() {
    }


    // Методы get- и set-
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        return hour + "h " + minute + "m " + second + "s";
    }
}
