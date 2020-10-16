import java.util.Scanner;

class BankAccount{
	private String Name;
	private long AccountNumber;
	private String TypeAc;
	private double Balance;
	
	public BankAccount(){
		AccountNumber = 0;
		Balance = 0;
		Name = TypeAc = null;
	}
	public BankAccount(String Name, long AccountNumber, String TypeAc, double Balance){
		this.Name = Name;
		this.AccountNumber = AccountNumber;
		this.TypeAc = TypeAc;
		this.Balance = Balance;
	}
	
	public void setTypeOfAc(String TypeOfAc){TypeAc = TypeOfAc;}
	public void setBalance(double Balance){this.Balance = Balance;}
	
	public String getName(){return Name;}
	public String getTypeOfAc(){return TypeAc;}
	public long getAccountNumber(){return AccountNumber;}
	public double getBalance(){return Balance;}
	
	public void depositAmmt(double amt){
		Balance += amt;
	}
	public void withdrawAmmt(double wamt){
		if(wamt<Balance){
			Balance = Balance-wamt;
		}
		else
			System.out.println("Insufficient Balance...");
	}
	
	public void display(){
		System.out.print("Name: "+Name+"\n"+"Account Number: "+AccountNumber+"\n"+"Balance: "+Balance+"\n");
	}

}

class bank{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = sc.next();
		System.out.print("Enter Account Number: ");
		long ac = sc.nextLong();
		System.out.print("Enter Type of your Account: ");
		String toa = sc.next();
		System.out.print("Enter the Ammount: ");
		double am = sc.nextDouble();
		BankAccount ba = new BankAccount(name,ac,toa,am);
		while(true){
			System.out.println("Enter>>>>\n1: Withdraw\n2: Deposit\n3: Display\n4: Exit\n");
			int ch = sc.nextInt();
			
			switch(ch){
				case 1: System.out.print("Enter Ammount: ");
					double amout = sc.nextDouble();
					ba.withdrawAmmt(amout);
					double res = ba.getBalance();
					System.out.println("Available Balance: "+res);
					break;
				case 2: System.out.print("Enter Ammount: ");
					double amout2 = sc.nextDouble();
					ba.depositAmmt(amout2);
					double res2 = ba.getBalance();
					System.out.println("Available Balance: "+res2);
					break;
				case 3: ba.display();
					break;
				case 4: System.out.println("Thank You..");
					return;
					
				default: System.out.println("Wrong Input...");
					 break;
					
			}
		}		
	}
}