public class Account {
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() { return balance; }

    public void setBalance(long addedMoney) { balance = balance + addedMoney; }

    public void operacja() {}
}
