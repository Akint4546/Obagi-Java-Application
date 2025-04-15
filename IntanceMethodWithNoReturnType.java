public class StaticMethodWithNoReturntType{
	public static void main(String[] args){
		IntanceMethodWithNoReturnType.addition();
	}
	
	public static void addition(){
		int num1 = 50;
		int num2 = 17;
		
		ins sum = num1 + num2;
		
		System.out.printf("The sum is %d%n",sum);
	}
}