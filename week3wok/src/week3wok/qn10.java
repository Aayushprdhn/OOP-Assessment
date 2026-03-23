package week3wok;

public class qn10 {
	public static void main(String[] args) {
		BankAccountV2 acc = new BankAccountV2(23110, 233.34, "Aayush", "Biratnagar 14");
		System.out.println("Balance via getter: "+ acc.getBalance());
		acc.Forprint();
	}
}

class BankAccountV2{
	private double balance;
	int accountNumber;
	String accountHolderName;
	String accountHolderAddress;
	
	public BankAccountV2(int accnum, double bal, String holdername,
			String holderaddress) {
		accountNumber = accnum;
		balance = bal;
		accountHolderName = holdername;
		accountHolderAddress = holderaddress;
	}
	
	public double getBalance() {
		return balance;
	}
	
	void Forprint() {
		System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Account Holder's Address: " + accountHolderAddress);
	}
}