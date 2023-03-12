import account.*;
import bank.Bank;
import user.BankClient;

public class Main {
    public static void main(String[] args) {

        Bank bank1 = new Bank("Boolbank", "0100");
        Bank bank2 = new Bank("Carambank", "0200");

        BankClient client1 = new BankClient(1, "Varenyk", 19,
                "varenyk@mail.com", "+111 456 789", "qwerty",
                "13 Kartopliana str.");
        BankClient client2 = new BankClient(2, "Pan Kapusta", 35,
                "kapust@mail.com", "+222 456 789", "q2w2e2r2t2y",
                "23 Kartopliana str.");
        BankClient client3 = new BankClient(3, "Bart", 12,
                "barts@mail.com", "+333 456 789", "q3werty",
                "33 Cartoon str.");
        BankClient client4 = new BankClient(4, "Lisa", 10,
                "lis@mail.com", "+444 456 789", "q4werty",
                "33 Cartoon str.");
        BankClient client5 = new BankClient(5, "Homer", 42,
                "dough@mail.com", "+555 456 789", "q5werty",
                "33 Cartoon str.");
        BankClient client6 = new BankClient(6, "Marge", 37,
                "marge@mail.com", "+666 456 789", "q6werty",
                "33 Cartoon str.");

        CreditAccount account1 = new CreditAccount("123-456789",2000.0, client1, bank1);
        CreditAccount account2 = new CreditAccount("223-456789",16000.0, client2, bank1);
        DebitAccount account3 = new DebitAccount("323-456789", 2000.0, client3, bank2);
        DebitAccount account4 = new DebitAccount("423-456789", 3500.0, client4, bank2);
        DebitAccount account5 = new DebitAccount("523-456789", 16000.0, client5, bank2);
        DebitAccount account6 = new DebitAccount("623-456789", 18000.0, client6, bank2);

        bank1.getMoneyAmountInfo();
        bank1.addAccount(account1);
        Bank.getAmountOfAccounts();
        bank1.getMoneyAmountInfo();
        account1.withdraw(1800.0);
        System.out.println(account1.getAccountBalance());
        bank1.getMoneyAmountInfo();
        account1.withdraw(1000.0);
        Bank.getAmountOfAccounts();
        System.out.println(account1);
        bank2.addAccount(account2);


    }
}