package week1;

public class qn16 {
	 public static void main(String[] args) {
		 
			boolean expr1 = (5>3);
			boolean expr2 = (8>5);
			boolean Result1 = expr1 && expr2;
			
			boolean Result2 = expr1 || expr2; 
			
			boolean Result3 = !(5==10);
			
			System.out.println("AND Result:"+ Result1);
			System.out.println("OR Result:"+ Result2);
			System.out.println("NOT Result:"+ Result3);
	 }
}