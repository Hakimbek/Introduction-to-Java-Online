package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0,10,5);

        // Print current number
        System.out.println(counter.getCurrent());

        // Increase current
        counter.inc();
        System.out.println(counter.getCurrent());

        // Decrease current
        counter.dec();
        System.out.println(counter.getCurrent());
    }
}
