import java.util.*;
public class suru {
	public static void main(String[] agrs) {
		Boc<Integer> a = new Boc<>();
		Boc<String> b = new Boc<>();
		
		a.set(69);
		System.out.println(a.get());
		
		b.set("Aayush");
		System.out.println(b.get());
}
}

class Boc<T>{
	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	public T get() {
		return value;
	}
}