public class IfElseStatement{
	public static void main(String [] args){
		int age = 15;
		
		if (age >= 18){
			System.out.printf("your age is %d, you are an adult",age);
		} 
		else{
			System.out.printf("your age is %d, your are still a minor", age);
		}
	}
}