package account;

import bank.Bank;
import user.BankClient;

public class CreditAccount extends Account {
    private Double accountLimit;

    public CreditAccount() {

    }
    public CreditAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
        if (user.getAge() < 18) {
            this.accountLimit = 100.0;
        }
        else {
            this.accountLimit = 10000.0;
        }
    }

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }

    @Override
    public void withdraw(Double amount) {
        double resultAccountBalance = getAccountBalance() - amount;

        if (amount <= 0) {
            System.out.println("Amount can not be negative");
        } else if (resultAccountBalance <  -getAccountLimit()) {
            System.out.println("You can not go over your credit limit");
        } else {
            System.out.println("Commission of credit account withdraw is 10%" +
                    "\nyou will get an amount: " + (amount - (amount*0.1)) + " UAH");
            setAccountBalance(getAccountBalance() - amount);
            getBank().setMoneyAmount(getBank().getMoneyAmount() - amount*0.9);
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Credit limit: " + this.accountLimit + " UAH";
    }


}
