package week3wok;

public class qn13 {
	public static void main(String[] args) {
		wok  a = new wok(123,233.34,"Aayush", "Biratnager 14");
		wok  b = new wok(234,211.34,"Prithivi", "Biratnager 14");
		wok  c = new wok(345,23323.34,"Ballav", "Biratnager 12");
	}
}

class wok extends BankAccount{
	
	public wok(int accountNumber, double balance,
			String accountHolderName,
			String accountHolderAddress) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Account Holder's Name: "+accountHolderName);
		System.out.println("Account Holder's Address: "+ accountHolderAddress);
		
	}
	
	public wok(int accountNumber, double balance, 
			String accountHolderName) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Account Holder's Name: "+accountHolderName);
		
	}
	
	public wok(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+balance);
	}
}