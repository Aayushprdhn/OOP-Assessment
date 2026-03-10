package week1;
import java.util.Scanner;
public class qn13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the quantity of the product:");
		double quantity = scanner.nextDouble();
		
		System.out.println("Enter the price of the product:");
		double price = scanner.nextDouble();
		
		double cost= price*quantity;
		
		System.out.println("Total cost of the Product is:"+cost);
		scanner.close();
	}
}