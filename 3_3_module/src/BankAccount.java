public class BankAccount {
    private static int totalAccounts = 0;
    private static int nextAccNum = 1001;
    private double balance;
    private int accountNum;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNum = nextAccNum;
        totalAccounts++;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public int getAccountNum() {
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        BankAccount bankAccount2 = new BankAccount(750);
        BankAccount bankAccount3 = new BankAccount(1230);
        bankAccount.withdraw(500);
        bankAccount2.deposit(500);
        bankAccount.deposit(723);
        bankAccount2.withdraw(329);
        bankAccount3.deposit(26);

        System.out.println("Account " + bankAccount.getAccountNum() + "and balance: " + bankAccount.getBalance());
        System.out.println("Account " + bankAccount2.getAccountNum() + "and balance: " + bankAccount2.getBalance());
        System.out.println("Account " + bankAccount3.getAccountNum() + "and balance: " + bankAccount3.getBalance());
        System.out.println("Total number of bank accounts: " + BankAccount.getTotalAccounts());
    }
}

