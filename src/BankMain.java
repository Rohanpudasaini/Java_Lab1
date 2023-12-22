public class BankMain {
    public static void main(String[] args){
    BankAccount Bnk1 = new BankAccount(1001, 1000000);
    SavingAccount Bnk2 = new SavingAccount(1002, 20000);
    System.out.println(Bnk1.getAccountNumber());
    System.out.println(Bnk1.getBalance());
    System.out.println(Bnk2.getAccountNumber());
    System.out.println(Bnk2.getBalance());
    Bnk1.withdraw(1000);
    System.out.println(Bnk1.getBalance());
    Bnk2.withdraw(11000);
    System.out.println(Bnk2.getBalance());
    Bnk2.withdraw(3000);
    System.out.println(Bnk2.getBalance());


    }
}
