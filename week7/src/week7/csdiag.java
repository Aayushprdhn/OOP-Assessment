package week7;

public class csdiag {
	public static void main(String[] args) {
		
	}
}

class Customer{
	protected String Fname;
	protected String Lname;
	
	public Customer(String Fname, String Lname) {
		this.Fname = Fname;
		this.Lname = Lname;
	}
	
	public void displayCustomer() {
		System.out.println("Customer" +Fname +" " + Lname);
	}
}

class Account extends Customer{
	private int accountnumber;
	
}