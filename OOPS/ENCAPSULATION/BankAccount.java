package OOPS.ENCAPSULATION;

public class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public int getEnginenumber() {
        return 23541;
    }

    public void deposit(int amount) {
        if (amount > 0){
            balance+=amount;
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            balance-=amount;
        }
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(2000);
        a.withdraw(  200);
        System.out.println("Current Amount " + a.getBalance());
        BankAccount b = new BankAccount();
        System.out.println(b.getEnginenumber());
    }
}
