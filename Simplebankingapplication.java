import java.util.Scanner;

public class Simplebankingapplication{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1=new BankAccount ("Indian Bank","IDIB000N034");
		obj1.showMenu();
		
      }
	}
     class BankAccount
    {
	long balance;
	long previousTransaction;
	String customerName;
	String customerId;
	
      BankAccount(String cname, String cid)
    {
		customerName= cname;
		customerId= cid;
	}
    
	void  deposit (int amount)
    {
		
	if (amount!= 0)	
	{ 
		balance= balance+amount;
		previousTransaction= amount;
	
	}
   }
	 void withdrawl()
	 {
		 long amount;
		 System.out.println("enter the amount you want to withdraw:");
		 Scanner sc = null;
		amount=sc.nextLong();
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println(" balance after withdrawl:"+balance);		
		}
		else
		{
			System.out.println("your balance is less than"+ amount +"\n transaction is failed");
		}
		 
     }
	
    void getpreviousTransaction()
    {
	if(previousTransaction > 0)
	{
		System.out.println("Deposited: "+previousTransaction);
		
	}
	else if(previousTransaction < 0)
	{
		System.out.println("withdrawn: "+Math.abs(previousTransaction));
	}
	else
	{
		System.out.println("No transaction occured");
	}	
  }
    
	void showMenu()
	{
		int option;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("Your Id is "+customerId);
		System.out.println("\n");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Previous transaction");
		System.out.println("5. Exit");
		
		do
		{
			System.out.println("*************************************************************************");
			System.out.println("Enter an option");
			System.out.println("*************************************************************************");
			option=scanner.nextInt();
			System.out.println("\n");
		
		switch(option)
		
		{
			case 1:
				
				System.out.println("**********************************************************************");
				System.out.println("Balance="+balance);
				System.out.println("**********************************************************************");
				System.out.println("\n");
                break;				
		
			case 2:
				
				System.out.println("**********************************************************************");
				System.out.println("Enter an amount to deposit:");
				System.out.println("**********************************************************************");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 3:
				
				System.out.println("***********************************************************************");
				System.out.println("Enter an amount to withdraw");
				System.out.println("***********************************************************************");
				int amount2 = scanner.nextInt();
				withdraw1(amount2);
				System.out.println("\n");
				break;
				
			case 4:
				
				System.out.println("**********************************************************************");
				getpreviousTransaction();
				System.out.println("**********************************************************************");
				System.out.println("\n");
				break;
				
			case 5:
				System.out.println("**********************************************************************");
				break;
				
				
				default:
					System.out.println("Invalid Option!!.please enter again");
					break;
		
		    }
		
	        } while(option != 'E');
		
		    System.out.println("Thank for using our services");
		    
	        }

	private void withdraw1(int amount2) {
		// TODO Auto-generated method stub
		
	}
     }
				
		
		
		
		
	


