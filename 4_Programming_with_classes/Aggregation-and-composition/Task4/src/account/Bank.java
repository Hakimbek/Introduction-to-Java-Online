package account;

import java.util.Arrays;
import java.util.Comparator;

public class Bank {
    // Все счета в банке
    private Account[] accounts;

    // Конструктор с входными параметрами
    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    // Default constructor
    public Bank() {
    }

    // Поиск по имени клиента
    public void getByClientName(String name) {
        for (Account account : accounts) {
            if (account.getClient().getName().equals(name)) {
                System.out.println(account);
            }
        }
    }

    // Поиск по уникальному номеру аккаунта
    public void getByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println(account);
                break;
            }
        }
    }

    // Блокировать счет
    public void blockTheAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.setActive(false);
                break;
            }
        }
    }

    // Активировать счет
    public void activateTheAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.setActive(true);
                break;
            }
        }
    }

    // Сортировать по номеру счета
    public void sortByAccountNumber() {
        Arrays.sort(accounts, Comparator.comparing(Account::getAccountNumber));
    }

    // Сортировать по имени клиента
    public void sortByClientName() {
        Arrays.sort(accounts, new AccountComparator());
    }

    // Вычисление общей суммы по счетам
    public double sum() {
        double sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    // Вычисление суммы по отрицательному балансу
    public double sumOfNegative() {
        double sum = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    // Вычисление суммы по положительноме балансу
    public double sumOfPositive() {
        double sum = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    // Методы get- и set-
    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
