package wok6;
import java.util.*;
public class qn2 {
	public static void main(String[] args) {
		
		LinkedList <Integer> number = new LinkedList<>();
		
		number.add(2);
		number.add(1);
		number.addFirst(0);
		number.addLast(6);
		
		System.out.println(number);
			if (number.isEmpty()) {
				System.out.println("The list is Empty");
			}
		}
}