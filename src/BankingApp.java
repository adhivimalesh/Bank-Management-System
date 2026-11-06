import java.util.Scanner;

public class BankingApp {


public static void main(String[] args) {

    int accountCount = 0;
    BankAccount[] accounts = new BankAccount[100];

    Scanner sc = new Scanner(System.in);

    boolean step = true;

    while (step) {

        System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
        System.out.println("1. Create Account");
        System.out.println("2. Display Account Details");
        System.out.println("3. Check Balance");
        System.out.println("4. Deposit Money");
        System.out.println("5. Withdraw Money");
        System.out.println("6. Transaction History");
        System.out.println("7. Exit");

        System.out.print("Enter your choice: ");

        int choice = getValidInteger(sc);

        switch (choice) {


            case 1: {

                if (accountCount == accounts.length) {
                    System.out.println("Account Limit Reached!");
                    break;
                }

                sc.nextLine();

                System.out.print("Enter Account Holder Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Account Number: ");
                int accountNumber = getValidInteger(sc);

                boolean exists = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accountNumber == accounts[i].getAccountNumber()) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("Account Already Exists!");
                    break;
                }

                System.out.print("Enter Initial Deposit Amount: ");
        double initialAmount = getValidDouble(sc);

                try {

                    accounts[accountCount] =
                        new BankAccount(name, accountNumber, initialAmount);

                    System.out.println("Account Created Successfully!");

                    accountCount++;

                } catch (IllegalArgumentException e) {

                    System.out.println("Account Creation Failed! " + e.getMessage());
                }

                break;
            }


            case 2: {

                if (accountCount == 0) {
                    System.out.println("No Accounts Found!");
                } else {

                    for (int i = 0; i < accountCount; i++) {
                        accounts[i].displayAccountDetails();
                    }
                }

                break;
            }


            case 3: {

                if (accountCount == 0) {
                    System.out.println("No Accounts Found!");
                    break;
                }

                System.out.print("Enter Account Number to Check Balance: ");
                int accnum = getValidInteger(sc);

                boolean found = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accnum == accounts[i].getAccountNumber()) {

                        System.out.println("Account Holder Name: "
                                + accounts[i].getAccountHolder());

                        System.out.println("Balance: "
                                + accounts[i].getBalance());

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not Found!");
                }

                break;
            }

    
            case 4: {

                if (accountCount == 0) {
                    System.out.println("No Accounts Found!");
                    break;
                }

                System.out.print("Enter Account Number to Deposit Money: ");
                int accnum = getValidInteger(sc);

                boolean found = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accnum == accounts[i].getAccountNumber()) {

                        found = true;

                        System.out.print("Enter Deposit Amount: ");
                        double depoamt = getValidDouble(sc);

                        accounts[i].deposit(depoamt);

                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not Found!");
                }

                break;
            }

    
            case 5: {

                if (accountCount == 0) {
                    System.out.println("No Accounts Found!");
                    break;
                }

                System.out.print("Enter Account Number to Withdraw Money: ");
                int accnum = getValidInteger(sc);

                boolean found = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accnum == accounts[i].getAccountNumber()) {

                        found = true;

                        System.out.print("Enter Withdraw Amount: ");
                double withamt = getValidDouble(sc);

                        accounts[i].withdraw(withamt);

                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not Found!");
                }

                break;
            }

            // TRANSACTION HISTORY
            case 6: {

                if (accountCount == 0) {
                    System.out.println("No Accounts Found!");
                    break;
                }

                System.out.print("Enter Account Number to View Transaction History: ");
                int accnum = getValidInteger(sc);

                boolean found = false;

                for (int i = 0; i < accountCount; i++) {

                    if (accnum == accounts[i].getAccountNumber()) {

                        accounts[i].displayTransactionHistory();

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not Found!");
                }

                break;
            }

            // EXIT
            case 7: {

                System.out.println("Thank You for Using Bank Management System!");

                step = false;

                break;
            }

            default:
                System.out.println("Invalid Choice! Please select 1 to 7.");
                break;
        }
    }

    sc.close();
}


public static int getValidInteger(Scanner sc) {

    while (!sc.hasNextInt()) {

        System.out.println("Invalid Input! Please enter an integer.");

        sc.next();
    }

    return sc.nextInt();
}

public static double getValidDouble(Scanner sc) {

    while (!sc.hasNextDouble()) {

        System.out.println("Invalid Input! Please enter a valid amount.");

        sc.next();
    }

    return sc.nextDouble();
}


}
