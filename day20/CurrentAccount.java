package day20;

public class CurrentAccount extends BankAccount {
  private double overdraftLimit;

  public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
    super(accountNumber, balance);
    this.overdraftLimit = overDraftLimit;
  }

  @Override
  public void withdraw(double amount) {
    double currentBalance = getBalance();
    if (currentBalance + overdraftLimit >= amount) {
        System.out.println("Withdrawing: " + amount);
        deposit(-amount);
    } else {
        System.out.println("Exceeds overdraft limit.");
    }
  }
}
