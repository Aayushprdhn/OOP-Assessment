package week7;

public class csdiag {
	public static void main(String[] args) {
		Account acc1 = new Account("Aayush", "Pradhan", 101, 10000);
		Account acc2 = new Account("Ishan", "Shrestha", 100, 120000);
		
		System.out.println("Before Transaction");
		acc1.displayAccount();
		acc2.displayAccount();
		
		Transaction t = new Transaction();
		t.transfer(acc1, acc2, 500);
		
		System.out.println("After Transaction");
		acc1.displayAccount();
		acc2.displayAccount();
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
		System.out.println("Customer" +Firstname + " " + Lastname);
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
		System.out.println("Deposited: "+ amount);
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw:"+ amount);
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

class Transaction{
	public void transfer(Account fromAccount, Account toAccount, double amount) {
		if (fromAccount.getBalance() >= amount) {
			fromAccount.withdraw(amount);
			toAccount.deposit(amount);
			System.out.println("Transfer successful!");
		}else {
			System.out.println("Transfer failed! Insufficient balance.");
		}
	}
}