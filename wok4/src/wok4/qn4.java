package wok4;

public class qn4 {
	public static void main(String[] args) {
		employee Employee = new employee("Biratnagar-14", "SSD");
	}
}

class Person{
	protected String address;
}

class employee extends Person{
	String department;
	
	public employee(String address, String department) {
		this.address = address;
		this.department = department;
		
		System.out.println("Address: "+ address);
		System.out.println("Department:"+ department);
	}
}