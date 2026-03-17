package week2wok;
import java.util.Scanner;
public class qn7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The number is even.");
			
			if(num%4==0) {
				System.out.println("It is also divisible by 4.");
			}else {
				System.out.println("It is not divisible by 4.");
			}
		}else {
			System.out.println("The number is odd.");
			
			if(num%7==0) {
				System.out.println("It is also divisible by 7.");
			}else {
				System.out.println("It is not divisible by 7.");
			}
		}
		sc.close();
	}
}