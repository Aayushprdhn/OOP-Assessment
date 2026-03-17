package week2wok;
import java.util.Scanner;
public class qn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you have a medical cause? (y/n): ");
		char response = sc.next().charAt(0);
		
		if(response == 'y' || response == 'Y') {
			System.out.println("You are not allowed to sit in the exam.");
		}else if(response == 'n' || response == 'N') {
			System.out.println("You can sit in exam.");
		}else {
			System.out.println("Invalid input.");
		}
	}
}