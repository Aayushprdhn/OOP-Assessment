package wok6;
import java.util.*;
public class qn6 {
	public static void main(String[] args) {
		
		Stack <String> word = new Stack<>();
		
		word.push("Hello");
		word.push("World");
		System.out.println(word);
		
		List<String> reverse = word.reversed();
		System.out.println(reverse);
	}
}
