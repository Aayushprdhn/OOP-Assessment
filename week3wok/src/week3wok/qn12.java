package week3wok;

public class qn12 {
	public static void main(String[] args) {
		Customer cus1 = new Customer(1, "Aayush", 123);
		Customer cus2 = new Customer(2, "Prithivi", 234);
		Customer cus3 = new Customer(3, "Ballav", 345);
		
	}
}

class Customer{
	private int customerID;
	private String name;
	private int BankAccount;
	
	public Customer(int customerID, String name, int BankAccount) {
		this.customerID = customerID;
		this.name = name;
		this.BankAccount = BankAccount;
		
		System.out.println("CustomerID: "+ customerID);
		System.out.println("Name: "+ name);
		System.out.println("Bank Account: "+ BankAccount);
	}
}