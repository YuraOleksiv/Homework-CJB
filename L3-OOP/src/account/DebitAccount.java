package account;

import bank.Bank;
import user.BankClient;

public class DebitAccount extends Account {

    public DebitAccount() {}
    public DebitAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
    }

    @Override
    public void withdraw(Double amount) {
        if (amount <= 0) {
            System.out.println("Amount can not be negative");
        } else if (getAccountBalance() - amount < 0) {
            System.out.println("You can not withdraw more than you have");
        } else {
            System.out.println("You will get money without any commission: " + amount + " UAH");
            setAccountBalance(getAccountBalance() - amount);
            getBank().setMoneyAmount(getBank().getMoneyAmount() - amount*0.9);
        }
    }
}
