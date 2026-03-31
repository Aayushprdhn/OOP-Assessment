package wok4;

public class qn6 {
	public static void main(String[] args) {
		
	}
}

final class finalClass{
	String name;
	String lastname;
	
	final public void namelast() {
		System.out.println(name);
		System.out.println(lastname);
	}
}

class subClass extends finalClass{
	public void namelast() {
		int a;
		int b;
		int sum;
		sum = a+b;
	}
}