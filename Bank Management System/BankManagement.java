//User Registration management system


import java.util.*;
interface Account {
    void deposit();
    void withdraw();
    void displayBalance(); 
    boolean bankDetails();
}





public class BankManagement implements Account {
    private long accountNumber=1234567890;
    private double balance=1000;
    private double amount;
    int PIN=9876;
	
     Scanner s=new Scanner(System.in);



   public boolean bankDetails()
{

	System.out.println("Enter your account number:");
         long accountN = s.nextLong();
	System.out.println("Enter your PIN:");
         int pin = s.nextInt();

	if(accountN==accountNumber && pin==PIN)
	{
	return true;
	}
	

	else{
	System.out.println("Your account number or PIN is incorrect.");
	return false;
	}
}



 
    public void deposit()
 {
	if(bankDetails())
	{
	System.out.println("Enter amount you have to deposit:");
	 amount= s.nextDouble();

        balance += amount;
        System.out.println("Deposited amount: " + amount);
	System.out.println("Your Current Balance is: " + balance);}

	else{
	System.out.println("This is not accessible.");}
	
	System.out.println("Thankyou!! Your session is end now.'-' ");

	
 }

    
    public void withdraw()

 {
	if(bankDetails())
	{
		System.out.println("Enter amount you have to withdraw:");
		double amount= s.nextDouble();

        	if (amount <= balance) {
           	 balance -= amount;
            	System.out.println("Withdraw amount is: " + amount);
		System.out.println("Your Current Balance is: " + balance);			
        	}

	 	else {
            	System.out.println("Insufficient Balance in your account.");
        	}
	}
	
	else{
	System.out.println("This is not accessible.");}

 	System.out.println("Thankyou!! Your session is end now.'-' ");

}

   
    public void displayBalance() 
{

        
	if(bankDetails())
	{
	System.out.println("Your Account Number is: " + accountNumber);
	System.out.println("Your Current Balance is: " + balance);}
	
	else
	{
	System.out.println("Balance cannot be shown as your PIN is incorrect");
	}

	System.out.println("Thankyou!! Your session is end now.'-' ");
    
}
}






class Main {

    public static void main(String[] args) {

        BankManagement obj = new BankManagement();

        Scanner s=new Scanner(System.in);
        System.out.println("Choose your Service option:");

	System.out.println("1: Deposit Money");
	System.out.println("2: Withdraw Money");
	System.out.println("3: Show Balance");
	int choice=s.nextInt();

       switch(choice){
	case 1:
		obj.deposit();
		break;
	case 2:
		obj.withdraw();
		break;
	case 3:
		obj.displayBalance(); 
		break;
	default:
		System.out.println("Choose your Service option, else your session is closed.");
	}
		


}
}

