import java.util.Scanner;

   public class Deposit {
   
    private double balance; 

    // Set the initial balance
    public void setBalance(double initialBalance) {
        balance = initialBalance;
    }

    // Add money to balance
    public void deposit(double depositamount) {
        if (depositamount > 0) {
            balance = depositamount + balance;
            System.out.println("Deposited: " + depositamount);
            System.out.println("Total balance: " + balance);
        } else {
            System.out.println("You cannot deposit less than 0");
        }
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }
 }

   