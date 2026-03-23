package week3wok;

public class qn5 {
	public static void main(String[] args) {
		childClass acc = new childClass();
		acc.accountNumber = 23110;
		acc.balance = 4533.34;
		acc.accountHolderName = "Aayush";
		acc.accountHolderAddress = "Biratnagar 14";
		acc.Forprint();
		acc.depositMoney(233.69);
		acc.withdrawMoney(100.15);
	}
}

class childClass extends BankAccount{
	void depositMoney(double n) {
		balance += n;
		System.out.println("Deposited: "+ n);
		System.out.println("New Balance: "+ balance);
	}
	
	void withdrawMoney(double n) {
		balance -= n;
		System.out.println("Withdraw: "+ n);
		System.out.println("Naya Balance: "+ balance);
	}
}