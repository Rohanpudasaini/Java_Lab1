class SavingAccount extends BankAccount {
    private double MIN_BALANCE = 10000;

    public SavingAccount(int accountNumber, double balance) {
      super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
      if (amount > 0 && getBalance() - amount >= MIN_BALANCE) {
        super.withdraw(amount);
      } else {
        System.out.println("Invalid amount most likely a minimum balance violation, please check if your remaning balance is greater than $"+MIN_BALANCE+" or not");
      }
    }
  }