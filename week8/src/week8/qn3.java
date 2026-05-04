package week8;
import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class qn3 {

	public static void main(String[] args) {
		
		qn3 obj = new qn3();
		
		List<Integer> numbers = obj.read("file/numbers.txt");
		
		List<Integer> evenNumbers = obj.getEven(numbers);
		List<Integer> oddNumbers = obj.getOdd(numbers);
		
		obj.write(oddNumbers, "file/oddNum.txt");
		obj.write(evenNumbers, "file/evenNum.txt");
		
		System.out.println("The Odd and Even numbers have been saved.");
		
	}
	
	
	public List<Integer> read(String filePath){
		
		List<Integer> numbers = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String line = br.readLine();
			 if (line!=null) {
				 
				 String[] parts = line.trim().split("\\s+");
				 for (String num: parts) {
					 numbers.add(Integer.parseInt(num));
				 }
			 }
			 br.close();
		}
		catch (IOException e) {
			System.out.println("There has been an error");
			e.printStackTrace();
		}
		return numbers;
	}
	
	
	public List<Integer> getEven(List<Integer> numbers) {
		List<Integer> even = new ArrayList<>();
		
		for (int num: numbers) {
			if (num%2==0) {
				even.add(num);
			}
		}
		return even;
	}
	
	public List<Integer> getOdd(List<Integer> numbers) {
		List<Integer> odd = new ArrayList<>();
		
		for (int num: numbers) {
			if (num%2!=0) {
				odd.add(num);
			}
		}
		return odd;
	}
	
	public void write(List<Integer> numbers, String filePath) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
			for (int num: numbers) {
				bw.write(num+" ");
				
			}
			bw.close();
		}
		catch (IOException e) {
			System.out.println("There has been an error");
			e.printStackTrace();
		}
	}
	
}