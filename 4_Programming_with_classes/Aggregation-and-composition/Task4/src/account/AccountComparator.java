package account;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return a1.getClient().getName().compareTo(a2.getClient().getName());
    }
}
