package week3wok;

public class qn2 {
	public static void main(String[] args){
		double [] num = {20.1,11.5,12.1,25.9};
		int size = num.length;
		double sum =0;
		for(int i = 0; i< size;i++) {
			sum += num[i];
		}
		System.out.println("The sum is: "+sum);
		double average = sum/size;
		System.out.println("The average is: "+average);
	}
}