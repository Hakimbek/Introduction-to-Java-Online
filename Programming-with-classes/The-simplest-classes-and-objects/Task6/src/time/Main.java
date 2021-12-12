package time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(10,35,20);
        System.out.println(time);

        time.setHour(7);
        time.setMinute(55);
        time.setSecond(0);
        System.out.println(time);
    }
}
