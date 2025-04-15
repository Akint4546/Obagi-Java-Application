import java.util.scanner;

public class BankingApp{
	String accountName = "Alex Ander";
	String accountNumber = "9132993218";
	double accountBalance = 980000.00
	
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
	
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		if(amount > accountBalance){
			System.out.println("Insufficient funds");
		}
		else{
			accountBalance -= amount;
		}
		
		return accountBalance;
	}
	
	public double checkBalace(){
		return accountBalance;
	}
	public static void main(String[] args){
		BankingApp bankApp = new BankingApp();
		Scanner input = new Scanner(System.in);
		
		System.out.println("welcome to access bank");
		System.out.println("Enter 1 To Deposit");
		System.out.println("Enter 2 to Withdraw");
		System.out.println("Enter 3 to checkBalace");
		System.out.println();
		
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		System.out.println();
		
		switch(choice){
			case 1:
			{
				System.out.print("enter amount to deposit: ");
				int depositAmount = input.nextInt();
				
				
				System.out.println("============================");
				
				System.out.println("Account Name: " +bankApp.accountName);
				System.out.println("Account Number: " +bankApp.accountNumber);
				System.out.printf("Initial Balance: %c%.2f%n",'$' +bankApp.accountBalance);
				
				
				bankApp.deposit(depositAmount);
				System.out.println("Yout balance is %c%.2f%n",'$',bankApp.checkBalace);
				System.out.println("============================");
				
			}
			break;
			
			case 2:
			{
				System.out.print("enter amount to withdraw: ");
				int depositAmount = input.nextInt();
				
				
				System.out.println("============================");
				
				System.out.println("Account Name: " +bankApp.accountName);
				System.out.println("Account Number: " +bankApp.accountNumber);
				System.out.printf("Initial Balance: %c%.2f%n",'$' +bankApp.accountBalance);
				
				
				bankApp.deposit(withdrawalAmount);
				System.out.println("Yout balance is %c%.2f%n",'$',bankApp.checkBalace);
				System.out.println("============================");
				
			}
			break;
			
			case 3:
			{
				System.out.println("Yout balance is %c%.2f%n",'$',bankApp.checkBalace);
				System.out.println("============================");
				
			}
			break;
			
			default;
		}
		
	}
}