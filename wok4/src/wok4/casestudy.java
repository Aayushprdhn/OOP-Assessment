package wok4;
import java.util.Scanner;
public class casestudy {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		String number = "";
		String DOB = "";
		String password = "";
		
		while (true) {
			System.out.println("Please enter 1 for Sign up.");
			System.out.println("Please enter 2 to Quit.");
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				scanner.nextLine();
				
				while (true) {
					System.out.println("Please enter your full name: ");
					name = scanner.nextLine();
					int len = name.length();
					
					if (len<4) {
						System.out.println("The Length must be greater than 4");
						continue;
					}
					break;
				}
				
				while (true) {
					System.out.println("Please enter your phone number: ");
					number = scanner.nextLine();
					
					int len2 = number.length();
					
					if (len2!=10 || !number.startsWith("0")) {
						System.out.println("The total digit should be 10 and start with 0.");
						continue;
					}
					break;
				}
				while(true) {
					System.out.println("Please enter your date of  (DD//MM//YY): ");
					DOB = scanner.nextLine();
					
					int len3 = DOB.length();
				if (!DOB.matches("\\d{2}/\\d{2}/\\d{4}")) {
					System.out.println("Invalid format.");
					continue;
				}
				int year = Integer.parseInt(DOB.substring(6));
				int age = 2026 - year;
				
				if (age<21) {
					System.out.println("Age must atleast be 21 years old");
					continue;
				}
				break;
				}
				while (true) {
				System.out.println("Please enter your password: ");
				password = scanner.nextLine();
				
				if (!password.matches("[A-Za-z]+[@&][0-9]+")) {
					System.out.println("Password must start with letters, contain @ and end with numbers");
					continue;
				}
				System.out.println("Please confirm your password");
				String confirmPass = scanner.nextLine();
				
				if (!password.equals(confirmPass)) {
					System.out.println("Password do not match");
					continue;
				}
				break;
				}
				
				userSignup user  = new userSignup(name, number, DOB, password);
				System.out.println("You have successfully signed up.");
			}
			else if (choice == 2) {
				System.out.println("Thank you for using this application.");
				break;
			}
		
		}
	}
}

class userSignup{
	String name;
	String number;
	String DOB;
	String password;
	
	public userSignup(String name, String number, String DOB, String password) {
	this.name = name;
	this.number = number;
	this.DOB = DOB;
	this.password = password;
	
	System.out.println("User Registered.");
	}
}