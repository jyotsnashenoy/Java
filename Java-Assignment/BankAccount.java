import java.util.Scanner;

class BankAccount {
    int acc_no = 45678765;
    int balance = 1000;
    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.println("Amount to be deposited : ");
        int amt = sc.nextInt();
        balance = balance + amt;
        System.out.println("Balance after depositing = " + balance);
    }

    void withdraw() {
        System.out.println("Amount to be withdrawn : ");
        int amt = sc.nextInt();
        if (amt > balance) {
            System.out.println("Insufficient balance.\tBalance = " + balance);
        } else {
            balance = balance - amt;
            System.out.println("Balance after withdrawing = " + balance);
        }
    }

    void display() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.display();
        b.deposit();
        b.withdraw();
        b.display();

    }
}
