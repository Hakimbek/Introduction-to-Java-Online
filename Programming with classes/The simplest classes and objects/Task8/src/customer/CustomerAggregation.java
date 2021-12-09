package customer;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerAggregation {
    // Массив типа Customer
    private Customer[] customers;

    // Конструктор с входными параметрами
    public CustomerAggregation(Customer[] customers) {
        this.customers = customers;
    }

    // Default constructor
    public CustomerAggregation() {
    }

    // Методы get- и set-
    public Customer[] getCostumers() {
        return customers;
    }

    public void setCostumers(Customer[] customers) {
        this.customers = customers;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "ConsumerAggregation{" +
                "costumers=" + Arrays.toString(customers) +
                '}';
    }

    // Print consumers
    public void print() {
        System.out.printf("%10s %10s %10s %10s %5s %5s", "Name", "Surname", "FatherName", "Address", "Card", "Account\n");
        System.out.printf("%10s %10s %10s %10s %5s %5s", "----", "-------", "----------", "-------", "----", "-------\n");
        for (Customer customer : customers) {
            System.out.printf("%10s %10s %10s %10s %5d %5d\n", customer.getName(), customer.getSurname(), customer.getFatherName(), customer.getAddress(), customer.getCardNumber(), customer.getBankAccount());
        }
    }

    // Сортирует список в алфавитном порядке
    public void sortByName() {
        Comparator<Customer> comparator = Comparator.comparing(Customer::getName);
        Arrays.sort(customers, comparator);
    }

    // Сортирует список в алфавитном порядке
    // У которых номер кредитной карточки находится в заданном интервале
    public void getRangeOfCards(int from, int to) {
        for (Customer customer : customers) {
            if (customer.getCardNumber() >= from && customer.getCardNumber() < to) {
                System.out.println(customer);
            }
        }
    }
}
