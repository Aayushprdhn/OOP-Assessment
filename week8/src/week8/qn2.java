package week8;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class qn2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			BufferedWriter br = new BufferedWriter(new FileWriter("file/Student.csv",true));
			
			System.out.print("Enter the number of students: ");
			int num = sc.nextInt();
			
			String FirstName=null;
			String LastName=null;
			String Address=null;
			String ContactNumber=null;
			String Semester= null;
			
			for (int i=1;i<=num;i++) {
				
				System.out.print("Enter the Fist Name of the student:" );
				FirstName = sc.nextLine();
				
				System.out.print("Enter the Last Name of the student:" );
				LastName = sc.nextLine();
				
				System.out.print("Enter the Address of the student:" );
				Address = sc.nextLine();
				
				System.out.print("Enter the Contact number of the student:" );
				ContactNumber = sc.nextLine();
				
				System.out.print("Enter the Semester of the student:" );
				Semester = sc.nextLine();
			}
			
			Student student = new Student(FirstName, LastName, Address, ContactNumber, Semester);
			
			br.write(student.toCSV()+ "\n");
			student.toCSV();
			
			br.close();
			sc.close();
			
			System.out.println("The students data have been saved");
		} catch (IOException e) {
			System.out.println("There has been a error");
			e.printStackTrace();		
		}
	}
}

class Student{
	String FirstName;
	String LastName;
	String Address;
	String ContactNumber;
	String Semester;
	
	public Student(String FirstName, String LastName, String Address, String ContactNumber, String Semester) {
		this.FirstName= FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.ContactNumber = ContactNumber;
		this.Semester = Semester;
	}
	public String toCSV() {
		return FirstName + "," + LastName + "," + Address + "," + ContactNumber + "," + Semester;
	}
}