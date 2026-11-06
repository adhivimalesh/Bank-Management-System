# Bank Management System

A simple console-based banking application built in Java. I made this project to practise Java OOP concepts by building something practical.

## Features

- Create a bank account
- Manage multiple accounts
- Prevent duplicate account numbers
- View account details
- Check account balance
- Deposit money
- Withdraw money
- View transaction history
- Validate user input
- Handle invalid operations without crashing

## 📸 Application Screenshots

### Main Menu
![Main Menu](screenshots/main-menu.jpg)

### Create Account
![Create Account](screenshots/create-account.jpg)

### Check Balance
![Check Balance](screenshots/check-balance.jpg)

### Deposit
![Deposit](screenshots/deposit.jpg)

### Withdraw
![Withdraw](screenshots/withdraw.jpg)

### Transaction History
![Transaction History](screenshots/transaction-history.jpg)


## Technologies and Concepts Used

**Language:** Java (no external libraries)

**Java and OOP concepts:**

- **Classes and Objects** – each bank account is an object created from the `BankAccount` class
- **Encapsulation** – account data is kept private and accessed through methods
- **Constructors** – used to set up a new account when it is created
- **Arrays** – used to store and manage multiple accounts
- **ArrayList** – used to store the transaction history of an account
- **Exception Handling** – used to deal with invalid operations
- **Input Validation** – user input is checked before it is used
- **Scanner** – used to take input from the console

## Project Structure

```
bank_management_system/
├── src/
│   ├── BankAccount.java
│   └── BankingApp.java
├── .gitignore
└── README.md
```

- `BankAccount.java` – the account class (account details, deposit, withdraw, transaction history)
- `BankingApp.java` – the main program that takes user input and works with the accounts

## How to Run

Make sure the JDK is installed, then run these commands from the project folder.

1. Compile the Java files:

```
javac -d out src/BankAccount.java src/BankingApp.java
```

2. Run the application:

```
java -cp out BankingApp
```

## What I Learned

While building this project, I practised:

- Creating classes and objects
- Using encapsulation to protect data
- Working with constructors and methods
- Managing multiple objects using arrays
- Using an ArrayList for transaction history
- Handling exceptions
- Writing reusable methods
- Validating user input

## Future Improvements

- Save account data to a file so it isn't lost when the program closes
- Add a database for permanent storage
- Add a simple GUI
- Add a PIN or password for each account

## Author

Built as part of my Java learning journey.
