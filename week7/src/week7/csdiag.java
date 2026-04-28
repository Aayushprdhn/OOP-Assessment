package week7;

public class csdiag {
	public static void main(String[] args) {
		
	}
}

class Customer{
	protected String Firstname;
	protected String Lastname;
	
	public Customer(String Fname, String Lname) {
		this.Firstname = Fname;
		this.Lastname = Lname;
	}
	
	public void displayCustomer() {
		System.out.println("Customer" +Firstname +" " + Lastname);
	}
}

class Account extends Customer{
	private int accountNumber;
	private double balance;
	
	public Account(String Firstname, String Lastname, int accountNumber, double balance) {
		super(Firstname, Lastname);
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: "+amount);
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw:"+amount);
		} else {
			System.out.println("Insufficient balance!");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void displayAccount() {
		displayCustomer();
		System.out.println("Account No:"+ accountNumber);
		System.out.println("Balance:"+ balance);
	}
}
