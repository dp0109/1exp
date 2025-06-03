// File: Bank_Customer.java
public class Bank_Customer {
    private String custName;
    private int customerId;
    private String customerAddress;

    public Bank_Customer(String custName, int customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Address: " + customerAddress);
    }

    public static void main(String[] args) {
        Bank_Customer customer = new Bank_Customer("John Doe", 101, "123 Main Street");
        customer.displayCustomerInfo();
    }
}
