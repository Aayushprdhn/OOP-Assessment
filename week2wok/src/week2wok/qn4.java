package week2wok;
import java.util.Scanner;
public class qn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of people: ");
		int n = sc.nextInt();
		
		int oldest = Integer.MIN_VALUE;
		int youngest = Integer.MAX_VALUE;
		
		for(int i = 1; i<=n; i++) {
			System.out.print("Enter age of a person " + i +":");
			int age = sc.nextInt();
			
			if (age>oldest) {
				oldest = age;
			}
			if(age<youngest) {
				youngest = age;
			}
		}
		System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
        sc.close();
	}
}