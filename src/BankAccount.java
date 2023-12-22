class BankAccount {
  private int accountNumber;
  private double balance;

  public BankAccount(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited " + amount + " to account " + accountNumber);
    } else {
      System.out.println("Invalid amount");
    }
  }

  public void withdraw(double amount) {
   
    if (amount > 0 && amount <= balance) {
      
      balance -= amount;
      
      System.out.println("Withdrew " + amount + " from account " + accountNumber);
    } else {
      System.out.println("Invalid amount or insufficient balance");
    }
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }
}

