package week3;
import java.util.Scanner;
public class wok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		
		for(int i=2;i<=a;i++) {
			if(a%2==0) {
				System.out.println("..");
				continue;
			}
			System.out.println("..");
		}
		
		sc.close();
	}
}