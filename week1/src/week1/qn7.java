package week1;

import java.util.Scanner;

public class qn7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Celcius:");
		double temp = scanner.nextDouble();
		
		double fern = (temp*1.8) + 32;
		System.out.println("The temperature in Fahrenheite is:" +fern);
		scanner.close();
	}
}