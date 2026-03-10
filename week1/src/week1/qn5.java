package week1;

import java.util.Scanner;

public class qn5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle:");
		double L = scanner.nextDouble();
		
		System.out.println("Enter the width of the rectangle:");
		double W = scanner.nextDouble();
		
		double P = 2*(L+W);
		
		System.out.println("The perimeter of the rectangle is:"+ P);
		scanner.close();
	}
}