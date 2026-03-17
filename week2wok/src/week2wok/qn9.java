package week2wok;
import java.util.Scanner;
public class qn9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many even numbers to sum: ");
		int n = sc.nextInt();
		
		int count = 1;
		int num = 2;
		int sum = 0;
		
		while(count<=n) {
			sum += num;
			num += 2;
			count++;
		}
		System.out.println("Sum of first " + n + "even numbers = "+ sum);
		sc.close();
	}
}