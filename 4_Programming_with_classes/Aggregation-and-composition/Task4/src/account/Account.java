package account;

/**
 * Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account {
    // Клиент
    private Client client;

    // Номер счета
    private String accountNumber;

    // Баланс
    private double balance;

    // Активность
    private boolean isActive;

    // Конструктор с входными параметрами
    public Account(Client client, String accountNumber, double balance, boolean isActive) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isActive = isActive;
    }

    // Default constructor
    public Account() {
    }

    // Методы get- и set-
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", isActive=" + isActive +
                '}';
    }
}
