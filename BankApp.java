import java.util.Scanner;

class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient funds!");
    }
    public void show() { System.out.println(name + " Balance: " + balance); }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("Madhu", 1000);

        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Show Balance 4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.print("Enter amount: "); acc.deposit(sc.nextDouble()); break;
                case 2: System.out.print("Enter amount: "); acc.withdraw(sc.nextDouble()); break;
                case 3: acc.show(); break;
                case 4: System.out.println("Bye 👋"); sc.close(); return;
                default: System.out.println("Invalid!");
            }
        }
    }
}