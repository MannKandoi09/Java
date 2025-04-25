//4. Write a class BankAccount that has a static variable bankName,
//and instance variables accountHolder and balance. Initialize static variable using a static block.
//        Concepts: Static Keyword, Static Block


class BankAccount{
    static String bankName;
    String accountHolder;
    double Balance;

    static {
        bankName = "Static Bank of Java";
    }

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        Balance = balance;
    }


    public void displayAccountInfo(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("AccountHolder: " + accountHolder);
        System.out.println("Balance: " + Balance);

    }
}


public class main4 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Mann", 50000);
        BankAccount acc2 = new BankAccount("Meet", 80000);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();


    }
}
