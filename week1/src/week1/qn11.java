package week1;
import java.util.Scanner;
public class qn11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the distance in miles:");
		double mile= scanner.nextDouble();
		
		double km = mile*1.60934;
		
		System.out.println("The distance in kilometer is "+ km);
		
		scanner.close();
	}
}