package customer;

public class Main {
    public static void main(String[] args) {
        CustomerAggregation customerAggregation = new CustomerAggregation(
                new Customer[] {
                        new Customer(1,"Alexandr", "Pushkin", "Sergeevich", "Russia", 1,10),
                        new Customer(2,"Robert", "Luis", "Stevenson", "Scotland", 77,127),
                        new Customer(3,"Jonatan", "Swift", "","London", 222,89),
                        new Customer(4,"Main", "Rid", "", "USA", 1,147),
                        new Customer(5,"James", "Fenimore", "Cooper", "USA", 6,5),
                        new Customer(6,"Alexey", "Tolstoy", "", "Russia", 669,816),
                        new Customer(7,"Artur", "Conan", "Doyle", "London", 18,151),
                        new Customer(8,"Daniel", "Defoe", "", "France", 11,11),
                        new Customer(9,"Valter", "Scott", "", "London", 14,101),
                        new Customer(10,"Mark", "Twain", "", "USA", 123,707)
                }
        );

        customerAggregation.print();

        System.out.println("Costumers after sorting");
        customerAggregation.sortByName();
        customerAggregation.print();

        customerAggregation.getRangeOfCards(10, 100);
    }
}
