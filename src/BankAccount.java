import java.util.ArrayList;

class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

     private ArrayList<String> transactions = new ArrayList<>();

    BankAccount(String accountHolder, int accountNumber, double balance) {

    if (accountHolder == null || !accountHolder.matches("[a-zA-Z]+( [a-zA-Z]+)*")) {
    throw new IllegalArgumentException("Account Holder Name must contain alphabets only, with single spaces between words.");
}

        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Invalid Account Number");
        }

        if (balance <= 0) {
            throw new IllegalArgumentException("Initial Balance Must be Positive");
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

        transactions.add("Account Created | Initial Balance: " + balance);
    }

    public void displayAccountDetails() {

        System.out.println("Account Details:");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {

        if (amount < 0) {
            System.out.println("Deposit Failed! Amount Must Be Positive.");
        }
        else if (amount == 0) {
            System.out.println("Deposit Failed! Amount Must be greater than 0.");
        }
        else {
            balance += amount;

            System.out.println("Deposit Successful!\nBalance is: " + balance);

            transactions.add("Deposited: Rs." + amount);
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount! Amount Must Be Positive.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;

            System.out.println("Withdraw Successful!\nBalance is: " + balance);

            transactions.add("Withdrawn: Rs." + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
       
        return accountNumber;
    }

    public void displayTransactionHistory() {

        System.out.println("\n===== TRANSACTION HISTORY =====");
          System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);

        if (transactions.isEmpty()) {
            System.out.println("No Transactions Found!");
        }
        else {

            int count = 1;

            for (String item : transactions) {
                System.out.println(count + ". " + item);
                count++;
            }

            System.out.println("Total Transactions: " + transactions.size());
        }
    }
}