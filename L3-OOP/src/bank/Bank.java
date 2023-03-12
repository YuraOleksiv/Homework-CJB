package bank;

import account.Account;

public class Bank {
    private String bankName;
    private String bankCode;
    private Double moneyAmount;
    public static int amountOfAccounts = 0;

    public Bank () {

    }
    public Bank (String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        moneyAmount = 4000.0;
    }

    public void addAccount(Account account) {
        moneyAmount += account.getAccountBalance();
        amountOfAccounts++;
        System.out.println("Account #" + account.getAccountNumber() + " was successfully added!");
    }
    public void removeAccount(Account account) {
        if (account.getAccountBalance() < 0) {
            System.out.println("Account can not be removed. The client has a credit");
        }
        else {
            moneyAmount -= account.getAccountBalance();

            amountOfAccounts--;
            System.out.println("Account #" + account.getAccountNumber() + " was successfully removed!");
        }
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Double getMoneyAmount() {
        return this.moneyAmount;
    }

    public void getMoneyAmountInfo() {
        System.out.println("Total amount of money in " + this.bankName + " : " + this.moneyAmount);
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public static void getAmountOfAccounts() {
        System.out.println("We have " + amountOfAccounts + " active clients in our banks");
    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    @Override
    public String toString() {
        return this.bankName + this.bankCode + this.moneyAmount;
    }
}
