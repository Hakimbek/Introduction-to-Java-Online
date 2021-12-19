package customer;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 *   a) список покупателей в алфавитном порядке;
 *   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {
    // Уникальный id
    private int id;

    // Имя
    private String name;

    // Фамилия
    private String surname;

    // Отчество
    private String fatherName;

    // Адрес
    private String address;

    // Номер кредитной карточки
    private int cardNumber;

    // Номер банковского счета
    private int bankAccount;

    // Конструктор с входными данными
    public Customer(int id, String name, String surname, String fatherName, String address, int cardNumber, int bankAccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    // Default конструктор
    public Customer() {
    }

    // Методы get- и set-
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }

}
