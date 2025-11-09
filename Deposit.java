public class Deposit {
   
  // Add money to balance
    public double deposit(double depositamount, double balance) {
        if (depositamount > 0) {
            balance = depositamount + balance;
            
            System.out.println("Deposited: " + depositamount);
            System.out.println("Total balance: " + balance);

        } else {
            System.out.println("You cannot deposit less than 0");
        }
        return balance;
    }
 }
