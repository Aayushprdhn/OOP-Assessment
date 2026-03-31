package wok4;

public class qn5 {
	public static void main(String[] args) {
		
	}
}

class Parent{
	private String a;
	public String b;
	public String  c;
}

class Child extends Parent{
	public Child(String a, String b, String c) {
		this.a = a; // cannot be accessed
		this.b = b;
		this.c = c;
	}
}