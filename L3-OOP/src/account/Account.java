package account;
import bank.Bank;
import user.BankClient;


public abstract class Account {
    private String accountNumber;
    private Double accountBalance;
    private BankClient user;
    private Bank bank;

    public Account() {}
    public Account(String accountNumber, Double accountBalance, BankClient user, Bank bank) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.user = user;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankClient getUser() {
        return user;
    }

    public void setUser(BankClient user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void withdraw(Double amount) {

    }

    @Override
    public String toString() {
        return "Client ID: " + user.getId() + "\n" +
                "Client name: " + user.getName() + "\n" +
                "Bank name: " + bank.getBankName() + "\n" +
                "Account balance: " + this.accountBalance  + " UAH";
    }
}