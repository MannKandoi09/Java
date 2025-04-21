//Encapsulation
//Definition: Data ko hide karna aur access dena through methods (getters/setters).
//Example: Bank Account

class bankAccount{
    private double balance = 10000;

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        if (amount > 0 ){
            balance += amount;
        }
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
        bankAccount ba = new bankAccount();
        System.out.println("Balance: " + ba.getBalance());

        ba.deposit(5000);
        System.out.println("Updated Balance: " +ba.getBalance());

    }
}
