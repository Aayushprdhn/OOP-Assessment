package week2wok;
import java.util.Scanner;
public class qn1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle:");
		double length = sc.nextDouble();
		
		System.out.print("Enter the breadth of the rectangle:");
		double breadth = sc.nextDouble();
		
		if(length == breadth) {
			System.out.println("It is a square.");
		}else {
			System.out.println("It is not a sqaure.");
		}
		sc.close();
	}
}