package account;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(new Account[] {
           new Account(new Client("Hakimbek"), "123", 12.25, true),
           new Account(new Client("Arif"), "222", 256.25, true),
           new Account(new Client("Hakimbek"), "777", 0.25, true),
           new Account(new Client("Malika"), "000", 456.123, true),
           new Account(new Client("Hakimbek"), "789", 1111.1, true),
        });

        for (Account account : bank.getAccounts()) {
            System.out.println(account);
        }
    }
}
