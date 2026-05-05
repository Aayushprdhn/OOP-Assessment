import java.util.*;
public class task3 {
	public static void main(String[] args) {
		//task4
		LinkedList<String> obj = new LinkedList<>();
		obj.add("BIC");
		obj.add("II");
		obj.addFirst("First");
		obj.addLast("Last");
		System.out.println(obj);
		if(obj.isEmpty()) {
			 System.out.println(obj.indexOf("BIC"));
			 System.out.println(obj.lastIndexOf("BIC"));
		}
	}
}
