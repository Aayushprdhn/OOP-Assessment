package week1;
import java.util.Scanner;
public class qn14 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the amount in US dollar:");
		double currency= scanner.nextDouble();
		
		System.out.println("Enter the exachange rate:");
		double rate= scanner.nextDouble();
		
		System.out.println("The converted amount is:"+(currency*rate));
		scanner.close();
	}
}