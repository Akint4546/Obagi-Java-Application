import java.util.Scanner;

public class NumberSum{
	public static void main(String [] args){
		Scanner scan = new Scanner (system.in);
		
		int sumOf6_9 = 0;
		int sumOf4_10 = 0;
		int difference;
		for (int i = 1; i <= 10; i++){
			system.out.printf("Enter num%d: ",i);
			int num = input.nextInt();
			
			
			if(i > = 6 && i <= 9){
				sumOf6_9 += num
			}
			if(i > = 4 && i <= 10){
				sumOf4_10 += num
		}
		difference = sumOf4_10 - sumOf6_9;
		
		System.out.printf("The difference is %d",difference);
	}
}