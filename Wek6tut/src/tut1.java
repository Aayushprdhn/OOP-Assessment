import java.util.*;
public class tut1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Aayush");
		a.add("Aa");
		a.add("Aayuh");
		a.add("Ayush");
		a.add("h");
		System.out.println(a);
		
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}	
}