package week3wok;

public class qn7 {
	public static void main(String[] args) {
		
		newChild a = new newChild(1311,2332.22,"Aayush","Biratnagar 14");
		a.Forprint();
	}
}

class newChild extends BankAccount{
	
	public newChild(int accountNumber,
			double balance,
			String accountHolderName,
			String accountHolderAddress) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
	}
}