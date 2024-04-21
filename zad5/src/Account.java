public class Account {
    private long balance;
    static final Object synchronizationFlag = new Object();

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() { return balance; }

    public void setBalance(long addedMoney) {
            balance = balance + addedMoney;
    }

    public static synchronized void transaction(long addedMoney, Account account1, Account account2) {
        account1.setBalance(addedMoney);
        account2.setBalance(-addedMoney);
    }
}
