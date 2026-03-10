package week1;
import java.util.Scanner;
public class qn9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the principle amount:");
		double p= scanner.nextDouble();
		
		System.out.println("Enter the rate amount:");
		double r= scanner.nextDouble();
		
		System.out.println("Enter the time period:");
		double t= scanner.nextDouble();
		 
		double SI = (p*t*r)/100;
		
		System.out.println("The Interest amount is:"+ SI);
		scanner.close();
	}
}