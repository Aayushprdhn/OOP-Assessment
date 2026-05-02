package week8;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class qn1 {
	public static void main(String[] args) {
		
		try 
			(BufferedInputStream bi = new BufferedInputStream(new FileInputStream("file/one.txt"));
			BufferedOutputStream ou = new BufferedOutputStream(new FileOutputStream("file/two.txt"));
			){
		
			int data;
			while((data = bi.read()) != -1) {
				ou.write(data);
			}
			ou.flush();
			System.out.println("File is copied");
		} catch(IOException e){
			System.out.println("Error occured: " + e.getMessage());
		}	
	}
}
