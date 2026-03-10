package week1;
import java.util.Scanner;
public class qn15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		double a= scanner.nextDouble();
		
		System.out.println("Enter the second Number:");
		double b= scanner.nextDouble();
		
		double sum= a+b;
		double difference= a-b;
		double product= a*b;
		double quotient= a/b;
		
		System.out.println("Sum:"+sum);
		System.out.println("Difference:"+difference);
		System.out.println("Product:"+product);
		System.out.println("Quotient:"+quotient);
		scanner.close();
	}
}