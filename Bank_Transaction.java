//package 1exp.;

// File: Bank_Transaction.java
public class Bank_Transaction {
    private String accountName;  // SBI, Canara, Bank of Baroda
    private String accountHolderName;
    private String accountType;  // saving or business
    private long accountNumber;
    private double balance;

    public Bank_Transaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransactionInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Bank_Transaction transaction = new Bank_Transaction("SBI", "John Doe", "saving", 123456789012L, 50000.00);
        transaction.displayTransactionInfo();
    }
}
